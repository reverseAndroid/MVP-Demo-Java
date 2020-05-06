package com.xjx.mvp.utils.http;

import com.xjx.mvp.bean.request.UserRequest;
import com.xjx.mvp.bean.response.UserResponse;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Administrator on 2019/5/9.
 */

public interface Api {

    //登录
    @POST("doAppLogin")
    Observable<UserResponse> login(@Body UserRequest requestBody);
}
