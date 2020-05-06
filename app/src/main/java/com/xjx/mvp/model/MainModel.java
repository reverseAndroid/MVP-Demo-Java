package com.xjx.mvp.model;

import android.widget.Toast;

import com.xjx.mvp.App;
import com.xjx.mvp.base.BaseModel;
import com.xjx.mvp.bean.request.UserRequest;
import com.xjx.mvp.model.imp.MainCallBack;
import com.xjx.mvp.utils.http.ApiRetrofit;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainModel extends BaseModel<MainCallBack> {

    public void setBaidu(UserRequest user) {
        ApiRetrofit.getInstance().login(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(userResponse -> {
                    if (userResponse.getCode().equals("200")) {
                        mCallBack.callBack(userResponse);
                    } else {
                        mCallBack.callBack(userResponse);
                    }
                }, throwable -> Toast.makeText(App.getContext(), "程序发生异常", Toast.LENGTH_SHORT).show());
    }
}
