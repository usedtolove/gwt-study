package com.train.client.application.student;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.tree.Tree;
import com.train.client.application.common.MenuPresenter;

/**
* User: Hu Jing Ling
* Date: 2013-6-4
*/
public class TestView extends ViewWithUiHandlers<TestUiHandlers> implements TestPresenter.MyView {

//    @UiField
//    SimpleContainer testCon;
    @UiField
    Button btn;
//    @UiField
//    Label myLabel;

    public interface Binder extends UiBinder<Widget, TestView> {
    }

    @Inject
    public TestView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

//    @UiHandler("btn")
//    void onSelect(ClickEvent event){
//        getUiHandlers().buttonClick();
//    }

    @UiHandler("btn")
    void aaa(ClickEvent event){
        getUiHandlers().buttonClick();
    }

}