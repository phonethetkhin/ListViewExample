package com.ptk.listviewexample.ui.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.ptk.listviewexample.R;
import com.ptk.listviewexample.ui.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {
    ListView lvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            initViews();
        } catch (Exception e) {
            e.printStackTrace();
        }
        setAdapter();
    }

    private void initViews() {
        lvMain = findViewById(R.id.lvMain);
    }

    private void setAdapter() {
        MyAdapter myAdapter = new MyAdapter(pumpData(), pumpYear());
        lvMain.setAdapter(myAdapter);
    }

    private String[] pumpData() {
        return new String[]{"Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net",
                "Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net",
                "Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net",
                "Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net"};
    }

    private String[] pumpYear() {
        return new String[]{"2006", "2007", "2008", "2009", "2006", "2006", "2006", "2006", "Asp.net", "Vb.net",
                "Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net",
                "Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net",
                "Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net"};
    }

    private String[] pumpFrameworks() {
        return new String[]{"Laravel", "Asp.net", "Laravel", "Laravel", "Laravel", "Laravel", "Laravel", "2006", "Asp.net", "Vb.net",
                "Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net",
                "Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net",
                "Java", "Kotlin", "PHP", "Swift", "Dart", "C", "C++", "C#", "Asp.net", "Vb.net"};
    }
}