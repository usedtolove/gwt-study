package com.train.client.application;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.train.client.application.common.HeaderPresenter;
import com.train.client.place.NameTokens;

/**
 * User: Hu Jing Ling
 * Date: 2013-06-02
 */
public class ApplicationPresenter extends Presenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy>
    implements ApplicationUiHandlers{

    public interface MyView extends View,HasUiHandlers<ApplicationUiHandlers> {
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.homePage)
    public interface MyProxy extends ProxyPlace<ApplicationPresenter> {
    }

//    @ContentSlot
//    public static final GwtEvent.Type<RevealContentHandler<?>> TYPE_HEADER = new GwtEvent.Type<RevealContentHandler<?>>();
    public static final Object HEADER_SLOT = new Object();
    public static final Object MENU_SLOT = new Object();

    private final HeaderPresenter headerPresenter;

    @Inject
//    public ApplicationPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
    public ApplicationPresenter(EventBus eventBus, MyView view, MyProxy proxy,
                                HeaderPresenter header) {
        super(eventBus, view, proxy,RevealType.Root);
//        getView().setUiHandlers(this);//将 View 关联 P
          this.headerPresenter = header;
    }

    @Override
    protected void onBind() {
        super.onBind();
        setInSlot(HEADER_SLOT, headerPresenter);
    }
}
