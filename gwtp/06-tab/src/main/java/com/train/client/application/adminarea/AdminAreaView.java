package com.train.client.application.adminarea;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * The view implementation for {@link AdminAreaPresenter}.
 */
public class AdminAreaView extends ViewImpl implements AdminAreaPresenter.MyView {
    interface Binder extends UiBinder<Widget, AdminAreaView> {
    }

    @Inject
    AdminAreaView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
