package com.mycompany.study;

import com.vaadin.annotations.Title;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

import java.util.Map;

/**
 * The Application's "main" class
 */
@Title("UserListDemo")
public class MyVaadinUI extends UI {

    private Table userTable;
    private UserForm userForm;

    private Button btnUpdate = new Button("Update");;
    private Button btnDelete = new Button("Delete");;
    private Button btnReset = new Button("Reset");
    private Button btnSave = new Button("Save");

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout mainLayout = new VerticalLayout();
        mainLayout.setMargin(true);
        setContent(mainLayout);

        //create userTable
        userTable = new UserTable();
        userTable.addValueChangeListener(new Property.ValueChangeListener() {
            public void valueChange(Property.ValueChangeEvent event) {
                Object itemId = userTable.getValue();
                if(itemId != null){
//                    Notification.show("you selected item:" + userTable.getValue());
                    Item item = userTable.getItem(itemId);
                    userForm.getFieldGroup().setItemDataSource(item);
                }
            }
        });
        mainLayout.addComponent(userTable);

        //create userForm
        userForm = new UserForm();
        mainLayout.addComponent(userForm);

        //create button mainLayout
        HorizontalLayout btnLayout = new HorizontalLayout();

        btnDelete.addClickListener(new Button.ClickListener() {
            public void buttonClick(Button.ClickEvent event) {
                Object itemId = userTable.getValue();
                userTable.removeItem(itemId);
                Notification.show("item:" + itemId + " has deleted!");
                userForm.clear();
            }
        });

        btnUpdate.addClickListener(new Button.ClickListener() {
            public void buttonClick(Button.ClickEvent event) {
                UserDto userDto = userForm.getCurrentValue();
                System.out.println("is going to update:" + userDto);
                Map<String,String> map = ValidationUtil.validateUser(userDto);
                if(map == null){
                    try {
                        userForm.getFieldGroup().commit();
                        userForm.clear();
                        userTable.getPropertyDataSource().setValue(null);     //clear table selected item
                        Notification.show("update success!");
                    } catch (FieldGroup.CommitException e) {
                        e.printStackTrace();
                    }
                }else{
                    userForm.showError(map);
                    Notification.show("update failed!",null , Notification.Type.WARNING_MESSAGE);
                }
            }
        });

        btnReset.addClickListener(new Button.ClickListener() {
            public void buttonClick(Button.ClickEvent event) {
                userTable.getPropertyDataSource().setValue(null);     //clear table selected item
                userForm.clear();
            }
        });

        btnSave.addClickListener(new Button.ClickListener() {
            public void buttonClick(Button.ClickEvent event) {
                UserDto userDto = userForm.getCurrentValue();
                System.out.println("is going to save:" + userDto);
                Map<String,String> map = ValidationUtil.validateUser(userDto);
                if(map == null){
                    userDto.setId(String.valueOf(System.currentTimeMillis()));
                    BeanItemContainer container = (BeanItemContainer) userTable.getContainerDataSource();
                    BeanItem<UserDto> item = container.addItemAt(0,userDto);
                    userTable.select(item);
                    userForm.clear();
                    Notification.show("create success!");
                }else{
                    userForm.showError(map);
                    Notification.show("create failed!",null , Notification.Type.WARNING_MESSAGE);
                }
            }
        });

        btnLayout.addComponent(btnUpdate);
        btnLayout.addComponent(btnDelete);
        btnLayout.addComponent(btnReset);
        btnLayout.addComponent(btnSave);

        mainLayout.addComponent(btnLayout);
    }
}
