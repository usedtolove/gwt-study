package com.train.client.application.localdialog;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlace;
import com.train.client.application.dialog.DialogSamplePresenter;
import com.train.client.place.NameTokens;

/**
 * A sample {@link Presenter} that demonstrates how to trigger a local dialog box. It appears as a tab within
 * {@link DialogSamplePresenter}, which is itself a s tab in {@link com.train.client.application.ApplicationPresenter}.
 * <p/>
 * It demonstrates the option 1 described in {@link TabInfo}.
 */
public class LocalDialogSubTabPresenter
        extends Presenter<LocalDialogSubTabPresenter.MyView, LocalDialogSubTabPresenter.MyProxy>
        implements LocalDialogSubTabUihandlers {
    /**
     * {@link LocalDialogSubTabPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.localDialogSamplePage)
    @TabInfo(container = DialogSamplePresenter.class, label = "Local", priority = 5)
    // The second tab in the dialog tab
    public interface MyProxy extends TabContentProxyPlace<LocalDialogSubTabPresenter> {
    }

    /**
     * {@link LocalDialogSubTabPresenter}'s view.
     */
    public interface MyView extends View, HasUiHandlers<LocalDialogSubTabUihandlers> {
    }

    private final LocalDialogPresenterWidget localDialog;

    @Inject
    LocalDialogSubTabPresenter(EventBus eventBus,
                               MyView view,
                               MyProxy proxy,
                               LocalDialogPresenterWidget localDialog) {
        super(eventBus, view, proxy, DialogSamplePresenter.TYPE_SetTabContent);

        this.localDialog = localDialog;

        view.setUiHandlers(this);
    }

    @Override
    public void showLocalDialog() {
        addToPopupSlot(localDialog);
    }
}
