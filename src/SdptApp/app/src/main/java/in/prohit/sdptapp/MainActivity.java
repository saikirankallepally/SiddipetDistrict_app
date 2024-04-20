package in.prohit.sdptapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void bus_bt(View view) {
        Intent in=new Intent(this,Bus.class);
        startActivity(in);
    }

    public void torism_bt(View view) {
        Intent toin=new Intent(this,Tourism.class);
        startActivity(toin);
    }

    public void school_bt(View view) {
        Intent scin=new Intent(this,Schools.class);
        startActivity(scin);
    }


    public void college_bt(View view) {
        Intent coin=new Intent(this,Colleges.class);
        startActivity(coin);
    }


    public void emergency_bt(View view) {
        Intent ein=new Intent(this,Emergency.class);
        startActivity(ein);
    }

    public void malls_bt(View view) {
        Intent mallin=new Intent(this,Malls.class);
        startActivity(mallin);
    }

    public void mandal_bt(View view) {
        Intent manin=new Intent(this,Mandals.class);
        startActivity(manin);
    }

    public void villages_bt(View view) {
        Intent villin=new Intent(this,Villages.class);
        startActivity(villin);
    }

    public void share_bt(View view) {
    }

    public void movies_bt(View view) {
        Intent movin=new Intent(this,Movies.class);
        startActivity(movin);

    }

    public void feedback_bt(View view) {
    }

    public void hotel(View view) {
        Intent hotin=new Intent(this,Rest.class);
        startActivity(hotin);

    }
}

