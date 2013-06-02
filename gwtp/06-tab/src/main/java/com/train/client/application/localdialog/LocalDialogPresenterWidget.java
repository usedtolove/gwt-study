package com.train.client.application.localdialog;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;

/**
 * The {@link PresenterWidget} of a dialog box that is meant to be displayed only when its parent presenter is visible.
 * Compare to {@link com.train.client.application.globaldialog.GlobalDialogPresenterWidget}.
 */
public class LocalDialogPresenterWidget extends PresenterWidget<LocalDialogPresenterWidget.MyView> {
    /**
     * {@link LocalDialogPresenterWidget}'s PopupView.
     */
    public interface MyView extends PopupView {
    }

    @Inject
    LocalDialogPresenterWidget(EventBus eventBus,
                               MyView view) {
        super(eventBus, view);
    }
}
