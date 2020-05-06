package com.xjx.mvp.base;

public class BaseModel<C> {

    protected C mCallBack;

    public void setCallBack(C callBack) {
        this.mCallBack = callBack;
    }
}
