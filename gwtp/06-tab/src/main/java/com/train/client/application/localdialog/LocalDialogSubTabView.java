package com.train.client.application.localdialog;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

/**
 * The view implementation for
 * {@link LocalDialogSubTabPresenter}.
 */
public class LocalDialogSubTabView extends ViewWithUiHandlers<LocalDialogSubTabUihandlers>
        implements LocalDialogSubTabPresenter.MyView {
    interface Binder extends UiBinder<Widget, LocalDialogSubTabView> {
    }

    @UiField
    Button localDialog;

    @Inject
    LocalDialogSubTabView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("localDialog")
    void onLocalClicked(ClickEvent event) {
        getUiHandlers().showLocalDialog();
    }
}
