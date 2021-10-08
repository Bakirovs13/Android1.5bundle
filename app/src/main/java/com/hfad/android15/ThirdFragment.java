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


public class ThirdFragment extends Fragment {

    private Button btn3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        initListeners();
    }
    private void initListeners() {
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result3 = getArguments().getString("key2");
                Bundle bundle = new Bundle();
                bundle.putString("key3",result3);
                FourFragment fourFragment = new FourFragment();

                Toast.makeText(requireContext(), result3, Toast.LENGTH_SHORT).show();

                fourFragment.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.mainContainer,fourFragment).commit();
            }
        });
    }

    private void initViews(View view) {

        btn3 = view.findViewById(R.id.btn_send3);
    }
    }