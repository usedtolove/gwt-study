package com.train.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.train.client.application.aboutus.AboutUsPresenter;
import com.train.client.application.aboutus.AboutUsView;
import com.train.client.application.contact.ContactPresenter;
import com.train.client.application.contact.ContactPresenterBase;
import com.train.client.application.contact.ContactView;
import com.train.client.application.home.HomePresenter;
import com.train.client.application.home.HomeView;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        // Applicaiton Presenters
        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                      ApplicationPresenter.MyProxy.class);
        bindPresenter(HomePresenter.class, HomePresenter.MyView.class, HomeView.class, HomePresenter.MyProxy.class);
        bindPresenter(AboutUsPresenter.class, AboutUsPresenter.MyView.class, AboutUsView.class,
                      AboutUsPresenter.MyProxy.class);
        bindPresenter(ContactPresenter.class, ContactPresenterBase.MyView.class, ContactView.class,
                      ContactPresenter.MyProxy.class);
    }
}
