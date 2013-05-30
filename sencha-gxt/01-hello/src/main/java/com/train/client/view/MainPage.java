package com.train.client.view;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.sencha.gxt.widget.core.client.container.CenterLayoutContainer;

/**
 * User: Hu Jing Ling
 * Date: 2013-5-30
 */
@Singleton
public class MainPage extends CenterLayoutContainer {

    @Inject
    public MainPage(MyPanel myPanel) {
        add(myPanel);
    }
}
