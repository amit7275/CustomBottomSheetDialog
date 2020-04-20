package javaoneworld.android.com.custombottomdialog.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import javaoneworld.android.com.custombottomdialog.R;

/**
 * Created by amitmishra on 20/04/2020.
 */

public class FilterBottomfragment extends BottomSheetDialogFragment implements View.OnClickListener {

    private TextView txtJava, txtAndroid, txtWorld;
    private Button btnSubmit;

    private Context mContext;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflate your custom layout in place of bottom_dialog
      View view=inflater.inflate(R.layout.bottom_dialog,container,false);

      txtJava = view.findViewById(R.id.txtJava);
      txtAndroid = view.findViewById(R.id.txtAndroid);
      txtWorld = view.findViewById(R.id.txtWorld);
      btnSubmit = view.findViewById(R.id.btnSubmit);

        txtJava.setOnClickListener(this);
        txtAndroid.setOnClickListener(this);
        txtWorld.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

      return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme);

    }

    @Override
    public void onAttach(Context context) {
        mContext = (FragmentActivity) context;
        super.onAttach(context);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.txtJava:
                Toast.makeText(mContext, txtJava.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.txtAndroid:
                Toast.makeText(mContext, txtAndroid.getText().toString(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.txtWorld:
                Toast.makeText(mContext, txtWorld.getText().toString(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnSubmit:

                dismiss();
                break;

        }
    }
}
