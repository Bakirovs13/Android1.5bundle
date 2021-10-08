package com.hfad.android15;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FiveFragment extends Fragment {

    private TextView textView;
    private Button btn5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_five, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.getDataTV);
        initListeners(view);


    }

    private void initListeners(View view) {

        view.findViewById(R.id.btn_send5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = getArguments();
                if(bundle != null) {

                    String data = bundle.getString("key4");

                    textView.setText(data);
                }else{
                    Toast.makeText(requireContext(),"Error",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    }
