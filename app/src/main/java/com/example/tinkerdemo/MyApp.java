package com.example.tinkerdemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class MyApp extends TinkerApplication {

    public MyApp() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.example.tinkerdemo.SampleApplicationLike");
    }
}
