package com.train.client.application.globaldialog;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

/**
 * The view implementation for
 * {@link com.train.client.application.localdialog.LocalDialogSubTabPresenter}.
 */
public class GlobalDialogSubTabView extends ViewWithUiHandlers<GlobalDialogSubTabUiHandlers> implements
        GlobalDialogSubTabPresenter.MyView {
    interface Binder extends UiBinder<Widget, GlobalDialogSubTabView> {
    }

    @UiField
    Button globalDialog;
    @UiField
    Anchor popupLink;

    @Inject
    GlobalDialogSubTabView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("globalDialog")
    void onGlobalClicked(ClickEvent event) {
        getUiHandlers().showGlobalDialog();
    }

    @UiHandler("popupLink")
    void onPopupLinkClicked(MouseDownEvent event) {
        getUiHandlers().showInfoPopup(event.getClientX(), event.getClientY());
    }
}
