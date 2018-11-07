package com.example.rajatpratapsingh.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Hero> heroList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        heroList = new ArrayList<>();


        heroList.add(new Hero(R.drawable.food_1,"Italian Pizza","Vegetarian"));
        heroList.add(new Hero(R.drawable.food_2,"Wrap & Rolls","Vegetarian"));

        heroList.add(new Hero(R.drawable.food_3,"Grilld Burger","Vegetarian"));
        heroList.add(new Hero(R.drawable.food_4,"Paneer Tikka","Vegetarian"));

        heroList.add(new Hero(R.drawable.food_5,"Veg Sprouts","Vegetarian"));
        heroList.add(new Hero(R.drawable.food_6,"Street Foods","Vegetarian"));

        heroList.add(new Hero(R.drawable.food_7,"Honey Cakes","Vegetarian"));
        heroList.add(new Hero(R.drawable.food_8,"French Fries","Vegetarian"));

        heroList.add(new Hero(R.drawable.food_9,"Indian Gravy","Vegetarian"));
        heroList.add(new Hero(R.drawable.food_10,"O Doughnuts","Vegetarian"));

        heroList.add(new Hero(R.drawable.food_11,"Stuffe Cakes","Vegetarian"));
        heroList.add(new Hero(R.drawable.food_12,"Salad Bowls","Vegetarian"));

        heroList.add(new Hero(R.drawable.food_13,"Chickken Fry","Non-Vegetarian"));
        heroList.add(new Hero(R.drawable.food_14,"Sambhar Dosa","Vegetarian"));

        heroList.add(new Hero(R.drawable.food_15,"spaghetti","Vegetarian"));
        heroList.add(new Hero(R.drawable.food_16,"Punjabi Gravies","Vegetarian"));

        heroList.add(new Hero(R.drawable.food_17,"Brunch Tikkas","Vegetarian"));
        heroList.add(new Hero(R.drawable.food_18,"Brunch Patties","Vegetarian"));

        heroList.add(new Hero(R.drawable.food_19,"Gujjoo Dosa","Vegetarian"));
        heroList.add(new Hero(R.drawable.food_20,"Vadaa Paus","Vegetarian"));


        listView =(ListView) findViewById(R.id.listView);
        MyCustomListAdapter adapter = new MyCustomListAdapter(this, R.layout.customlayout,heroList);

        listView.setAdapter(adapter);
    }
}
