package com.example.mcqbank;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends Activity implements Runnable
{

    Thread mThread;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        mThread = new Thread(this);

        mThread.start();
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1500);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            startActivity(new Intent(SplashScreen.this, Login.class));

            finish();
        }
    }

}
