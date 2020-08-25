package com.google.firebase.kapil.friendlychat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.kapil.friendlychat.modelclass.StudentData;


import com.google.firebase.kapil.friendlychat.adapter.Adapter;

import java.util.ArrayList;
import java.util.List;

public class feesList extends AppCompatActivity implements OnCustomItemClicListener {

    private RecyclerView feesList;
    RecyclerView.LayoutManager mLayoutManager;
    LinearLayoutManager HorizontalLayout;
    RecyclerView.Adapter mAdapter;

    private String Sname, Sclass, DateOfBirth, SFather, SschoolName, Totalfees, lastPayOut, Remainingfees;


    public List<StudentData> studentNameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees_list);
        feesList = (RecyclerView) findViewById(R.id.FeesList);

        studentNameList = new ArrayList<>();


        studentNameList.add(new StudentData("A student", "10th", "07/06/1998", "AA","SRPIC Amroha (U.P)", "40000", "000000", "400000"));
        studentNameList.add(new StudentData("B student", "12th", "12/05/1998", "BB","SRPIC Amroha (U.P)", "40000", "15000", "250000"));
        studentNameList.add(new StudentData("C student", "12th", "10/05/1998", "CC","SRPIC Amroha (U.P)", "40000", "5000", "35000"));
        studentNameList.add(new StudentData("D student", "8th", "11/04/1998", "DD","SRPIC Amroha (U.P)", "40000", "12000", "28000"));
        studentNameList.add(new StudentData("E student", "7th", "05/03/1998", "EE","SRPIC Amroha (U.P)", "40000", "18500", "21500"));
        studentNameList.add(new StudentData("F student", "5th", "23/02/1998", "FF","SRPIC Amroha (U.P)", "40000", "17000", "23000"));
        studentNameList.add(new StudentData("G student", "11th", "29/01/1998", "GG","SRPIC Amroha (U.P)", "40000", "12000", "28000"));
        studentNameList.add(new StudentData("H student", "11th", "21/10/1998", "HH","SRPIC Amroha (U.P)", "40000", "5000", "35000"));
        studentNameList.add(new StudentData("I student", "10th", "22/09/1998", "II","SRPIC Amroha (U.P)", "40000", "5000", "35000"));
        studentNameList.add(new StudentData("J student", "12th", "14/12/1998", "JJ","SRPIC Amroha (U.P)", "40000", "12000", "28000"));


        mLayoutManager = new LinearLayoutManager(getApplicationContext());

        mAdapter = new Adapter(feesList.this, studentNameList, this);
        feesList.setAdapter(mAdapter);


        feesList.setLayoutManager(mLayoutManager);


        HorizontalLayout = new LinearLayoutManager(feesList.this, LinearLayoutManager.VERTICAL, false);
        feesList.setLayoutManager(HorizontalLayout);


    }

    @Override
    public void onItemClickListener(int position, int flag) {
        if (flag == 1) {
            StudentData allData = studentNameList.get(position);


            Sname = allData.getStudentName();
            Sclass = allData.getStudentclass();
            DateOfBirth = allData.getStudentDob();
            SFather = allData.getFather();
            SschoolName = allData.getStudentSchoolName();
            Totalfees = allData.getTotalFees();
            lastPayOut = allData.getLastPayout();
            Remainingfees = allData.getRemainingFees();


            Intent intent = new Intent(feesList.this,StudentDetails.class);
            intent.putExtra("Name", Sname );
            intent.putExtra("Class", Sclass );
            intent.putExtra("Date", DateOfBirth );
            intent.putExtra("Father",SFather);
            intent.putExtra("School", SschoolName );
            intent.putExtra("TotalFees", Totalfees );
            intent.putExtra("lastPayout", lastPayOut );
            intent.putExtra("remainings", Remainingfees );
            startActivity(intent);


        }
    }
}