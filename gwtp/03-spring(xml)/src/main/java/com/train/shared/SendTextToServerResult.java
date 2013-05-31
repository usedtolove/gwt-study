package com.train.shared;

import com.gwtplatform.dispatch.shared.Result;

/**
 * User: Hu Jing Ling  <br/>
 * Date: 2013-05-31   <br/>
 * {@link SendTextToServerAction} 处理结果类
 */
public class SendTextToServerResult implements Result {

    private String response;

    public SendTextToServerResult(String response) {
        this.response = response;
    }

    public SendTextToServerResult() {
    }

    public String getResponse() {
        return response;
    }

}
