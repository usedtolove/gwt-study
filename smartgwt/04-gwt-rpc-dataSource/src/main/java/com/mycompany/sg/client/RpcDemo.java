package com.mycompany.sg.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.mycompany.sg.client.dataSource.UserDataSource;
import com.smartgwt.client.core.KeyIdentifier;
import com.smartgwt.client.types.FetchMode;
import com.smartgwt.client.types.ListGridEditEvent;
import com.smartgwt.client.util.KeyCallback;
import com.smartgwt.client.util.Page;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class RpcDemo implements EntryPoint {

    public void onModuleLoad() {
        Canvas canvas = new Canvas();

        final ListGrid listGrid = new ListGrid();
        listGrid.setWidth(550);
        listGrid.setHeight(200);
        listGrid.setCellHeight(22);
        listGrid.setDataSource(UserDataSource.getInstance());

        ListGridField nameField = new ListGridField("name", "Name");
        ListGridField locationField = new ListGridField("location", "Location");
        listGrid.setFields(nameField, locationField);

        listGrid.setAutoFetchData(true);
        listGrid.setDataFetchMode(FetchMode.PAGED);
        listGrid.setShowAllRecords(false);
        listGrid.setDataPageSize(10);
        listGrid.setCanEdit(true);
        listGrid.setShowFilterEditor(true);
        listGrid.setEditEvent(ListGridEditEvent.DOUBLECLICK);

        IButton addRow = new IButton("Add new row");
        addRow.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                ListGridRecord rec = new ListGridRecord();
                rec.setAttribute("name", "yourName");
                rec.setAttribute("location", "yourLocation");
                listGrid.addData(rec);
            }
        });
        addRow.setLeft(0);
        addRow.setTop(240);
        addRow.setWidth(140);

        IButton removeAll = new IButton("Remove All Selected");
        removeAll.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                ListGridRecord[] selectedRecords = listGrid.getSelection();
                for (ListGridRecord rec : selectedRecords) {
                    listGrid.removeData(rec);
                }
            }
        });
        removeAll.setLeft(320);
        removeAll.setTop(240);
        removeAll.setWidth(140);

        canvas.addChild(listGrid);
        canvas.addChild(addRow);
        canvas.addChild(removeAll);

        canvas.draw();

        // for debugging only, shows the developer console when hitting CTRL + ALT + C.
        if (!GWT.isScript()) {
            KeyIdentifier debugKey = new KeyIdentifier();
            debugKey.setCtrlKey(true);
            debugKey.setAltKey(true);
            debugKey.setKeyName("C"); //short for console
            Page.registerKey(debugKey, new KeyCallback() {
                public void execute(String keyName) {
                    SC.showConsole();
                }
            });
        }
    }
}
