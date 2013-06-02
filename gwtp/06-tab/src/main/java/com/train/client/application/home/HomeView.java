package com.train.client.application.home;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Tab;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.ViewImpl;
import com.train.client.application.ui.tabs.SimpleTabPanel;

/**
 * The view implementation for {@link .HomePresenter}.
 */
public class HomeView extends ViewImpl implements HomePresenter.MyView {
    interface Binder extends UiBinder<Widget, HomeView> {
    }

    @UiField(provided = true)
    SimpleTabPanel tabPanel;

    @Inject
    HomeView(Binder uiBinder,
             SimpleTabPanel tabPanel) {
        this.tabPanel = tabPanel;

        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public Tab addTab(TabData tabData, String historyToken) {
        return tabPanel.addTab(tabData, historyToken);
    }

    @Override
    public void removeTab(Tab tab) {
        tabPanel.removeTab(tab);
    }

    @Override
    public void removeTabs() {
        tabPanel.removeTabs();
    }

    @Override
    public void setActiveTab(Tab tab) {
        tabPanel.setActiveTab(tab);
    }

    @Override
    public void changeTab(Tab tab, TabData tabData, String historyToken) {
        tabPanel.changeTab(tab, tabData, historyToken);
    }

    @Override
    public void setInSlot(Object slot, IsWidget content) {
        if (slot == HomePresenter.TYPE_SetTabContent) {
            tabPanel.setPanelContent(content);
        } else {
            super.setInSlot(slot, content);
        }
    }
}
