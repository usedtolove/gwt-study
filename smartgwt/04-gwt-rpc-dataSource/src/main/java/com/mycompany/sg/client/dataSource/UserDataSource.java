package com.mycompany.sg.client.dataSource;

import com.google.gwt.core.client.GWT;
import com.mycompany.sg.client.lib.GenericGwtRpcDataSource;
import com.mycompany.sg.client.service.UserServiceRPC;
import com.mycompany.sg.client.service.UserServiceRPCAsync;
import com.mycompany.sg.shared.dto.UserDto;
import com.smartgwt.client.data.DataSourceField;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.widgets.grid.ListGridRecord;

import java.util.ArrayList;
import java.util.List;

//@Singleton
public class UserDataSource extends GenericGwtRpcDataSource<UserDto, Record, UserServiceRPCAsync> {

    private UserDataSource() {
        System.out.println("UserDataSource 空参构造被调用!");
    }

    private static UserDataSource instance;

    public static UserDataSource getInstance(){
        if(instance==null){
            instance = new UserDataSource();
        }
        return instance;
    }

    @Override
    public void copyValues(Record from, UserDto to) {
        to.setId(from.getAttributeAsString("id"));
        to.setName(from.getAttribute("name"));
        to.setLocation(from.getAttribute("location"));
    }

    @Override
    public void copyValues(UserDto from, Record to) {
        to.setAttribute("id", from.getId());
        to.setAttribute("name", from.getName());
        to.setAttribute("location", from.getLocation());
    }

    @Override
    public List<DataSourceField> getDataSourceFields() {

        List<DataSourceField> fields = new ArrayList<DataSourceField>();

        DataSourceTextField idField = new DataSourceTextField("id");
        idField.setHidden(true);
        idField.setPrimaryKey(true);
        fields.add(idField);

        DataSourceTextField nameField = new DataSourceTextField("name", "Name");
        nameField.setRequired(true);
        fields.add(nameField);

        DataSourceTextField locationField = new DataSourceTextField("location", "Location");
        locationField.setRequired(true);
        fields.add(locationField);

        return fields;
    }

    @Override
    public UserDto getNewDataObjectInstance() {
        return new UserDto();
    }

    public Record getNewRecordInstance() {
        return new ListGridRecord();
    }

    @Override
    public UserServiceRPCAsync getServiceAsync() {
        return GWT.create(UserServiceRPC.class);
    }

}
