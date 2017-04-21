package com.example.akshay_20.assignment;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Seller extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DetailsAdapter adapter;
    private List<Details> detailList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view2);

        detailList = new ArrayList<>();
        adapter = new DetailsAdapter(this, detailList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new itemDecoration(this, LinearLayoutManager.VERTICAL));


        recyclerView.setAdapter(adapter);

        prepareDetail();

    }
    private void prepareDetail() {
        int[] covers = new int[]{
                R.drawable.user,
                R.drawable.phone,
                R.drawable.email,
                R.drawable.mark,
               };
        Details detail = new Details("Full Name", "Sachin Parekh",covers[0]);
        detailList.add(detail);

        detail = new Details("Email address", "appuser@gmail.com",covers[2]);
        detailList.add(detail);

        detail = new Details("Phone Number", "7024562914",covers[1]);
        detailList.add(detail);

        detail = new Details("City", "Surat,Gujrat , India",covers[3]);
        detailList.add(detail);


        adapter.notifyDataSetChanged();
    }
}
