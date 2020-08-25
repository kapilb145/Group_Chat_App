package com.google.firebase.kapil.friendlychat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.kapil.friendlychat.R;

public class StudentDetails extends AppCompatActivity {

    private TextView s_Name, s_Father, s_class, s_dob, s_school, s_Totalfees, s_lastPayout, s_Remaingfees;
    String name, Father, Class, Date, School, TotalFees, lastPayout, remainings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        s_Name = (TextView) findViewById(R.id.s_name);
        s_Father = (TextView) findViewById(R.id.s_Father);
        s_class = (TextView) findViewById(R.id.s_class);
        s_dob = (TextView) findViewById(R.id.s_dob);
        s_school = (TextView) findViewById(R.id.s_school);
        s_Totalfees = (TextView) findViewById(R.id.s_Totalfees);
        s_lastPayout = (TextView) findViewById(R.id.s_lastPayout);
        s_Remaingfees = (TextView) findViewById(R.id.s_Remaingfees);
        getData();

        s_Name.setText("Name : "+ name);
        s_Father.setText("Father's Name : "+Father);
        s_class.setText("Student Class : "+Class);
        s_dob.setText("Date of birth : "+Date);
        s_school.setText("School Name : "+School);
        s_Totalfees.setText("Total fees : "+TotalFees);
        s_lastPayout.setText("Last PayOut : "+lastPayout);
        s_Remaingfees.setText("Remaining Fees : "+remainings);
    }

    private void getData() {

        Bundle b = new Bundle();
        b = getIntent().getExtras();
        name = b.getString("Name");
        Class = b.getString("Class");
        Date = b.getString("Date");
        Father = b.getString("Father");
        School = b.getString("School");
        TotalFees = b.getString("TotalFees");
        lastPayout = b.getString("lastPayout");
        remainings = b.getString("remainings");


    }
}