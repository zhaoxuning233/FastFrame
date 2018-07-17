package com.huijin.latte.net;

import com.huijin.latte.net.callback.IError;
import com.huijin.latte.net.callback.IFailure;
import com.huijin.latte.net.callback.IRequest;
import com.huijin.latte.net.callback.ISuccess;

import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.RequestBody;

/**
 * Created by 赵旭宁 on 2018/7/8.
 */

public class RestClient {
    private final String URL;
    private final WeakHashMap<String, Object> PARAMS = RestCreater.getParams();
    private final IRequest REQUEST;
    private final ISuccess SUCCESS;
    private final IError ERROR;
    private final IFailure FAILURE;
    private final RequestBody BODY;

    public RestClient(String url,
                      Map<String, Object> params,
                      IRequest request,
                      ISuccess success,
                      IError error,
                      IFailure failure,
                      RequestBody body) {
        URL = url;
        PARAMS.putAll(params);
        REQUEST = request;
        SUCCESS = success;
        ERROR = error;
        FAILURE = failure;
        BODY = body;
    }

    public static RestClientBuilder builder() {
        return new RestClientBuilder();
    }
}
