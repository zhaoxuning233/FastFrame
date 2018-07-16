package com.huijin.festec.example;

import android.app.Application;

import com.huijin.latte.app.Latte;
import com.huijin.latte.ec.icon.FontEcModel;
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
                .configure();
    }
}
