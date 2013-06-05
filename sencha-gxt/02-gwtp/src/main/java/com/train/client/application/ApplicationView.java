package com.train.client.application;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;


/**
 * User: hjl
 * Date: 2013-6-2
 */
public class ApplicationView extends ViewWithUiHandlers<ApplicationUiHandlers> implements ApplicationPresenter.MyView {
    @UiField
    BorderLayoutContainer con;

//    @UiField(provided = true)//the field must be filled before createAndBindUi is called.
//    TreeStore store = new TreeStore<BaseDto>(new KeyProvider());;
//    @UiField
//    Tree tree;

    //从 MainPageView.ui.xml 文件中读取布局
    interface Binder extends UiBinder<Widget,ApplicationView>{
    }

    @Inject
    public ApplicationView(Binder binder) {
//        Widget w = binder.createAndBindUi(this);
//        initWidget(w);
        initWidget(binder.createAndBindUi(this));  //填充各 ui 组件
    }

    @Override
    public void setInSlot(Object slot, IsWidget content) {
        if (slot == ApplicationPresenter.HEADER_SLOT) {
            con.setNorthWidget(content, new BorderLayoutData(100));
        }else if(slot == ApplicationPresenter.MENU_SLOT){
//            con.setWestWidget(content);
            ContentPanel contentPanel = (ContentPanel) con.getWestWidget();
            contentPanel.add(content);
        }else if(slot == ApplicationPresenter.BODY_SLOT){
            con.setCenterWidget(content);
        }
        else {
            super.setInSlot(slot, content);
        }
    }

}