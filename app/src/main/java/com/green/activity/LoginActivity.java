package com.green.activity;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.green.R;
import com.green.utils.StatusBarUtil;
import com.green.utils.SystemStatusManager;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.transparencyBar(this);
        StatusBarUtil.StatusBarLightMode(this);
        setContentView(R.layout.activity_login);
        StatusBarUtil.setupUI(this,findViewById(R.id.activity_login));

    }
}
