package com.xjx.mvp.model.imp;

import com.xjx.mvp.bean.response.UserResponse;
import com.xjx.mvp.base.BaseCallBack;

public interface MainCallBack extends BaseCallBack {

    void callBack(UserResponse response);
}
