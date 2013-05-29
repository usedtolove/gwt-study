package com.mycompany.study;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.PropertyId;
import com.vaadin.data.util.BeanItem;
import com.vaadin.server.UserError;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

import java.util.Map;

/**
 * UserDto Form UI
 */
public class UserForm extends FormLayout {

    private  FieldGroup fieldGroup;

    @PropertyId("name")
    TextField nameField = new TextField("Name");

    @PropertyId("age")
    TextField ageField = new TextField("Age");

    public UserForm() {
        setMargin(true);
        setSpacing(true);
        setImmediate(true);

        nameField.setInputPrompt("name value");
        nameField.setNullRepresentation("");
        nameField.setImmediate(true);
        addComponent(nameField);

        ageField.setInputPrompt("age value");
        ageField.setNullRepresentation("");
        ageField.setImmediate(true);
        addComponent(ageField);

        UserDto userDto = new UserDto(); // a userDto POJO
        BeanItem<UserDto> beanItem = new BeanItem<UserDto>(userDto); // item from POJO
        fieldGroup = new FieldGroup(beanItem);
        fieldGroup.bindMemberFields(this);
        fieldGroup.setBuffered(true);
    }

    public FieldGroup getFieldGroup(){
        return fieldGroup;
    }

    public void clear(){
        nameField.setValue(null);
        ageField.setValue(null);
        nameField.setComponentError(null);
        ageField.setComponentError(null);
    }

    public boolean isValid(){
        return  nameField.isValid() && ageField.isValid();
    }

    public UserDto getCurrentValue() {
        String name = (String)  fieldGroup.getField("name").getValue();
        String age = (String)  fieldGroup.getField("age").getValue();
        UserDto userDto = new UserDto();
        userDto.setName(name);
        userDto.setAge(age);
        return userDto;
    }

    public void showError(Map<String, String> map) {
        if(map.get("name") != null){
            TextField nameField = (TextField)  fieldGroup.getField("name");
            nameField.setComponentError(new UserError(map.get("name")));
        }
        if(map.get("age") != null){
            TextField ageFiled = (TextField)  fieldGroup.getField("age");
            ageFiled.setComponentError(new UserError(map.get("age")));
        }
    }
}
