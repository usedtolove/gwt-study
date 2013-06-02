package com.train.client.application;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Tab;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.ViewImpl;
import com.train.client.application.ui.linkmenu.LinkMenu;
import com.train.client.application.ui.tabs.RoundTabPanel;

/**
 * The view implementation for {@link ApplicationPresenter}.
 */
public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField(provided = true)
    RoundTabPanel tabPanel;
    @UiField
    InlineLabel topMessage;
    @UiField(provided = true)
    LinkMenu linkMenu;

    @Inject
    public ApplicationView(Binder uiBinder,
                           RoundTabPanel tabPanel,
                           LinkMenu linkMenu) {
        this.tabPanel = tabPanel;
        this.linkMenu = linkMenu;

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
        if (slot == ApplicationPresenter.TYPE_SetTabContent) {
            tabPanel.setPanelContent(content);
        } else {
            super.setInSlot(slot, content);
        }
    }

    @Override
    public void refreshTabs() {
        tabPanel.refreshTabs();
    }

    @Override
    public void setTopMessage(String string) {
        if (string == null || string.length() == 0) {
            topMessage.setVisible(false);
            topMessage.setText("");
        } else {
            topMessage.setVisible(true);
            topMessage.setText(string);
        }
    }
}
