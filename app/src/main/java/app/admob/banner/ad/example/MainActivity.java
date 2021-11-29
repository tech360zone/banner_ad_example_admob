package app.admob.banner.ad.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.admob.banner.ad.example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private AdHelper adHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adHelper = new AdHelper(this);
        adHelper.loadBannerAd(binding.bannerLayout);
    }
}