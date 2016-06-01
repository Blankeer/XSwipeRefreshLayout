package com.neu.refreshdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.neu.refresh.NeuSwipeRefreshLayout;
import com.neu.refresh.NeuSwipeRefreshLayoutDirection;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout;
    private Button mButton;
    private NeuSwipeRefreshLayout mSwipeRefreshLayout;
    private String[] data = {"a", "b", "c", "d", "e", "f"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter.add("string1");
        adapter.add("haha");
        adapter.add("heihei");
        adapter.add("string1");
        adapter.add("haha");
        adapter.add("heihei");
        adapter.add("string1");
        adapter.add("haha");
        adapter.add("heihei");
        adapter.add("string1");
        adapter.add("haha");
        adapter.add("heihei");
        adapter.add("string1");
        adapter.add("haha");
        adapter.add("heihei");
        adapter.add("string1");
        adapter.add("haha");
        adapter.add("heihei");
        adapter.add("string1");
        adapter.add("haha");
        adapter.add("heihei");
        adapter.add("string1");
        adapter.add("haha");
        adapter.add("heihei");
        adapter.add("string1");
        adapter.add("haha");
        adapter.add("heihei");
        listView.setAdapter(adapter);
        mSwipeRefreshLayout = (NeuSwipeRefreshLayout) findViewById(R.id.swipe_container);

        mSwipeRefreshLayout.setDirection(NeuSwipeRefreshLayoutDirection.BOTH);

        mSwipeRefreshLayout.autoRefresh();

//        mSwipeRefreshLayout.setProgressBackgroundColor(Color.GREEN);
        mSwipeRefreshLayout.setProgressBackgroundResources(R.color.colorAccent);

        mSwipeRefreshLayout.setColorSchemeColors(Color.BLUE,Color.GREEN);

        mSwipeRefreshLayout.setOnRefreshListener(new NeuSwipeRefreshLayout.OnRefreshListener() {

            @Override
            public void onRefresh(NeuSwipeRefreshLayoutDirection direction) {
                if (direction == NeuSwipeRefreshLayoutDirection.TOP) {
                    mSwipeRefreshLayout.setRefreshing(false);
                } else if (direction == NeuSwipeRefreshLayoutDirection.BOTTOM) {
                    mSwipeRefreshLayout.setRefreshing(false);
                }
            }
        });
    }
}
