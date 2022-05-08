package com.example.shimmer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import com.example.shimmer.databinding.ActivityDetailBinding;

public class Detail extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        binding = ActivityDetailBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            showData();
        }, 5000);
    }

    private void showData() {

        binding.containerLoading.setVisibility(View.GONE);
        binding.container.setVisibility(View.VISIBLE);

    }
}