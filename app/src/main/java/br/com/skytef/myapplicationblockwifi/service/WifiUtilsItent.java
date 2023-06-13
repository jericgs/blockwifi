package br.com.skytef.myapplicationblockwifi.service;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;

public class WifiUtilsItent {
    private Context context;

    public WifiUtilsItent(Context context) {
        this.context = context;
    }

    public void bloquearWifi() {
        Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        context.startActivity(intent);
    }
}
