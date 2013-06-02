package com.train.client.application.homenews;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.train.client.resources.AppConstants;
import com.train.client.resources.AppMessages;
import com.train.client.resources.AppResources;

/**
 * The view implementation for {@link HomeNewsPresenter} .
 */
public class HomeNewsView extends ViewWithUiHandlers<HomeNewsUiHandler> implements HomeNewsPresenter.MyView {
    interface Binder extends UiBinder<Widget, HomeNewsView> {
    }

    @UiField(provided = true)
    AppResources resources;
    @UiField
    Anchor confirmationLink;
    @UiField
    HTML orderText;
    @UiField
    HTML gwtpTitle;

    private final AppConstants appConstants;
    private final AppMessages appMessages;

    @Inject
    HomeNewsView(Binder uiBinder,
                 AppResources resources,
                 AppConstants appConstants,
                 AppMessages appMessages) {
        this.resources = resources;
        this.appConstants = appConstants;
        this.appMessages = appMessages;

        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setConfirmationText(String text) {
        confirmationLink.setText(text);
    }

    @UiHandler("confirmationLink")
    public void onClick(ClickEvent clickEvent) {
        getUiHandlers().toggleConfirmation();
    }

    @Override
    public void display() {
        String orderNumberOf = appMessages.iWillOrderNumberOf(5);
        orderText.setText(orderNumberOf);

        String gwtpTitle = appConstants.gwtpPlatformTitle();
        this.gwtpTitle.setText(gwtpTitle);
    }
}
