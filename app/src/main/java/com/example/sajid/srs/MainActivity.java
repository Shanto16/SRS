package com.example.sajid.srs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton r_retake,r_retake_new,r_new;
    private EditText currentCG,targetCG,addCourse;
    private ImageView add;
    private Button calculate;
    private RecyclerView course_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_new=findViewById(R.id.rb_new);
        r_retake = findViewById(R.id.rb_retake);
        r_retake_new=findViewById(R.id.rb_retake_new);

        currentCG = findViewById(R.id.et_current_cgpa);
        targetCG = findViewById(R.id.et_target_cgpa);
        addCourse = findViewById(R.id.et_add_course);

        add=findViewById(R.id.btn_add);

        calculate = findViewById(R.id.btn_calculate);

        course_list = findViewById(R.id.rv_course_list);
    }
}
