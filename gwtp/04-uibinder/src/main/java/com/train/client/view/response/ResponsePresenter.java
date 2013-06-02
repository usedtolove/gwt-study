package com.train.client.view.response;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.HasUiHandlers;
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
public class ResponsePresenter extends Presenter<ResponsePresenter.MyView, ResponsePresenter.MyProxy>
        implements ResponseUiHandlers{

    private String textToServer;

    public interface MyView extends View,HasUiHandlers<ResponseUiHandlers> {
        void setServerResponse(String serverResponse);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.response)
    public interface MyProxy extends ProxyPlace<ResponsePresenter> {
    }

    private DispatchAsync dispatcher;
    private PlaceManager placeManager;

    @Inject
    ResponsePresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy,
                      PlaceManager placeManager,
                      DispatchAsync dispatcher) {
        super(eventBus, view, proxy, RevealType.Root);
        this.dispatcher = dispatcher;
        this.placeManager = placeManager;
        getView().setUiHandlers(this);
    }

    @Override
    public void onClose() {
        PlaceRequest placeRequest = new PlaceRequest.Builder().nameToken(NameTokens.home).build();
        placeManager.revealPlace(placeRequest);
    }

    @Override
    public void prepareFromRequest(PlaceRequest request) {
        super.prepareFromRequest(request);
        textToServer = request.getParameter(TokenParameters.TEXT_TO_SERVER, null);
    }

    @Override
    protected void onReset() {
        super.onReset();

        SendTextToServerAction action = new SendTextToServerAction();
        action.setTextToServer(textToServer);

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

}
