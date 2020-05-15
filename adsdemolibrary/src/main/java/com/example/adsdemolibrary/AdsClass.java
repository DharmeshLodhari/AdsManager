package com.example.adsdemolibrary;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;

public class AdsClass {
    public static String testDeviceId ="";
   static String LOG ="Facebook_Ads";
    public static void showFBBannner(Context context, String placementID, View view,boolean testModeOn){
        AdView adView = new AdView(context,placementID, AdSize.BANNER_HEIGHT_50);
       if(!testDeviceId.isEmpty()){
           AdSettings.addTestDevice(testDeviceId);
       }
        AdSettings.setTestMode(testModeOn);
        ((LinearLayout)view).addView(adView);

        AdListener adListener = new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Log.v(LOG,"onError ");
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.v(LOG,"onAdLoaded ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.v(LOG,"onAdClicked ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.v(LOG,"onLoggingImpression ");
            }
        };
        AdView.AdViewLoadConfig loadAdConfig = adView.buildLoadAdConfig()
                .withAdListener(adListener)
                .build();
        adView.loadAd(loadAdConfig);
    }
    public static void showFBInterstitialAds(Context context,String placementId,boolean testModeOn){
        final InterstitialAd interstitialAd = new InterstitialAd(context,placementId);
        AdSettings.addTestDevice(testDeviceId);
        AdSettings.setTestMode(testModeOn);
        interstitialAd.setAdListener(new AbstractAdListener() {
            @Override
            public void onError(Ad ad, AdError error) {
                super.onError(ad, error);
            }

            @Override
            public void onAdLoaded(Ad ad) {
                super.onAdLoaded(ad);
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                super.onAdClicked(ad);
            }

            @Override
            public void onInterstitialDisplayed(Ad ad) {
                super.onInterstitialDisplayed(ad);
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                super.onInterstitialDismissed(ad);
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                super.onLoggingImpression(ad);
            }
        });

        interstitialAd.loadAd();
    }
}
