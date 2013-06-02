package com.train.client.place;

import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

/**
 * The central location of all name tokens for the application. All {@link ProxyPlace} classes get their tokens from
 * here. This class also makes it easy to use name tokens as a resource within UIBinder xml files.
 * <p/>
 * The String constants are used within the {@link NameToken} annotations, which can't use a method. The static method
 * corresponding to these constants are used within UiBinder which can't access static fields.
 * <p/>
 * Also note the exclamation mark in front of the tokens, this is the first step towards search engine crawling support.
 */
public class NameTokens {
    public static final String localDialogSamplePage = "!localDialogPage";
    public static final String globalDialogSamplePage = "!globalDialogPage";
    public static final String adminPage = "!adminPage";
    public static final String homeNewsPage = "!homeNewsPage";
    public static final String homeInfoPage = "!homeInfoPage";
    public static final String settingsPage = "!settingsPage";

    public static String getLocalDialogSamplePage() {
        return localDialogSamplePage;
    }

    public static String getGlobalDialogSamplePage() {
        return globalDialogSamplePage;
    }

    public static String getAdminPage() {
        return adminPage;
    }

    public static String getHomeNewsPage() {
        return homeNewsPage;
    }

    public static String getHomeInfoPage() {
        return homeInfoPage;
    }

    public static String getSettingsPage() {
        return settingsPage;
    }
}
