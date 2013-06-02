package com.train.client.security;

import com.google.inject.Inject;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;

/**
 * This gatekeeper only allows access if the user currently logged in has administrator privileges.
 */
public class IsAdminGatekeeper implements Gatekeeper {
    private final CurrentUser currentUser;

    @Inject
    IsAdminGatekeeper(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    public boolean canReveal() {
        return currentUser.isAdmin();
    }
}
