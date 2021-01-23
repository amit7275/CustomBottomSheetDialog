package javaoneworld.android.com.custombottomdialog;

import androidx.appcompat.app.AppCompatActivity;
import javaoneworld.android.com.custombottomdialog.fragment.FilterBottomfragment;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /**
     * Created by amitmishra on 20/04/2020.
     */

    private ImageView btnOpenDialog;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenDialog = findViewById(R.id.btnOpenDialog);
        animationDrawable = (AnimationDrawable) btnOpenDialog.getBackground();

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animationDrawable.start();
                FilterBottomfragment filterBottomFragment = new FilterBottomfragment();
                //set filterBottomFragment.setCancelable(true) if you want to cancel on touch out side;
                filterBottomFragment.setCancelable(true);
                //filterBottomFragment.setFilterTagClickListener(this);
                filterBottomFragment.setCancelable(true);
                filterBottomFragment.show(getSupportFragmentManager(),
                        filterBottomFragment.getTag());
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        FilterBottomfragment filterBottomFragment = new FilterBottomfragment();
        /*if you want to cancel on touch out side then uncomment below line*/
        //set filterBottomFragment.setCancelable(true) ;
        filterBottomFragment.setCancelable(true);
        //filterBottomFragment.setFilterTagClickListener(this);
        filterBottomFragment.setCancelable(true);
        filterBottomFragment.show(getSupportFragmentManager(),
                filterBottomFragment.getTag());
    }
}
