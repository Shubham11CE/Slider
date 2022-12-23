package com.singh.shubham.slider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ParentModelClass> parentModelClassArrayList;
    ArrayList<ChildModelClass> childModelClassArrayList;
    ArrayList<ChildModelClass> CDC_Placements;
    ArrayList<ChildModelClass> CDC_Internships;
    ArrayList<ChildModelClass> KnowYourDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        recyclerView=findViewById(R.id.rv_parent);
        childModelClassArrayList=new ArrayList<>();
        CDC_Placements=new ArrayList<>();
        CDC_Internships= new ArrayList<>();
        KnowYourDepartment= new ArrayList<>();
        parentModelClassArrayList= new ArrayList<>();
        ParentAdapter parentAdapter;

        CDC_Placements.add(new ChildModelClass(R.drawable.img));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_1));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_2));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_3));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_4));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_5));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_6));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_7));
        CDC_Placements.add(new ChildModelClass(R.drawable.img_8));

        parentModelClassArrayList.add(new ParentModelClass("CDC Placements",CDC_Placements));

        CDC_Internships.add(new ChildModelClass(R.drawable.img));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_1));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_2));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_3));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_4));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_5));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_6));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_7));
        CDC_Internships.add(new ChildModelClass(R.drawable.img_8));

        parentModelClassArrayList.add(new ParentModelClass("CDC Internships",CDC_Internships));

        KnowYourDepartment.add(new ChildModelClass(R.drawable.img));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_1));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_2));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_3));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_4));
        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_5));
//        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_6));
//        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_7));
//        KnowYourDepartment.add(new ChildModelClass(R.drawable.img_8));

        parentModelClassArrayList.add(new ParentModelClass("Know Your Department",KnowYourDepartment));


        childModelClassArrayList.clear();
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_1));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_2));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_3));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_4));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_5));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_6));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_7));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.img_8));

        parentModelClassArrayList.add(new ParentModelClass("Institute ID Benefits",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Study Material",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("General Fundae",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("List Of Socities",childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Academic Information",childModelClassArrayList));

        parentAdapter=new ParentAdapter(parentModelClassArrayList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);
        parentAdapter.notifyDataSetChanged();

    }
}