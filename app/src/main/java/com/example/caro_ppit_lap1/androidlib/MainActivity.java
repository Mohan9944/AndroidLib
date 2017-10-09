package com.example.caro_ppit_lap1.androidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mylibrary.RssFeedProvider;
import com.example.mylibrary.RssItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RssItem> list = RssFeedProvider
                .parse("http://www.vogella.com/article.rss");
        String itemListAsString = list.toString();

    }
}
