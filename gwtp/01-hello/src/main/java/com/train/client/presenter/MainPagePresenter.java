package com.train.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasValue;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

/**
 * User: Hu Jing Ling
 * Date: 2013-05-30
 */
public class MainPagePresenter extends Presenter<MainPagePresenter.MyView,MainPagePresenter.MyProxy> {

    private PlaceManager placeManager;

    public interface MyView extends View {
        HasValue<String> getNameField();
        HasClickHandlers getSendButton();
    }

    @ProxyCodeSplit
    //使用GWT Code Splitting功能
    @NameToken("main")
    //将当前 Presenter 相应页面，纳入浏览器历史记录管理
    //1) 可以使用URL或超链访；2）提供前进/后退等功能
    //不能包含  ";"   "="    "/"
    public interface MyProxy extends ProxyPlace<MainPagePresenter> {
    }

    //定义一个使用 @Inject 的构造，将参数传给父类
    @Inject
    public MainPagePresenter(EventBus eventBus, MyView view, MyProxy proxy,final PlaceManager placeManager) {
        super(eventBus, view, proxy);
        this.placeManager = placeManager;
    }

    //通知 top-level Presenter 本身可见，以便访问 EventBus
    @Override
    protected void revealInParent() {
        RevealRootContentEvent.fire(this,this);
    }

    @Override
    protected void onBind() {
        super.onBind();
        System.out.println("MainPagePresenter onBind()...");
        registerHandler(getView().getSendButton().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                String s = getView().getNameField().getValue();
                PlaceRequest myRequest = new PlaceRequest("resp").with("name",s);
                placeManager.revealPlace( myRequest );
            }
        }));
    }

    @Override
    protected void onUnbind() {
        super.onUnbind();
        System.out.println("MainPagePresenter onUnbind()...");
    }

    @Override
    protected void onReset() {
        super.onReset();
        System.out.println("MainPagePresenter onReset()...");
    }

    @Override
    protected void onReveal() {
        super.onReveal();
        System.out.println("MainPagePresenter onReveal()...");
    }

    @Override
    protected void onHide() {
        super.onHide();
        System.out.println("MainPagePresenter onHide()...");
    }
}
