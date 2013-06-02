package com.train.client.view.response;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class ResponseView extends ViewWithUiHandlers<ResponseUiHandlers> implements ResponsePresenter.MyView {

    @UiField
    HTML serverResponse;
    @UiField
    Button closeButton;

    //从 MainPageView.ui.xml 文件中读取布局
    interface Binder extends UiBinder<Widget,ResponseView> {
    }

	@Inject
	public ResponseView(Binder binder) {
        initWidget(binder.createAndBindUi(this)); //填充各 ui 组件
	}

    @Override
    public void setServerResponse(String serverResponse) {
        this.serverResponse.setHTML(serverResponse);
    }

    @UiHandler("closeButton")
    void onClose(ClickEvent event){
        getUiHandlers().onClose();
    }

}
