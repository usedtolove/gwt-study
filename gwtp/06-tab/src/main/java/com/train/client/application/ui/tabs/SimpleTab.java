package com.train.client.application.ui.tabs;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.assistedinject.Assisted;
import com.gwtplatform.mvp.client.TabData;

import javax.inject.Inject;

/**
 * A {@link BaseTab} styled as a square and meant to be contained in a {@link SimpleTabPanel}.
 */
public class SimpleTab extends BaseTab {
    interface Binder extends UiBinder<Widget, SimpleTab> {
    }

    @Inject
    SimpleTab(Binder uiBinder,
              @Assisted TabData tabData) {
        super(tabData);

        initWidget(uiBinder.createAndBindUi(this));

        setText(tabData.getLabel());
    }
}
