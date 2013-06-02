package com.train.client.application.infopopup;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;

/**
 * The view implementation for {@link InfoPopupPresenterWidget}
 */
public class InfoPopupView extends PopupViewImpl implements InfoPopupPresenterWidget.MyView {
    interface Binder extends UiBinder<PopupPanel, InfoPopupView> {
    }

    @Inject
    InfoPopupView(Binder uiBinder,
                  EventBus eventBus) {
        super(eventBus);

        initWidget(uiBinder.createAndBindUi(this));
    }
}
