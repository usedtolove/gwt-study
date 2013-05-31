package com.train.shared.to;

import java.io.Serializable;

/**
 * User: Hu Jing Ling
 * Date: 2013-05-31
 */
public class Pet implements Serializable {

    private String nickName;

    public Pet() {
    }

    public Pet(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
