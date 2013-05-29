package com.mycompany.sg.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.types.ContentsType;
import com.smartgwt.client.types.DSDataFormat;
import com.smartgwt.client.types.DSOperationType;
import com.smartgwt.client.types.DSProtocol;
import com.smartgwt.client.util.JSON;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.HTMLPane;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.events.RecordClickEvent;
import com.smartgwt.client.widgets.grid.events.RecordClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

import com.google.gwt.core.client.EntryPoint;

public class RestDemo implements EntryPoint {

    private HTMLPane htmlPane;

    public void onModuleLoad() {
        htmlPane = new HTMLPane();
        htmlPane.setWidth(500);
        htmlPane.setHeight(30);

        VLayout layout = new VLayout(15);
        layout.setAutoHeight();

        final RestDataSource userDataSource = new RestDataSource() {
            @Override
            protected Object transformRequest(DSRequest dsRequest) {
                return super.transformRequest(dsRequest);
            }
            @Override
            protected void transformResponse(DSResponse response, DSRequest request, Object data) {
                super.transformResponse(response, request, data);
                int startRow = response.getStartRow();
                int endRow = response.getEndRow();
                int totalRow = response.getTotalRows();
                endRow = Math.min(endRow,totalRow);
                if(endRow != 0){
                    htmlPane.setContents("Fetching data from <b>"+startRow+"</b> to <b>"+endRow+"</b>, total is  <b>"+totalRow+"</b>");
                }
            }
        };
        userDataSource.setDataFormat(DSDataFormat.JSON);

        DataSourceTextField idField = new DataSourceTextField("id", "ID");
        OperationBinding fetch = new OperationBinding();
        fetch.setOperationType(DSOperationType.FETCH);
        fetch.setDataProtocol(DSProtocol.POSTMESSAGE);//无需设置GET请求，使用默认POST用来提交JSON

        OperationBinding add = new OperationBinding();
        add.setOperationType(DSOperationType.ADD);
        add.setDataProtocol(DSProtocol.POSTMESSAGE);

        OperationBinding update = new OperationBinding();
        update.setOperationType(DSOperationType.UPDATE);
        update.setDataProtocol(DSProtocol.POSTMESSAGE);
        DSRequest updateReq = new DSRequest();
        updateReq.setHttpMethod("PUT");
        update.setRequestProperties(updateReq);

        OperationBinding remove = new OperationBinding();
        remove.setOperationType(DSOperationType.REMOVE);
        remove.setDataProtocol(DSProtocol.POSTMESSAGE);
//        remove.setDataProtocol(DSProtocol.GETPARAMS); //将参数写在url上，用&分开
//        remove.setDataProtocol(DSProtocol.POSTPARAMS);//将参数写在URL上，用空格分开

        userDataSource.setOperationBindings(fetch, add, update, remove);

        idField.setPrimaryKey(true);
        idField.setCanEdit(false);

        DataSourceTextField nameField = new DataSourceTextField("name", "Name");
        DataSourceTextField locField = new DataSourceTextField("location", "Location");

        userDataSource.setFields(idField, nameField, locField);

        final String moduleBase = GWT.getModuleBaseURL();
        userDataSource.setFetchDataURL(moduleBase + "../services/rest/users/fetch");
        userDataSource.setAddDataURL(moduleBase + "../services/rest/users/add");
        userDataSource.setUpdateDataURL(moduleBase + "../services/rest/users/update");
        userDataSource.setRemoveDataURL(moduleBase + "../services/rest/users/remove");

        final ListGrid listGrid = new ListGrid();
        listGrid.setWidth(500);
        listGrid.setHeight(224);

        listGrid.setDataSource(userDataSource);
        listGrid.setEmptyCellValue("--");

        listGrid.setSortField(0);
        listGrid.setDataPageSize(20);
//        countryGrid.setAutoFetchData(true);

        layout.addMember(listGrid);
        layout.addMember(htmlPane);

        //User DynamicForm
        final DynamicForm dynamicForm = new DynamicForm();
        dynamicForm.setDataSource(userDataSource);

        HLayout hLayout = new HLayout(15);

        //Event listeners....
        listGrid.addRecordClickHandler(new RecordClickHandler() {
            @Override
            public void onRecordClick(RecordClickEvent recordClickEvent) {
                dynamicForm.editRecord(recordClickEvent.getRecord());
            }
        });

        final IButton fetchButton = new IButton("Fetch");
        fetchButton.setWidth(80);
        fetchButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent clickEvent) {
                listGrid.invalidateCache();
                listGrid.fetchData();
            }
        });
        hLayout.addMember(fetchButton);

        final IButton resetButton = new IButton("Reset");
        resetButton.setWidth(80);
        resetButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent clickEvent) {
                dynamicForm.clearValues();
            }
        });
        hLayout.addMember(resetButton);

        final IButton addButton = new IButton("Add");
        addButton.setWidth(80);
        addButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                String id = dynamicForm.getValueAsString("id");
                String name = dynamicForm.getValueAsString("name");
                String location = dynamicForm.getValueAsString("location");
                if(id != null){
                    SC.say("Form need reset first!");
                    return;
                }
                if(name == null || location == null){
                    SC.warn("Name and Location can be blank!");
                    return;
                }else{
                    dynamicForm.setSaveOperationType(DSOperationType.ADD);
                    dynamicForm.saveData(new DSCallback() {
                        @Override
                        public void execute(DSResponse dsResponse, Object o, DSRequest dsRequest) {
                            if(dsResponse.getStatus()==0){
                                dynamicForm.clearValues();
//                                listGrid.invalidateCache();
//                                listGrid.fetchData();
                            }
                        }
                    });
                }
            }
        });
        hLayout.addMember(addButton);

        final IButton updateButton = new IButton("Update");
        updateButton.setWidth(80);
        updateButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                dynamicForm.setSaveOperationType(DSOperationType.UPDATE);
                Record record = dynamicForm.getValuesAsRecord();
                listGrid.updateData(record);
            }
        });
        hLayout.addMember(updateButton);

        final IButton removeButton = new IButton("Remove");
        removeButton.setWidth(80);
        removeButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                Record record = listGrid.getSelectedRecord();
                listGrid.removeData(record,new DSCallback() {
                    @Override
                    public void execute(DSResponse dsResponse, Object o, DSRequest dsRequest) {
                        if(dsResponse.getStatus()==0){
                            dynamicForm.clearValues();
                        }
                    }
                });
            }
        });
        hLayout.addMember(removeButton);
        layout.addMember(hLayout);
        layout.addMember(dynamicForm);

        layout.draw();
    }
}
