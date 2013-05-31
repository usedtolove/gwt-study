package com.train.client.presenter;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

/**
 * User: Hu Jing Ling
 * Date: 2013-05-30
 */
public class ResponsePresenter extends Presenter<ResponsePresenter.MyView, ResponsePresenter.MyProxy> {

    public interface MyView extends View {
        void setServerResponse(String serverResponse);
    }

    private String textToServer;

    @ProxyCodeSplit
    @NameToken("resp")
    public interface MyProxy extends ProxyPlace<ResponsePresenter> {
    }

    @Inject
    public ResponsePresenter(EventBus eventBus, ResponsePresenter.MyView view, ResponsePresenter.MyProxy proxy) {
        super(eventBus, view, proxy);
    }

    @Override
    protected void revealInParent() {
        RevealRootContentEvent.fire(this,this);
    }

    @Override
    protected void onBind() {
        super.onBind();
        System.out.println("ResponsePresenter onBind()...");
    }

    @Override
    protected void onUnbind() {
        super.onUnbind();
        System.out.println("ResponsePresenter onUnbind()...");
    }

    @Override
    public void prepareFromRequest(PlaceRequest request) {
        super.prepareFromRequest(request);
        textToServer = request.getParameter("name", null);
    }

    @Override
    protected void onReset() {
        super.onReset();
        getView().setServerResponse(textToServer);
    }

    @Override
    protected void onReveal() {
        super.onReveal();
        System.out.println("ResponsePresenter onReveal()...");
    }

    @Override
    protected void onHide() {
        super.onHide();
        System.out.println("ResponsePresenter onHide()...");
    }
}
