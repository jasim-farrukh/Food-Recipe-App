package com.example.labproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static int count =0;
    SearchView mySearchView;
    ListView listView;


    public void nextDish(View v){
        TextView textDish= findViewById(R.id.textView3);
        TextView dishHeading= findViewById(R.id.Heading1);
        ImageView foodImg= findViewById(R.id.imageView);
        count++;
        if(count>3)
            count=0;

        if(count==0){
            dishHeading.setText("STEAK");
            foodImg.setImageResource(R.drawable.steak);
            textDish.setText("A steak is a meat generally sliced across the muscle fibers, potentially including a bone. It is normally grilled, though can also be 		pan-fried. It is often grilled in an attempt to replicate the flavor of steak cooked over the glowing coals of an open fire..");
        }else if(count==1){
            dishHeading.setText("Bacon");
            foodImg.setImageResource(R.drawable.bacon);
            textDish.setText("Bacon is a type of salt-cured pork made from various cuts, typically from the pork belly or from the less fatty back cuts. It is eaten on its own, as a side dish, or used as a minor ingredient to flavour dishes.");
        }else if(count==2){
            dishHeading.setText("Hamburger");
            foodImg.setImageResource(R.drawable.hamburger);
            textDish.setText("A hamburger is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled.");
        }else if(count==3){
            dishHeading.setText("Barbecue");
            foodImg.setImageResource(R.drawable.barbecue);
            textDish.setText("Barbecue or barbeque is a cooking method, a cooking device, a style of food, and a name for a meal or gathering at which this style of food is cooked and served. A barbecue can refer to the cooking method itself, the meat cooked this way, or to a type of social event featuring this type of cooking.");
        }
    }


    public void prevDish(View v){
        TextView textDish= findViewById(R.id.textView3);
        TextView dishHeading= findViewById(R.id.Heading1);
        ImageView foodImg= findViewById(R.id.imageView);
        foodImg.setVisibility(View.GONE);
        count--;
        if(count<0)
            count=3;

        if(count==0){
            dishHeading.setText("STEAK");
            foodImg.setImageResource(R.drawable.steak);
            textDish.setText("A steak is a meat generally sliced across the muscle fibers, potentially including a bone. It is normally grilled, though can also be 		pan-fried. It is often grilled in an attempt to replicate the flavor of steak cooked over the glowing coals of an open fire..");
        }else if(count==1){
            dishHeading.setText("Bacon");
            foodImg.setImageResource(R.drawable.bacon);
            textDish.setText("Bacon is a type of salt-cured pork made from various cuts, typically from the pork belly or from the less fatty back cuts. It is eaten on its own, as a side dish, or used as a minor ingredient to flavour dishes.");
        }else if(count==2){
            dishHeading.setText("Hamburger");
            foodImg.setImageResource(R.drawable.hamburger);
            textDish.setText("A hamburger is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled.");
        }else if(count==3){
            dishHeading.setText("Barbecue");
            foodImg.setImageResource(R.drawable.barbecue);
            textDish.setText("Barbecue or barbeque is a cooking method, a cooking device, a style of food, and a name for a meal or gathering at which this style of food is cooked and served. A barbecue can refer to the cooking method itself, the meat cooked this way, or to a type of social event featuring this type of cooking.");
        }
    }


    public void showImg(View v){
        TextView textDish= findViewById(R.id.textView3);
        ImageView foodImg= findViewById(R.id.imageView);
        textDish.setVisibility(v.INVISIBLE);
        foodImg.setVisibility(v.VISIBLE);
    }

    public void detailOfDish(View v){
        TextView textDish= findViewById(R.id.textView3);
        ImageView foodImg= findViewById(R.id.imageView);
        textDish.setVisibility(v.VISIBLE);
        foodImg.setVisibility(v.INVISIBLE);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySearchView = (SearchView) findViewById(R.id.searchView);
        ArrayList<String> list = new ArrayList<String>();
        listView = (ListView) findViewById(R.id.search_list);
        ArrayAdapter<String> adapter = null;
        listView.setAdapter(adapter);
        list.add("steak");
        list.add("bacon");
        list.add("barbecue");
        list.add("hamburger");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        ImageView foodImg = findViewById(R.id.imageView);
        foodImg.setImageResource(R.drawable.steak);
        foodImg.setImageResource(R.drawable.bacon);
        foodImg.setImageResource(R.drawable.barbecue);
        foodImg.setImageResource(R.drawable.hamburger);


    }
   /*     public boolean onCreateOptionsMenu(Menu menu){
            MenuInflater inflater= getMenuInflater();
            inflater.inflate(R.menu.action, menu);
            return super.onCreateOptionsMenu(menu);
            }
        }
        */
    }
