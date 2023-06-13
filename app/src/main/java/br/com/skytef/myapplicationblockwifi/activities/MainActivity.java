package br.com.skytef.myapplicationblockwifi.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import br.com.skytef.myapplicationblockwifi.R;
import br.com.skytef.myapplicationblockwifi.service.WifiUtils;
import br.com.skytef.myapplicationblockwifi.service.WifiUtilsItent;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Switch aSwitch;
    private WifiUtils bloquearWifi;

    private WifiUtilsItent wifiUtilsItent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.switchButton);
        aSwitch.setOnCheckedChangeListener(this);
        bloquearWifi = new WifiUtils(this);
        wifiUtilsItent = new WifiUtilsItent(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            // Bloquear Wi-Fi
            bloquearWifi.bloquearWifi();
//            wifiUtilsItent.bloquearWifi();
            Toast.makeText(getApplicationContext(), "On!", Toast.LENGTH_SHORT).show();
        } else {
            // Desbloquear Wi-Fi
            bloquearWifi.desbloquearWifi();
            Toast.makeText(getApplicationContext(), "Off!", Toast.LENGTH_SHORT).show();
        }
    }
}