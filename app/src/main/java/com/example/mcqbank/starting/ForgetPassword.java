package com.example.mcqbank.starting;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.mcqbank.R;

import java.util.Calendar;

public class ForgetPassword extends AppCompatActivity {

    private static final String TAG= "ForgetPassword";
    private TextView mDisplayDate;
    private  DatePickerDialog.OnDateSetListener mDatesetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);


        mDisplayDate=(TextView) findViewById((R.id.day_picker_selected_date_layout));

        mDisplayDate.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(ForgetPassword.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth, mDatesetListener,year,month,day);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDatesetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                //Log.d(TAG,"onDateSet; date;" +month "/" +day "/"+year);
                month=month+1;
                String date=month+"/"+day+"/"+year;
                mDisplayDate.setText(date);
            }
        };

    }
    public void Register(View view) {
    }

}

