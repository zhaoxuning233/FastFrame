package com.donghuang.latte.net.interceptors;

import java.util.LinkedHashMap;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;

/**
 * Created by 赵旭宁 on 2018/7/18.
 * <p>
 * 基础拦截器
 * 作用：用于模拟网络请求，返回假的请求是数据
 */

public abstract class BaseInterceptor implements Interceptor {

    /**
     * 从URL中获取参数，适用于模拟Get请求
     */
    protected LinkedHashMap<String, String> getUrlParameters(Chain chain) {
        final HttpUrl url = chain.request().url();
        final int size = url.querySize();
        final LinkedHashMap<String, String> params = new LinkedHashMap<>();
        for (int i = 0; i < size; i++) {
            params.put(url.queryParameterName(i), url.queryParameterValue(i));
        }
        return params;
    }

    /**
     * 重载getUrlParameters，当有key的时候直接获取相应的参数
     */
    protected String getUrlParameters(Chain chain, String key) {
        return chain.request().url().queryParameter(key);
    }

    /**
     * 从Body请求体中获取参数，适用于模拟Post请求
     */
    @SuppressWarnings("WeakerAccess")
    protected LinkedHashMap<String, String> getBodyParameters(Chain chain) {
        final FormBody formBody = (FormBody) chain.request().body();
        final int size = formBody.size();
        final LinkedHashMap<String, String> params = new LinkedHashMap<>();
        for (int i = 0; i < size; i++) {
            params.put(formBody.name(i), formBody.value(i));
        }
        return params;
    }

    /**
     * 重载getBodyParameters,当有key的时候直接从map中获取相应的参数
     */
    protected String getBodyParameters(Chain chain, String key) {
        return getBodyParameters(chain).get(key);
    }

}
