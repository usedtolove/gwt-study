package com.train.client.security;

import com.google.gwt.event.shared.EventHandler;

public interface CurrentUserChangedHandler extends EventHandler {
    public void onCurrentUserChanged(CurrentUserChangedEvent event);
}
