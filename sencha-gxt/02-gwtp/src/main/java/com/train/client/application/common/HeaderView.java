package com.train.client.application.common;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

/**
* User: Hu Jing Ling
* Date: 2013-6-4
*/
public class HeaderView extends ViewWithUiHandlers<HeaderUiHandlers> implements HeaderPresenter.MyView {

    public interface Binder extends UiBinder<Widget, HeaderView> {
    }

    @Inject
    public HeaderView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}