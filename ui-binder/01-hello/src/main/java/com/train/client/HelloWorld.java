package com.train.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.UIObject;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-29
 * Time: 下午4:50
 */
public class HelloWorld extends UIObject {
    interface MyUiBinder extends UiBinder<DivElement, HelloWorld> {}
    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    SpanElement nameSpan;

    public HelloWorld() {
        setElement(uiBinder.createAndBindUi(this));
    }

    public void setName(String name) { nameSpan.setInnerText(name); }
}
