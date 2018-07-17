package com.huijin.latte.net;

import com.huijin.latte.net.callback.IError;
import com.huijin.latte.net.callback.IFailure;
import com.huijin.latte.net.callback.IRequest;
import com.huijin.latte.net.callback.ISuccess;

import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by 赵旭宁 on 2018/7/17.
 */

public class RestClientBuilder {
    private String mUrl;
    private static final Map<String, Object> PARAMS = RestCreater.getParams();
    private IRequest mRequest;
    private ISuccess mSuccess;
    private IError mError;
    private IFailure mFailure;
    private RequestBody mBody;

    RestClientBuilder() {
    }

    public final RestClientBuilder url(String url) {
        this.mUrl = url;
        return this;
    }

    public final RestClientBuilder params(WeakHashMap<String, Object> params) {
        PARAMS.putAll(params);
        return this;
    }

    public final RestClientBuilder params(String key, Object value) {
        PARAMS.put(key, value);
        return this;
    }

    public final RestClientBuilder raw(String raw) {
        this.mBody = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), raw);
        return this;
    }

    public final RestClientBuilder success(ISuccess iSuccess) {
        this.mSuccess = iSuccess;
        return this;
    }

    public final RestClientBuilder failure(IFailure iFailure) {
        this.mFailure = iFailure;
        return this;
    }

    public final RestClientBuilder error(IError iError) {
        this.mError = iError;
        return this;
    }

    public final RestClientBuilder onRequest(IRequest iRequest) {
        this.mRequest = iRequest;
        return this;
    }

    public final RestClient build() {
        return new RestClient(mUrl, PARAMS, mRequest, mSuccess, mError, mFailure, mBody);
    }
}
