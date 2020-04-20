package javaoneworld.android.com.custombottomdialog;

import androidx.appcompat.app.AppCompatActivity;
import javaoneworld.android.com.custombottomdialog.fragment.FilterBottomfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /**
     * Created by amitmishra on 20/04/2020.
     */

    private Button btnOpenDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenDialog = findViewById(R.id.btnOpenDialog);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FilterBottomfragment filterBottomFragment = new FilterBottomfragment();
                //set filterBottomFragment.setCancelable(true) if you want to cancel on touch out side;
                filterBottomFragment.setCancelable(true);
                //filterBottomFragment.setFilterTagClickListener(this);
                filterBottomFragment.setCancelable(true);
                filterBottomFragment.show(getSupportFragmentManager(), filterBottomFragment.getTag());
            }
        });

    }
}
