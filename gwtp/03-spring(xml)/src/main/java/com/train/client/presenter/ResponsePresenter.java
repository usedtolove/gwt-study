package com.train.client.presenter;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
import com.train.client.place.NameTokens;
import com.train.client.place.TokenParameters;
import com.train.shared.dispatch.SendTextToServerAction;
import com.train.shared.dispatch.SendTextToServerResult;
import com.train.shared.to.Pet;
import com.train.shared.to.User;

/**
 * User: Hu Jing Ling
 * Date: 2013-05-30
 */
public class ResponsePresenter extends Presenter<ResponsePresenter.MyView, ResponsePresenter.MyProxy> {

    public interface MyView extends View {
        void setServerResponse(String serverResponse);
    }

    private String textToServer;
    private final DispatchAsync dispatcher;

    @ProxyCodeSplit
    @NameToken(NameTokens.response)
    public interface MyProxy extends ProxyPlace<ResponsePresenter> {
    }

    @Inject
    ResponsePresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy,
                      PlaceManager placeManager,
                      DispatchAsync dispatcher) {
        super(eventBus, view, proxy, RevealType.Root);
        this.dispatcher = dispatcher;
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
        textToServer = request.getParameter(TokenParameters.TEXT_TO_SERVER, null);
    }

    @Override
    protected void onReset() {
        super.onReset();
//        getView().setServerResponse(textToServer);
        SendTextToServerAction action = new SendTextToServerAction();
        action.setTextToServer(textToServer);

        User user = new User();
        user.setName("jack");
        user.setAge(25);
        user.setPet(new Pet("tomcat"));
        action.setUser(user);

        dispatcher.execute(action,new AsyncCallback<SendTextToServerResult>() {
            @Override
            public void onFailure(Throwable caught) {
                System.out.println("onFailure...");
            }
            @Override
            public void onSuccess(SendTextToServerResult result) {
                getView().setServerResponse(result.getResponse());
            }
        });
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
