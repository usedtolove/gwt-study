package com.train.client.view.main;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

/**
 * User: Hu Jing Ling
 * Date: 2013-05-30
 */
public class MainPageView extends ViewWithUiHandlers<MainPageUiHandlers> implements MainPagePresenter.MyView {

    @UiField
    TextBox nameField;
    @UiField
    Button sendButton;

    //从 MainPageView.ui.xml 文件中读取布局
    interface Binder extends UiBinder<Widget,MainPageView>{
    }

    @Inject
    public MainPageView(Binder binder) {
        initWidget(binder.createAndBindUi(this)); //填充各 ui 组件
    }

    @UiHandler("sendButton")
    void onSend(ClickEvent event){
        getUiHandlers().sendName(nameField.getText());
    }

}
