package com.example.mcqbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mcqbank.Adapter.SubjectAdapter;

public class ChooseSubjectActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    SubjectAdapter subjectAdapter;
    private String[] nineTenSubjectName;
    private int[] nineTenImages = {R.drawable.nine_bangla_first,R.drawable.nine_bagla_second,
            R.drawable.nine_physics,R.drawable.nine_chemistry
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_subject);

        recyclerView = findViewById(R.id.subjectRecyclerViewId);

        nineTenSubjectName = getResources().getStringArray(R.array.nine_ten_subject);

        subjectAdapter = new SubjectAdapter(getApplicationContext(),nineTenImages,nineTenSubjectName);
        recyclerView.setAdapter(subjectAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);


    }
}
