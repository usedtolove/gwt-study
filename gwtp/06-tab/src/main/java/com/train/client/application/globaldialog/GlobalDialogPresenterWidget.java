package com.train.client.application.globaldialog;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.proxy.NavigationEvent;
import com.gwtplatform.mvp.client.proxy.NavigationHandler;

/**
 * The {@link PresenterWidget} of a dialog box that is meant to be displayed no matter which presenter is visible.
 * Compare to {@link com.train.client.application.localdialog.LocalDialogPresenterWidget}.
 */
public class GlobalDialogPresenterWidget extends PresenterWidget<GlobalDialogPresenterWidget.MyView> implements
        NavigationHandler {
    public interface MyView extends PopupView {
        void setNavigationPlace(String placeName);
    }

    private HandlerRegistration handlerRegistration;

    @Inject
    GlobalDialogPresenterWidget(EventBus eventBus,
                                MyView view) {
        super(eventBus, view);
    }

    @Override
    public void onReveal() {
        super.onReveal();
        getView().setNavigationPlace(null);
        unregisterNavigationHandler(); // Be on the safe side
        handlerRegistration = addHandler(NavigationEvent.getType(), this);
    }

    @Override
    public void onHide() {
        super.onHide();
        unregisterNavigationHandler();
    }

    @Override
    public void onNavigation(NavigationEvent navigationEvent) {
        getView().setNavigationPlace(navigationEvent.getRequest().getNameToken());
    }

    private void unregisterNavigationHandler() {
        if (handlerRegistration != null) {
            handlerRegistration.removeHandler();
            handlerRegistration = null;
        }
    }
}
