package com.hfad.android15;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class SecondFragment extends Fragment {


    private Button btn2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        initListeners();
    }

    private void initListeners() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                bundle.putString("key",sendText.getText().toString()); //содержит данные
                String result2 = getArguments().getString("key1"); //getting data from past fragments
                Bundle bundle = new Bundle(); //коробка
                bundle.putString("key2",result2);
                ThirdFragment thirdFragment = new ThirdFragment();

                Toast.makeText(requireContext(), result2, Toast.LENGTH_SHORT).show();

                thirdFragment.setArguments(bundle);

                getParentFragmentManager().beginTransaction().replace(R.id.mainContainer, thirdFragment).commit();

            }
        });
    }

    private void initViews(View view) {
        btn2 = view.findViewById(R.id.btn_send2);


    }
}