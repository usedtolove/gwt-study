package com.train.client.application.common;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.train.client.images.ExampleImages;

/**
* User: Hu Jing Ling
* Date: 2013-6-4
*/
public class BodyView extends ViewWithUiHandlers<BodyUiHandlers> implements BodyPresenter.MyView {

    @UiField
    TabPanel tab;

    private int index = 0;

    public interface Binder extends UiBinder<Widget, BodyView> {
    }

    @Inject
    public BodyView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void addItem(String name,PresenterWidget pw) {
        int totalItem = tab.getWidgetCount();
//        System.out.println("totalItem:"+ totalItem);
        if(totalItem == 0){
//            Label item = new Label("Tab Body " +name);
//            ContentPanel contentPanel = new ContentPanel();
//            contentPanel.setHeight(100);
//            contentPanel.setWidth(100);
            TabItemConfig tif =  new TabItemConfig(name, true);
            tif.setIcon(ExampleImages.INSTANCE.application());
//            tab.add(contentPanel, tif);
            tab.add(pw.getView(),tif);
            tab.setActiveWidget(pw);
        }else{
            for (int i = 0; i < totalItem; i++) {
                Widget w = tab.getWidget(i);
                TabItemConfig config = tab.getConfig(w);
                System.out.println(config.getText());
                if(config.getText().equals(name)){
                    tab.setActiveWidget(w);
                    break;
                }
                if(i==totalItem-1){
                    Label item = new Label("Tab Body " +name);
                    TabItemConfig tif =  new TabItemConfig(name, true);
                    tif.setIcon(ExampleImages.INSTANCE.application());
                    tab.add(item, tif);
                    tab.setActiveWidget(item);
                }
            }
        }
//        System.out.println("=============");
    }

}