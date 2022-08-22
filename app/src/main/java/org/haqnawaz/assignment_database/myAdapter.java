package org.haqnawaz.assignment_database;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.haqnawaz.assignment_database.*;

import java.util.ArrayList;

public class myAdapter extends ArrayAdapter<StudentModel> {
    public myAdapter(@NonNull Context context, ArrayList<StudentModel> studentsArrayList) {
        super(context,0, studentsArrayList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        StudentModel studentModel = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.database_view,parent,false);
        TextView textViewName = convertView.findViewById(R.id.nameTextView);
        TextView textViewRoll = convertView.findViewById(R.id.rollTextView);
        Button dltButton = convertView.findViewById(R.id.deleteButton);
        dltButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(getContext());
                dbHelper.deleteStudent(studentModel.getId());
            }
        });
        Button updateButton = convertView.findViewById(R.id.editButton);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder al = new AlertDialog.Builder(getContext());
                View v = LayoutInflater.from(getContext()).inflate(R.layout.activity_update,parent,false);
                final EditText editName = v.findViewById(R.id.editTextName);
                final EditText editRollNo = v.findViewById(R.id.editTextRollNumber);
                Switch isEnroll = v.findViewById(R.id.switchStudent);
                Button saveButton = v.findViewById(R.id.buttonSave);
                al.setView(v);
                editName.setText(studentModel.getName());
                editRollNo.setText(studentModel.getRollNmber());
                final AlertDialog alertDialog = al.show();
                saveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DBHelper dbHelper = new DBHelper(getContext());
                        dbHelper.updateStudent(editName.getText().toString(),editRollNo.getText().toString(),isEnroll.isChecked(),studentModel.getId());
                        alertDialog.dismiss();
                    }
                });
            }
        });
        textViewName.setText(studentModel.getName());
        textViewRoll.setText(studentModel.getRollNmber());
        return convertView;
    }
}
