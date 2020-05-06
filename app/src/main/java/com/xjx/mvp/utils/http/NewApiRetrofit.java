package com.xjx.mvp.utils.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xjx.mvp.utils.Constant;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Multipart;

public class NewApiRetrofit extends BaseApiRetrofit {

    public Api mApi;
    public static NewApiRetrofit mInstance;

    private NewApiRetrofit() {
        super();
        Gson gson = new GsonBuilder().setLenient().create();

        //在构造方法中完成对Retrofit接口的初始化
        mApi = new Retrofit.Builder()
                .baseUrl(Constant.URL)
                .client(getClient())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(Api.class);
    }

    public static NewApiRetrofit getInstance() {
        if (mInstance == null) {
            synchronized (NewApiRetrofit.class) {
                if (mInstance == null) {
                    mInstance = new NewApiRetrofit();
                }
            }
        }
        return mInstance;
    }

    @Multipart
    private RequestBody getJsonRequestBody(Object obj) {
        String route = new Gson().toJson(obj);
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), route);
        return body;
    }

    @Multipart
    private Map<String, RequestBody> getFormRequestBody(Map<String, String> requestDataMap) {
        Map<String, RequestBody> requestBodyMap = new HashMap<>();
        for (String key : requestDataMap.keySet()) {
            RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), requestDataMap.get(key) == null ? "" : requestDataMap.get(key));
            requestBodyMap.put(key, requestBody);
        }
        return requestBodyMap;
    }
}
