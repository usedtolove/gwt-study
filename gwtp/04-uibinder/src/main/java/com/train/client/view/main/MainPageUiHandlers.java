package com.train.client.view.main;


import com.gwtplatform.mvp.client.UiHandlers;

/**
 * User: Hu Jing Ling
 * Date: 2013-06-02
 * UiHandler 类
 * 为 View 和 Presenter 通讯提供方法
 */
public interface MainPageUiHandlers extends UiHandlers {

    /**
     * 将参数 name 发送提交给 P
     * @param name 用户输入的名称
     */
    void sendName(String name);

}
