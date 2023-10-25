package com.example.tareagpsmapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2;
    private ProgressBar pb;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb=findViewById(R.id.progressBar);
        btn1=findViewById(R.id.btn_iniciar);
        btn2=findViewById(R.id.btn_video);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pb.setVisibility(View.VISIBLE);
                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;
                        pb.setProgress(counter);
                        if(counter == 100){
                            timer.cancel();

                            Intent opcion = new Intent(MainActivity.this,sedes.class);
                            startActivity(opcion);
                        }
                    }
                };
                timer.schedule(timerTask,0,50);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pb.setVisibility(View.VISIBLE);
                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;
                        pb.setProgress(counter);
                        if(counter == 100){
                            timer.cancel();

                            Intent opcion = new Intent(MainActivity.this,VideoPromocional.class);
                            startActivity(opcion);
                        }
                    }
                };
                timer.schedule(timerTask,0,50);
            }
        });
    }

    public void bInicio(View view){
        Intent bInicio = new Intent(this,sedes.class);
        startActivity(bInicio);
    }
    public void vVideo(View view){
        Intent vVideo = new Intent(this,VideoPromocional.class);
        startActivity(vVideo);
    }
}