package com.train.shared.dispatch;

import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;
import com.train.shared.to.User;

/**
 * User: Hu Jing Ling <br/>
 * Date: 2013-05-31 <br/>
 * 自定义 Action 类
 * 从 Client 端的 DispatchAsync,
 * 发送给 Server 端的 Dispatch
 */

public class SendTextToServerAction extends UnsecuredActionImpl<SendTextToServerResult> {

    private String textToServer;
    private User user;

    public SendTextToServerAction() {
    }

    public String getTextToServer() {
        return textToServer;
    }

    public void setTextToServer(String textToServer) {
        this.textToServer = textToServer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
