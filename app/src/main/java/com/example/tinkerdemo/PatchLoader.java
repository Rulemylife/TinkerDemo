package com.example.tinkerdemo;

import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

public class PatchLoader {

    public void loadPatch() {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk";
                Log.d("Hang", "start load patch : " + path);
                TinkerInstaller.onReceiveUpgradePatch(MyApp.getInstance(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk");
            }
        });
    }
}
