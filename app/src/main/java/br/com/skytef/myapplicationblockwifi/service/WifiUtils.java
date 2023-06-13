package br.com.skytef.myapplicationblockwifi.service;

import android.content.Context;
import android.net.wifi.WifiManager;

public class WifiUtils {
    private WifiManager wifiManager;

    public WifiUtils(Context context) {
        wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
    }

    public void bloquearWifi() {
        if (wifiManager != null && wifiManager.isWifiEnabled()) {
            wifiManager.setWifiEnabled(false);
        }
    }

    public void desbloquearWifi() {
        if (wifiManager != null && !wifiManager.isWifiEnabled()) {
            wifiManager.setWifiEnabled(true);
        }
    }
}

