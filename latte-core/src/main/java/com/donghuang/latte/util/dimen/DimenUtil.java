package com.donghuang.latte.util.dimen;


import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.donghuang.latte.app.Latte;

/**
 * Created by 赵旭宁 on 2018/7/17.
 */

public final class DimenUtil {

    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
