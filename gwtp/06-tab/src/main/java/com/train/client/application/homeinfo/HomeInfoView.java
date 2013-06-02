package com.train.client.application.homeinfo;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * The view implementation for {@link HomeInfoPresenter} .
 */
public class HomeInfoView extends ViewImpl implements HomeInfoPresenter.MyView {
    interface Binder extends UiBinder<Widget, HomeInfoView> {
    }

    @Inject
    HomeInfoView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
