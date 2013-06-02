package com.train.client.application;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.widget.core.client.button.TextButton;

/**
 * User: hjl
 * Date: 2013-6-2
 */
public class ApplicationView extends ViewWithUiHandlers<ApplicationUiHandlers> implements ApplicationPresenter.MyView {

//    @UiField
//    TextButton testButton;

    //从 MainPageView.ui.xml 文件中读取布局
    interface Binder extends UiBinder<Widget,ApplicationView>{
    }

    @Inject
    public ApplicationView(Binder binder) {
        initWidget(binder.createAndBindUi(this)); //填充各 ui 组件
//        testButton.setText("Test Button");
    }

}