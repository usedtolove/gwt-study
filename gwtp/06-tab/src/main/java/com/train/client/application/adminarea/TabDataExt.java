package com.train.client.application.adminarea;

import com.gwtplatform.mvp.client.TabDataBasic;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;

/**
 * This class allows the definition of tabs that can be protected by any {@link Gatekeeper}.
 */
public class TabDataExt extends TabDataBasic {
    private final Gatekeeper gatekeeper;

    public TabDataExt(String label,
                      float priority,
                      Gatekeeper gatekeeper) {
        super(label, priority);

        this.gatekeeper = gatekeeper;
    }

    public Gatekeeper getGatekeeper() {
        return gatekeeper;
    }
}
