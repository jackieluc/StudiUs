package kourosh.calgaryhacks.Prof;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import kourosh.calgaryhacks.R;

public class ProfMain extends AppCompatActivity {
    private ArrayList<Course> courseList;
    private String profEmail;
    private ListView lv;
    private CourseAdapter courseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getCourseList();

        courseAdapter = new CourseAdapter(this,courseList);
        lv = (ListView) findViewById(R.id.profMainListview);
        lv.setAdapter(courseAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(view.getContext(),ProfCourse.class);
//                intent.putExtra("ID",courseList.get(i).id);
//                startActivity(intent);
            }
        });

    }

    private void getCourseList(){

        //Access database for courses based on prof's email

        courseList= new ArrayList<Course>();
        courseList.add(new Course(232,"Swager","Macneil"));
        courseList.add(new Course(22332,"Swag3212er","Macneil"));
        courseList.add(new Course(23432,"Swage1212r","Macneil"));
        courseList.add(new Course(232322,"Swage121r","Macneil"));


    }



    public void openCourseAdding(View view){
        startActivity(new Intent(this,CourseAdding.class));

    }

    @Override
    protected void onResume() {
        super.onResume();
        courseList.add(new Course(123,"2ewrwfa","Afadssaf"));
        courseAdapter.update();
        lv.setAdapter(courseAdapter);

    }
}