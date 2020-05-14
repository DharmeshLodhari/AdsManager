package com.example.adsdemolibrary;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;

public class AdsClass {
    public static String testDeviceId ="";
    public static void showFBBannner(Context context, String placementID, View view,boolean testModeOn){
        AdView adView = new AdView(context,placementID, AdSize.BANNER_HEIGHT_50);
        AdSettings.addTestDevice(testDeviceId);
        AdSettings.setTestMode(testModeOn);
        ((LinearLayout)view).addView(adView);
    }

}
