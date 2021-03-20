package com.example.querygallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.GenericArrayType;

public class MainActivity extends AppCompatActivity {

    //This activity is intentionally left empty for now
    /*
     * RecyclerView is a type of View that recycles a position in your View. ex when an item scrolls off screen
     * RecyclerView does not destroy its view. Instead RecyclerView  reuses the view for new items that have
     * scrolled on screen.
     */
    RecyclerView folderRecycler;
    TextView empty;

    private static final int EXTERNAL_STORAGE_REQUEST_PERMISSION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchActivity(View v){
        Intent intent = new Intent(this, GalleryActivity.class);
        startActivity(intent);
    }
}