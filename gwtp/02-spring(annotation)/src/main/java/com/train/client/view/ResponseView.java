package com.train.client.view;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.train.client.presenter.ResponsePresenter;

public class ResponseView extends ViewImpl implements ResponsePresenter.MyView {

	private static String html = "<h1>Response Page</h1>\n"
			+ "<table align=\"center\">\n" + "  <tr>\n"
			+ "    <td style=\"font-weight:bold;\">Server return:</td>\n"
			+ "  </tr>\n" + "  <tr>\n"
			+ "    <td id=\"textToServerContainer\"></td>\n" + "  </tr>\n"
			+ "</table>\n";
	private final HTMLPanel panel = new HTMLPanel(html);
	private final Label textToServerLabel;

	@Inject
	public ResponseView() {
		textToServerLabel = new Label();

		// Add the nameField and sendButton to the RootPanel
		// Use RootPanel.get() to get the entire body element
		panel.add(textToServerLabel, "textToServerContainer");
	}

	@Override
	public Widget asWidget() {
		return panel;
	}

    @Override
    public void setServerResponse(String serverResponse) {
        textToServerLabel.setText(serverResponse);
    }
}
