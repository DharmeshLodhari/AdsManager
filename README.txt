
Android FaceBook Banner Ads Showing Libraries

Integration
dependencies {

    implementation 'com.github.DharmeshLodhari:AdsManager:X.X.X'

}

Add Setting.gradle

maven { url 'https://jitpack.io' }

Usage
Pass Parameter
Example
 1.Class Context
 2.Facebook Banner Placement ID  (ex. For Test Ads "YOUR_PLACEMENT_ID").
 3. View (ex. id of Linearlayout or RelativeLayoyt)
 4. Boolean variable for testMode on of true/false.

<<<<<<< HEAD
 Just call Below simple one line code for show Facebook Banner Ads.
AdsClass.showFBBannner(context,placementID,view,testModeOn);

Just call Below simple one line code for show Facebook Interstitial Ads.
AdsClass.showFBInterstitialAds(context,placementId,testModeOn);
=======
 Just call Below simple one line code.
AdsClass.showFBBannner(Context context, String placementID, View view,boolean testModeOn);

Just call Below simple one line code for show Facebook Interstitial Ads.
AdsClass.showFBInterstitialAds(context,placementId,testModeOn);
>>>>>>> 46d7745e463b875cf21e76c1e5684c5b8f317635
