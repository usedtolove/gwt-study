package com.train.client.application.globaldialog;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;

/**
 * The view implementation for
 * {@link GlobalDialogPresenterWidget} .
 */
public class GlobalDialogView extends PopupViewImpl implements GlobalDialogPresenterWidget.MyView {
    /**
     */
    interface Binder extends UiBinder<PopupPanel, GlobalDialogView> {
    }

    @UiField
    Button okButton;
    @UiField
    Label navigationMessage;

    @Inject
    GlobalDialogView(Binder uiBinder,
                     EventBus eventBus) {
        super(eventBus);

        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setNavigationPlace(String placeName) {
        if (placeName == null) {
            navigationMessage.setText("");
        } else {
            navigationMessage.setText("Looks like you just navigated to '" + placeName + "'.");
        }
    }

    @UiHandler("okButton")
    void okButtonClicked(ClickEvent event) {
        hide();
    }
}
