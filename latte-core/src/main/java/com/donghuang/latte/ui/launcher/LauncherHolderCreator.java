package com.donghuang.latte.ui.launcher;


import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

/**
 * Created by 赵旭宁 on 2018/7/18.
 */

public class LauncherHolderCreator implements CBViewHolderCreator<LauncherHolder> {

    @Override
    public LauncherHolder createHolder() {
        return new LauncherHolder();
    }
}
