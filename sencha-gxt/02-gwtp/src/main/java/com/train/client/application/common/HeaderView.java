package com.train.client.application.common;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.widget.core.client.Dialog;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;

/**
* User: Hu Jing Ling
* Date: 2013-6-4
*/
public class HeaderView extends ViewWithUiHandlers<HeaderUiHandlers> implements HeaderPresenter.MyView {

    @UiField
    TextButton btn1;

    public interface Binder extends UiBinder<Widget, HeaderView> {
    }

    @Inject
    public HeaderView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("btn1")
    void onSelect(SelectEvent event){
        getUiHandlers().selectModule(btn1.getText());
    }

}