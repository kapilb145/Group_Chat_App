package com.google.firebase.kapil.friendlychat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.studentName> {

    private Context context;
    private OnCustomItemClicListener onCustomItemClicListener;

    private List<StudentData> studentNameList = new ArrayList<>();

    public Adapter(Context context, List<StudentData> studentNameList, OnCustomItemClicListener onCustomItemClicListener) {
        this.context = context;
        this.studentNameList = studentNameList;
        this.onCustomItemClicListener = onCustomItemClicListener;
    }

    @NonNull
    @Override
    public studentName onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_name_adapter, parent, false);
        studentName sd = new studentName(view);
        return sd;
    }

    @Override
    public void onBindViewHolder(@NonNull studentName holder, final int position) {
        StudentData currentItem = studentNameList.get(position);

        holder.studentName.setText(currentItem.getStudentName());
        holder.studentclass.setText(currentItem.getStudentclass());
        holder.studentDob.setText(currentItem.getStudentDob());
        holder.studentschool.setText(currentItem.getStudentSchoolName());

        holder.studentDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  onCustomItemClicListener.onItemClickListener(position,1);
            }
        });

    }

    @Override
    public int getItemCount() {
        return studentNameList.size();
    }

    public class studentName extends RecyclerView.ViewHolder {
        private TextView studentName, studentclass, studentDob, studentschool;
        private CardView cardView;
        private Button studentDetails;

        public studentName(@NonNull View itemView) {
            super(itemView);

            studentName =(TextView) itemView.findViewById(R.id.sName);
            studentclass =  (TextView)itemView.findViewById(R.id.Class);
            studentDob =(TextView) itemView.findViewById(R.id.DOB);
            studentschool = (TextView) itemView.findViewById(R.id.SchoolName);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
            studentDetails = (Button) itemView.findViewById(R.id.studentDetails);
        }
    }
}
