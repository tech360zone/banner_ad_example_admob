package app.admob.banner.ad.example;

import android.app.Activity;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class AdHelper {

    private final Activity activity;
    private AdView adView;

    public AdHelper(Activity activity) {
        this.activity = activity;
    }

    public void loadBannerAd(LinearLayout adLayout) {
        adView = new AdView(activity);
        adView.setAdUnitId(activity.getResources().getString(R.string.banner_ad_unit_id));
        adLayout.addView(adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.setAdSize(AdSize.LARGE_BANNER); //Here you can change the "AdSize"
        adView.loadAd(adRequest);
    }
}
