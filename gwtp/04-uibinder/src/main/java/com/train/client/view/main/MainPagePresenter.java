package com.train.client.view.main;

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
import com.train.client.place.NameTokens;
import com.train.client.place.TokenParameters;

/**
 * User: Hu Jing Ling
 * Date: 2013-06-02
 */
public class MainPagePresenter extends Presenter<MainPagePresenter.MyView,MainPagePresenter.MyProxy>
    implements MainPageUiHandlers{

    private PlaceManager placeManager;

    public interface MyView extends View,HasUiHandlers<MainPageUiHandlers> {
    }

    @ProxyCodeSplit
    //使用GWT Code Splitting功能
    @NameToken(NameTokens.home)
    //将当前 Presenter 相应页面，纳入浏览器历史记录管理
    //1) 可以使用URL或超链访；2）提供前进/后退等功能
    //不能包含  ";"   "="    "/"
    public interface MyProxy extends ProxyPlace<MainPagePresenter> {
    }

    //定义一个使用 @Inject 的构造，将参数传给父类
    @Inject
    public MainPagePresenter(EventBus eventBus, MyView view, MyProxy proxy,PlaceManager placeManager) {
        super(eventBus, view, proxy,RevealType.Root);
        this.placeManager = placeManager;
        getView().setUiHandlers(this);//将 View 关联 P
    }

    @Override
    public void sendName(String name) {
        PlaceRequest responsePlaceRequest = new PlaceRequest.Builder()
                .nameToken(NameTokens.response)
                .with(TokenParameters.TEXT_TO_SERVER, name)
                .build();
        placeManager.revealPlace(responsePlaceRequest);
    }

}
