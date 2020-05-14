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

    public static void showFBInterstitialAd(Context context, String placementId){
        final InterstitialAd interstitialAd = new InterstitialAd(context,placementId);
        AdSettings.addTestDevice("29a2a34a-76b1-4646-a1bd-8165220fdee8");
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
    @Override
    public void onBackPressed() {
     //   super.onBackPressed();
    showFBInterstitialAd(this,"YOUR_PLACEMENT_ID");
    }
}
