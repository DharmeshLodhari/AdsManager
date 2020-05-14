package com.example.demojar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout adviewLayout = (LinearLayout)findViewById(R.id.banner_Main);
        AdView adView = new AdView(this,"YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
            AdSettings.addTestDevice("29a2a34a-76b1-4646-a1bd-8165220fdee8");
            AdSettings.setTestMode(true);
            adviewLayout.addView(adView);
        adView.loadAd();


    }


}
