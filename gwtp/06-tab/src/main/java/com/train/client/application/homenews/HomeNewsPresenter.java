package com.train.client.application.homenews;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.*;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlace;
import com.train.client.application.home.HomePresenter;
import com.train.client.place.NameTokens;
import com.train.client.resources.AppConstants;

/**
 * A sample {@link Presenter} filled with arbitrary content. It appears as a tab within {@link HomePresenter}, which is
 * itself a s tab in {@link com.train.client.application.ApplicationPresenter}.
 * <p/>
 * It demonstrates the option 3 described in {@link TabInfo}.
 */
public class HomeNewsPresenter extends Presenter<HomeNewsPresenter.MyView, HomeNewsPresenter.MyProxy> implements
        HomeNewsUiHandler {
    /**
     * {@link HomeNewsPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.homeNewsPage)
    public interface MyProxy extends TabContentProxyPlace<HomeNewsPresenter> {
    }

    @TabInfo(container = HomePresenter.class)
    static TabData getTabLabel(AppConstants constants) {
        // Priority = 0, means it will be the left-most tab in the home tab
        return new TabDataBasic(constants.news(), 0);
    }

    /**
     * {@link HomeNewsPresenter}'s view.
     */
    public interface MyView extends View, HasUiHandlers<HomeNewsUiHandler> {
        void setConfirmationText(String text);

        void display();
    }

    private final PlaceManager placeManager;

    private boolean confirmationEnabled;

    @Inject
    HomeNewsPresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy,
                      PlaceManager placeManager) {
        super(eventBus, view, proxy, HomePresenter.TYPE_SetTabContent);

        this.placeManager = placeManager;

        getView().setUiHandlers(this);
    }

    @Override
    public void onReveal() {
        enableConfirmation(false);

        getView().display();
    }

    /**
     * Toggles the state of the confirmation dialog.
     */
    @Override
    public void toggleConfirmation() {
        enableConfirmation(!confirmationEnabled);
    }

    /**
     * Enables or disables the confirmation dialog.
     *
     * @param enabled {@code true} to enable the confirmation dialog, {@code false} to disable it.
     */
    private void enableConfirmation(boolean enabled) {
        this.confirmationEnabled = enabled;
        if (enabled) {
            placeManager.setOnLeaveConfirmation("Are you sure you want to navigate away from this page?");
            getView().setConfirmationText("Navigation confirmation ON, click here to disable it!");
        } else {
            placeManager.setOnLeaveConfirmation(null);
            getView().setConfirmationText("Navigation confirmation OFF, click here to enable it!");
        }
    }
}
