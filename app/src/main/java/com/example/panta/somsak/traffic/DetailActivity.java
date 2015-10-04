package com.example.panta.somsak.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    TextView titleTextView, detailTextView;
    ImageView trafficImageView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWiget();  //Alt+Enter Shot key to create method

        //Show View
        showView();

    } //On Create

    public void clickBack(View view) {
        //  จะต้องไปเปิด android:onClick="clickBack" ที่หน้า activity_detail.xml
        //finish คือการปิด Activity นั้น ๆ
        finish();
    }// Click back



    private void showView() {
        //Show title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //Show Image
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intIcon);

        //Show Detail อ้างไปถึง File Xml ที่ได้สร้างไว้ที่ โฟร์เดอร์ Value ชื่อ Detail.xml
        String[] strDetail = getResources().getStringArray(R.array.detail);

        detailTextView.setText(strDetail[getIntent().getIntExtra("index",0)]);
    }

    private void bindWiget() {
        titleTextView = (TextView) findViewById(R.id.txtDetailTitle);
        detailTextView = (TextView) findViewById(R.id.txtDetail);
        trafficImageView = (ImageView) findViewById(R.id.imvDetailTraffic);

    }
} //Main class
