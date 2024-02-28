package com.example.micrproj;

import androidx.appcompat.app.AppCompatActivity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    Button a, b, c, d, e,f,g,h,i,j,k,l,m,n;
    private SoundPool soundpool;
    private int sound_a, sound_b, sound_c, sound_d, sound_e, sound_f,sound_g,sound_h,sound_i,sound_j,sound_k,sound_l,sound_m,sound_n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.a1);
        b = findViewById(R.id.b1);
        c = findViewById(R.id.c1);
        d = findViewById(R.id.d1);
        e = findViewById(R.id.e1);
        f = findViewById(R.id.f1);
        g = findViewById(R.id.g1);
        h = findViewById(R.id.h1);
        i = findViewById(R.id.i1);
        j = findViewById(R.id.j1);
        k = findViewById(R.id.k1);
        l = findViewById(R.id.l1);
        m = findViewById(R.id.m1);
        n = findViewById(R.id.n1);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundpool = new SoundPool.Builder().setMaxStreams(5).build();
        } else {
            soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sound_a = soundpool.load(this, R.raw.s1, 1);
        sound_b = soundpool.load(this, R.raw.s2, 2);
        sound_c = soundpool.load(this, R.raw.s3, 3);
        sound_d = soundpool.load(this, R.raw.s4, 4);
        sound_e = soundpool.load(this, R.raw.s5, 5);
        sound_f = soundpool.load(this, R.raw.s6, 5);
        sound_g = soundpool.load(this, R.raw.s7, 5);
        sound_h = soundpool.load(this, R.raw.s8, 5);
        sound_i = soundpool.load(this, R.raw.s9, 5);
        sound_j = soundpool.load(this, R.raw.s10, 5);
        sound_k = soundpool.load(this, R.raw.s11, 5);
        sound_l = soundpool.load(this, R.raw.s12, 5);
        sound_m = soundpool.load(this, R.raw.s13, 5);
        sound_n = soundpool.load(this, R.raw.s14, 5);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_a, 1, 1, 0, 0, 1);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_b, 1, 1, 0, 0, 1);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_c, 1, 1, 0, 0, 1);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_d, 1, 1, 0, 0, 1);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_e, 1, 1, 0, 0, 1);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_f, 1, 1, 0, 0, 1);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_g, 1, 1, 0, 0, 1);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_h, 1, 1, 0, 0, 1);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_i, 1, 1, 0, 0, 1);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_k, 1, 1, 0, 0, 1);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_k, 1, 1, 0, 0, 1);
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_l, 1, 1, 0, 0, 1);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_m, 1, 1, 0, 0, 1);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sound_n, 1, 1, 0, 0, 1);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (soundpool != null) {
            soundpool.release();
            soundpool = null;
        }
    }
}
