package com.train.client.application.infopopup;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;

/**
 * The {@link PresenterWidget} of a simple popup box that is dismissed as soon as the user clicks outside of it or
 * navigates.
 */
public class InfoPopupPresenterWidget extends PresenterWidget<InfoPopupPresenterWidget.MyView> {
    /**
     * {@link InfoPopupPresenterWidget}'s view.
     */
    public interface MyView extends PopupView {
    }

    @Inject
    InfoPopupPresenterWidget(EventBus eventBus,
                             MyView view) {
        super(eventBus, view);
    }
}
