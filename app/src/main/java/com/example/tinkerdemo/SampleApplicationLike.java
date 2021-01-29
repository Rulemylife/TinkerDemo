package com.example.tinkerdemo;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.tencent.tinker.entry.DefaultApplicationLike;
import com.tencent.tinker.lib.tinker.Tinker;

public class SampleApplicationLike extends DefaultApplicationLike {

    public SampleApplicationLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }

    /**
     * 把原有Application初始化的放在这里
     */
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onBaseContextAttached(Context base) {
        super.onBaseContextAttached(base);

        TinkerManager.setTinkerApplicationLike(this);
        TinkerManager.setUpgradeRetryEnable(true);
        TinkerManager.installTinker(this);
        Tinker.with(getApplication());
    }
}
