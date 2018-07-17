package com.huijin.festec.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.huijin.latte.delegates.LatteDelegate;
import com.huijin.latte.net.RestClient;
import com.huijin.latte.net.callback.IError;
import com.huijin.latte.net.callback.IFailure;
import com.huijin.latte.net.callback.ISuccess;

/**
 * Created by 赵旭宁 on 2018/7/8.
 */

public class ExampleDelegate extends LatteDelegate {

    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }

    private void testRestClient() {
        RestClient.builder()
                .url("")
                .params("", "")
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {

                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .build();
    }
}
