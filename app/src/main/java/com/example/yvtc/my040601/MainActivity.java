package com.example.yvtc.my040601;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String,String>> group;
    ArrayList<List<Map<String,String>>> childList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group = new ArrayList<>();
        childList = new ArrayList<>();
        Map m1 = new HashMap();
        m1.put("type","主餐");
        group.add(m1);
        Map m2 = new HashMap();
        m2.put("type","附餐");
        group.add(m2);

        ArrayList<Map<String,String>> c1 = new ArrayList<>();
        ArrayList<Map<String,String>> c2 = new ArrayList<>();
        Map m3 = new HashMap();
        m3.put("meal","飯");
        c1.add(m3);
        Map m4 = new HashMap();
        m4.put("meal","麵");
        c1.add(m4);
        Map m5 = new HashMap();
        m5.put("meal","肉");
        c1.add(m5);
        childList.add(c1);
        
        Map m6 = new HashMap();
        m6.put("meal","咖啡");
        c2.add(m6);
        Map m7 = new HashMap();
        m7.put("meal","紅茶");
        c2.add(m7);
        Map m8 = new HashMap();
        m8.put("meal","果汁");
        c2.add(m8);
        childList.add(c2);

        SimpleExpandableListAdapter adapter = new SimpleExpandableListAdapter(MainActivity.this,
                                group, android.R.layout.simple_expandable_list_item_1, new String[] {"type"}, new int[] {android.R.id.text1},
                                childList, android.R.layout.simple_list_item_1, new String[] {"meal"}, new int[] {android.R.id.text1});

        ExpandableListView lv = (ExpandableListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);

    }
}
