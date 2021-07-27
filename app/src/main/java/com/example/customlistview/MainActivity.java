package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;

//data
    String[] title={
            "Master Android Pro",
        "Master Flutter App",
        "Master Android App",
        "Youtube Channel",
        "Rate Us"
};

    String[] description={
            "Download this app",
            "Learn Flutter",
            "Helping People",
            "Subscribe to this channel",
            "5 Stars please"
    };
    //images as array
    Integer[] imgs={
            R.drawable.images,
            R.drawable.images,
            R.drawable.images,
            R.drawable.images,
            R.drawable.images
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListAdapter adapter = new myListAdapter(
                this,
                title,
                description,
                imgs);

        listView=findViewById(R.id.list);
        listView.setAdapter(adapter);

        //handling events
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this,"Item 1 is Selected",Toast.LENGTH_SHORT).show();
                }

                if(position==1){
                    Toast.makeText(MainActivity.this,"Item 2 is Selected",Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Toast.makeText(MainActivity.this,"Item 3 is Selected",Toast.LENGTH_SHORT).show();
                }
                if(position==3){
                    Toast.makeText(MainActivity.this,"Item 4 is Selected",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}