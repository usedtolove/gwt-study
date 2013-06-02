package com.train.client.security;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

/**
 * This is a basic class that holds the privileges of the user currently logged in.
 */
public class CurrentUser implements HasHandlers {
    private boolean isAdmin = true;

    private final EventBus eventBus;

    @Inject
    CurrentUser(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
        CurrentUserChangedEvent.fire(this);
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public void fireEvent(GwtEvent<?> event) {
        eventBus.fireEvent(event);
    }
}
