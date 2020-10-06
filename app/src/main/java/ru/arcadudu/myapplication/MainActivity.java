package ru.arcadudu.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);

        List<Fragment> list = new ArrayList<>();
        list.add(new Page1());
        list.add(new Page2());
        list.add(new Page3());

        adapter = new PagerAdapter(getSupportFragmentManager(), list);
         pager.setAdapter(adapter);


    }
}