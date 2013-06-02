package com.train.client.gin;

import com.google.inject.Inject;
import com.train.client.resources.AppResources;

public class ResourceLoader {
    @Inject
    ResourceLoader(AppResources resources) {
        resources.styles().ensureInjected();
        resources.sprites().ensureInjected();

        //... Inject more css into the document here on boot
    }
}
