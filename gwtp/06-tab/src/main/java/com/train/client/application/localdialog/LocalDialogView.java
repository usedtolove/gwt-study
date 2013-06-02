package com.train.client.application.localdialog;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;

/**
 * The view implementation for
 * {@link LocalDialogPresenterWidget}.
 */
public class LocalDialogView extends PopupViewImpl implements LocalDialogPresenterWidget.MyView {
    interface Binder extends UiBinder<PopupPanel, LocalDialogView> {
    }

    @UiField
    Button okButton;

    @Inject
    LocalDialogView(Binder uiBinder,
                    EventBus eventBus) {
        super(eventBus);

        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("okButton")
    void okButtonClicked(ClickEvent event) {
        hide();
    }
}
