package com.donghuang.festec.example;

import android.app.Application;

import com.donghuang.latte.app.Latte;
import com.donghuang.latte.ec.icon.FontEcModel;
import com.donghuang.latte.net.interceptors.DebugInterceptor;
import com.joanzapata.iconify.fonts.FontAwesomeModule;


/**
 * Created by 赵旭宁 on 2018/7/2.
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcons(new FontAwesomeModule())
                .withIcons(new FontEcModel())
                .withApiHost("http://127.0.0.1/")
                .withInterceptor(new DebugInterceptor("index", R.raw.test))
                .configure();

    }
}
