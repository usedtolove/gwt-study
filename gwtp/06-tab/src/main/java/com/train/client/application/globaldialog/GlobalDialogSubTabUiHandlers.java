package com.train.client.application.globaldialog;

import com.gwtplatform.mvp.client.UiHandlers;

/**
 * {@link GlobalDialogSubTabView}'s {@link UiHandlers}.
 */
public interface GlobalDialogSubTabUiHandlers extends UiHandlers {
    void showInfoPopup(int mousePosX, int mousePosY);

    void showGlobalDialog();
}
