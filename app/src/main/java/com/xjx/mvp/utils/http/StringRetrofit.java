package com.xjx.mvp.utils.http;

import com.google.gson.Gson;
import com.xjx.mvp.utils.Constant;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.Multipart;

/**
 * Created by Administrator on 2019/5/22.
 */

public class StringRetrofit extends BaseApiRetrofit {

    public Api mApi;
    public static StringRetrofit mInstance;

    private StringRetrofit() {
        super();
        //在构造方法中完成对Retrofit接口的初始化
        mApi = new Retrofit.Builder()
                       .baseUrl(Constant.URL)
                       .client(getClient())
                       .addConverterFactory(ScalarsConverterFactory.create())
                       .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                       .build()
                       .create(Api.class);
    }

    public static StringRetrofit getInstance() {
        if (mInstance == null) {
            synchronized (StringRetrofit.class) {
                if (mInstance == null) {
                    mInstance = new StringRetrofit();
                }
            }
        }
        return mInstance;
    }

    @Multipart
    private RequestBody getRequestBody(Object obj) {
        String route = new Gson().toJson(obj);
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), route);
        return body;
    }
}
