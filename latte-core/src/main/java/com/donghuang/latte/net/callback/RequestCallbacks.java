package com.donghuang.latte.net.callback;

import android.os.Handler;

import com.donghuang.latte.ui.loader.LatteLoader;
import com.donghuang.latte.ui.loader.LoaderStyle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by 赵旭宁 on 2018/7/17.
 */

public class RequestCallbacks implements Callback<String> {
    private final IRequest REQUEST;
    private final ISuccess SUCCESS;
    private final IError ERROR;
    private final IFailure FAILURE;
    private final LoaderStyle LOADER_STYLE;
    private static final Handler HANDLER = new Handler();

    public RequestCallbacks(IRequest request, ISuccess success, IError error, IFailure failure, LoaderStyle loaderStyle) {
        REQUEST = request;
        SUCCESS = success;
        ERROR = error;
        FAILURE = failure;
        LOADER_STYLE = loaderStyle;
    }

    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        if (response.isSuccessful()) {
            if (call.isExecuted()) {
                if (SUCCESS != null) {
                    SUCCESS.onSuccess(response.body());
                }
            }
        } else {
            if (ERROR != null) {
                ERROR.onError(response.code(), response.message());
            }
        }

        stopLoading();
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        if (FAILURE != null) {
            FAILURE.onFailure();
        }

        if (REQUEST != null) {
            REQUEST.onRequestEnd();
        }

        stopLoading();
    }

    private void stopLoading() {
        if (LOADER_STYLE != null) {
            HANDLER.postDelayed(new Runnable() {
                @Override
                public void run() {
                    LatteLoader.stopLoading();
                }
            }, 1000);
        }
    }
}
