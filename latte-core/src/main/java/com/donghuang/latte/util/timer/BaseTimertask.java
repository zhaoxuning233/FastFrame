package com.donghuang.latte.util.timer;

import java.util.TimerTask;

/**
 * Created by 赵旭宁 on 2018/7/18.
 */

public class BaseTimertask extends TimerTask {

    private ITimerListener mITimerListener = null;

    public BaseTimertask(ITimerListener timerListener) {
        this.mITimerListener = timerListener;
    }

    @Override
    public void run() {
        if (mITimerListener != null) {
            mITimerListener.onTimer();
        }
    }
}
