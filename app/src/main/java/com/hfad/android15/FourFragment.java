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

import com.hfad.android15.databinding.FragmentFirstBinding;
import com.hfad.android15.databinding.FragmentFourBinding;


public class FourFragment extends Fragment {

    private Button btn4;
    private FragmentFourBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_four, container, false);
        binding = FragmentFourBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        initListeners();
    }

    private void initListeners() {
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result4 = getArguments().getString("key3");
                Bundle bundle = new Bundle();
                bundle.putString("key4",result4);
                FiveFragment fiveFragment = new FiveFragment();

                Toast.makeText(requireContext(), result4, Toast.LENGTH_SHORT).show();

                fiveFragment.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.mainContainer,fiveFragment).commit();
            }
        });
    }

    private void initViews(View view) {
        btn4 = view.findViewById(R.id.btn_send4);
    }
}