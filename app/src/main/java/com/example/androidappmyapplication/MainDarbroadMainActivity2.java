package com.example.androidappmyapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Notification;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainDarbroadMainActivity2 extends AppCompatActivity {
    Toolbar MbtoolBar;
    ViewFlipper MBviewflipper;
    RecyclerView MBrecyclerView;
    NavigationView MBnavigationView;
    ListView MBlistview;
    DrawerLayout MBdrawbleLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_darbroad_main2);
        Anhxa();
        Actionbar();
        ActionViewFlipper();
    }

    private void ActionViewFlipper() {
        List<String> mangquangcao=new ArrayList<>();
        mangquangcao.add("https://mauweb.monamedia.net/thegioididong/wp-content/uploads/2017/12/banner-Le-hoi-phu-kien-800-300.png");
        mangquangcao.add("https://mauweb.monamedia.net/thegioididong/wp-content/uploads/2017/12/banner-HC-Tra-Gop-800-300.png");
        mangquangcao.add("https://mauweb.monamedia.net/thegioididong/wp-content/uploads/2017/12/banner-big-ky-nguyen-800-300.jpg");
        for(int i = 0; i < mangquangcao.size(); i++){
            ImageView imageView=new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            MBviewflipper.addView(imageView);
        }
        MBviewflipper.setFlipInterval(3000);
        MBviewflipper.setAutoStart(true);
        Animation slide_in=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation slide_out=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        MBviewflipper.setInAnimation(slide_in);
        MBviewflipper.setOutAnimation(slide_out);
    }

    private void Actionbar(){
        setSupportActionBar(MbtoolBar);
        MbtoolBar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        MbtoolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MBdrawbleLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void Anhxa() {
        MbtoolBar=findViewById(R.id.MainBroadToolBar);
        MBviewflipper=findViewById(R.id.MainDarbroadViewFlipper);
        MBrecyclerView=findViewById(R.id.MainDarbroadRecyclerView);
        MBnavigationView=findViewById(R.id.MainDarbroadNavigationView);
        MBlistview=findViewById(R.id.MainDarbroadListView);
        MBdrawbleLayout=findViewById(R.id.MainBroadDrawerLayout);
    }
}