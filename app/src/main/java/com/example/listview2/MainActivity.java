package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<mesajModel> list;
    mesajAdapter adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        listDoldur();
    }
    private void tanimla(){
        listView = findViewById(R.id.listview);
    }
    private void listDoldur(){
        list = new ArrayList<>();
        mesajModel m1 = new mesajModel("Merhaba ben Niloya","Niloya", R.drawable.niloya);
        mesajModel m2 = new mesajModel("merhaba ben Mete","Mete",R.drawable.mete);
        list.add(m1);
        list.add(m2);
        adp = new mesajAdapter(list,this);
        listView.setAdapter(adp);

    }
}