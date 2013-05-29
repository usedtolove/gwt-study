package com.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Hello implements EntryPoint {
	public void onModuleLoad() {
		AlertMessageBox d = new AlertMessageBox("aaaa", "Access Denied");
        d.show();
	}
}
