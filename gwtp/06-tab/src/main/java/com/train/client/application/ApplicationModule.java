package com.train.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.train.client.application.adminarea.AdminAreaPresenter;
import com.train.client.application.adminarea.AdminAreaView;
import com.train.client.application.dialog.DialogSamplePresenter;
import com.train.client.application.dialog.DialogSampleView;
import com.train.client.application.globaldialog.GlobalDialogPresenterWidget;
import com.train.client.application.globaldialog.GlobalDialogSubTabPresenter;
import com.train.client.application.globaldialog.GlobalDialogSubTabView;
import com.train.client.application.globaldialog.GlobalDialogView;
import com.train.client.application.home.HomePresenter;
import com.train.client.application.home.HomeView;
import com.train.client.application.homeinfo.HomeInfoPresenter;
import com.train.client.application.homeinfo.HomeInfoView;
import com.train.client.application.homenews.HomeNewsPresenter;
import com.train.client.application.homenews.HomeNewsView;
import com.train.client.application.infopopup.InfoPopupPresenterWidget;
import com.train.client.application.infopopup.InfoPopupView;
import com.train.client.application.localdialog.LocalDialogPresenterWidget;
import com.train.client.application.localdialog.LocalDialogSubTabPresenter;
import com.train.client.application.localdialog.LocalDialogSubTabView;
import com.train.client.application.localdialog.LocalDialogView;
import com.train.client.application.settings.SettingsPresenter;
import com.train.client.application.settings.SettingsView;
import com.train.client.application.ui.UiModule;

/**
 * @author Brandon Donnelson
 */
public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new UiModule());

        // Applicaiton Presenters
        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                      ApplicationPresenter.MyProxy.class);
        bindPresenter(HomePresenter.class, HomePresenter.MyView.class, HomeView.class, HomePresenter.MyProxy.class);
        bindPresenter(DialogSamplePresenter.class, DialogSamplePresenter.MyView.class, DialogSampleView.class,
                      DialogSamplePresenter.MyProxy.class);
        bindPresenter(LocalDialogSubTabPresenter.class, LocalDialogSubTabPresenter.MyView.class,
                      LocalDialogSubTabView.class, LocalDialogSubTabPresenter.MyProxy.class);
        bindPresenter(GlobalDialogSubTabPresenter.class, GlobalDialogSubTabPresenter.MyView.class,
                      GlobalDialogSubTabView.class, GlobalDialogSubTabPresenter.MyProxy.class);
        bindPresenter(SettingsPresenter.class, SettingsPresenter.MyView.class, SettingsView.class,
                      SettingsPresenter.MyProxy.class);
        bindPresenter(AdminAreaPresenter.class, AdminAreaPresenter.MyView.class, AdminAreaView.class,
                      AdminAreaPresenter.MyProxy.class);
        bindPresenter(HomeNewsPresenter.class, HomeNewsPresenter.MyView.class, HomeNewsView.class,
                      HomeNewsPresenter.MyProxy.class);
        bindPresenter(HomeInfoPresenter.class, HomeInfoPresenter.MyView.class, HomeInfoView.class,
                    HomeInfoPresenter.MyProxy.class);
        bindSingletonPresenterWidget(InfoPopupPresenterWidget.class, InfoPopupPresenterWidget.MyView.class,
                    InfoPopupView.class);
        bindSingletonPresenterWidget(LocalDialogPresenterWidget.class, LocalDialogPresenterWidget.MyView.class,
                     LocalDialogView.class);
        bindSingletonPresenterWidget(GlobalDialogPresenterWidget.class, GlobalDialogPresenterWidget.MyView.class,
                     GlobalDialogView.class);
    }
}
