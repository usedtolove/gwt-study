package com.train.client.application.contact;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class ContactView extends ViewImpl implements ContactPresenter.MyView {
    interface Binder extends UiBinder<Widget, ContactView> {
    }

    @UiField
    Label navigationHistory;

    @Inject
    ContactView(Binder binder) {
        initWidget(binder.createAndBindUi(this));
    }

    @Override
    public void setNavigationHistory(String navigationHistory) {
        this.navigationHistory.setText(navigationHistory);
    }
}
