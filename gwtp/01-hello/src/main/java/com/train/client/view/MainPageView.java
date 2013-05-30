package com.train.client.view;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.train.client.presenter.MainPagePresenter;

/**
 * User: Hu Jing Ling
 * Date: 2013-05-30
 */
public class MainPageView extends ViewImpl implements MainPagePresenter.MyView {

    private static String html =
            "<h1>Web Application Starter Project</h1>\n" +
                    "<table align=\"center\">\n" +
                    "  <tr>\n" +
                    "    <td colspan=\"2\" style=\"font-weight:bold;\">Please enter your name:</td>\n" +
                    "  </tr>\n" +
                    "  <tr>\n" +
                    "    <td id=\"nameFieldContainer\"></td>\n" +
                    "    <td id=\"sendButtonContainer\"></td>\n" +
                    "  </tr>\n" +
                    "  <tr>\n" +
                    "    <td colspan=\"2\" style=\"color:red;\" id=\"errorLabelContainer\"></td>\n" +
                    "  </tr>\n" +
                    "</table>\n";

    private final HTMLPanel panel = new HTMLPanel(html);
    private final Label errorLabel;
    private final TextBox nameField;
    private final Button sendButton;

    @Inject
    public MainPageView() {
        sendButton = new Button("Send");
        nameField = new TextBox();
        nameField.setText("GWT User");
        errorLabel = new Label();

        // We can add style names to widgets
        sendButton.addStyleName("sendButton");

        // Add the nameField and sendButton to the RootPanel
        // Use RootPanel.get() to get the entire body element
        panel.add(nameField, "nameFieldContainer");
        panel.add(sendButton, "sendButtonContainer");
        panel.add(errorLabel, "errorLabelContainer");
    }

    @Override
    public Widget asWidget() {
        return panel;
    }

    @Override
    public HasValue<String> getNameField() {
        return nameField;
    }

    @Override
    public HasClickHandlers getSendButton() {
        return sendButton;
    }
}
