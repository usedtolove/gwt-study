package com.train.shared;

import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;

/**
 * User: Hu Jing Ling <br/>
 * Date: 2013-05-31 <br/>
 * 自定义 Action 类
 * 从 Client 端的 DispatchAsync,
 * 发送给 Server 端的 Dispatch
 */

public class SendTextToServerAction extends UnsecuredActionImpl<SendTextToServerResult> {

    private String textToServer;

    public SendTextToServerAction(String textToServer) {
        this.textToServer = textToServer;
    }

    public SendTextToServerAction() {
    }

    public String getTextToServer() {
        return textToServer;
    }

}
