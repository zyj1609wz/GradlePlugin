package com.plugin;

import android.util.Log;

/**
 * Created by yiba_zyj on 2017/11/22.
 */

public class LogUtil {
    public static final String TAG = "DownloadPlugin";

    public static void e(String mes) {
        Log.e(TAG, mes);
    }

    public static void d(String mes) {
        Log.d(TAG, mes);
    }

}
