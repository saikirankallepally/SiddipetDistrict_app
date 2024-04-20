package in.prohit.sdptapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread th=new Thread()
        {
            @Override
            public void run()
            {
                try{
                    sleep(3000);

                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    {
                        android.content.Intent in=new android.content.Intent(getApplicationContext(),MainActivity.class);
                        startActivity(in);
                        finish();
                    }
                    super.run();
                }
            }

            };th.start();
        }
    }

