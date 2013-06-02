package com.train.client.application.aboutus;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class AboutUsView extends ViewImpl implements AboutUsPresenter.MyView {
    interface Binder extends UiBinder<Widget, AboutUsView> {
    }

    @Inject
    public AboutUsView(Binder binder) {
        initWidget(binder.createAndBindUi(this));
    }
}
