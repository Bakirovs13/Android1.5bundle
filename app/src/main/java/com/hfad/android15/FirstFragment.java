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


public class FirstFragment extends Fragment {

    private Button btn1;
    private TextView sendText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        initListeners();
    }

    private void initListeners() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle(); // created bundle for managing data between fragments
                bundle.putString("key1", sendText.getText().toString()); // added data to bundle
                SecondFragment secondFragment = new SecondFragment(); // created exemplar of fragment
                secondFragment.setArguments(bundle); // setting args to next fragment ( bundle )
                getParentFragmentManager()
                        .beginTransaction()
                        .replace(R.id.mainContainer, secondFragment)
                        .commit();  // replacing fragments
            }
        });
    }

    private void initViews(View view) {
        btn1 = view.findViewById(R.id.btn_send1);

        sendText = view.findViewById(R.id.text1_et);

    }


}