package com.example.tony.cooknow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        this.setTitle("Recipes");
    }
}
