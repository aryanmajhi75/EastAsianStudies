package com.example.eastasiastudiesapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Exchanges extends Fragment {

    private DatabaseReference countryRef,countryRef1,cCountryRef;
    TextView tt;
    static String country;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tt= getActivity().findViewById(R.id.textViewExchanges);

        MyViewModel myViewModel = new ViewModelProvider(requireActivity()).get(MyViewModel.class);
        myViewModel.getData().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String data) {
                country = data;
                if(country == "China"){
                    countryRef = FirebaseDatabase.getInstance().getReference().child("Countries").child("China");
                    cCountryRef = countryRef.child("exchanges");
                    cCountryRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                String data = snapshot.child("ehome").getValue().toString();
                                Toast.makeText(getActivity().getApplicationContext(), "Data from firebase "+data, Toast.LENGTH_SHORT).show();
                                tt.setText(data);
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Log.d("error","unable to set");

                        }
                    });
                }
                if(country == "Japan"){
                    countryRef = FirebaseDatabase.getInstance().getReference().child("Countries").child("Japan");
                    cCountryRef = countryRef.child("exchanges");
                    cCountryRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                String data = snapshot.child("ehome").getValue().toString();
                                tt.setText(data);
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
                if(country == "Korea"){
                    countryRef = FirebaseDatabase.getInstance().getReference().child("Countries").child("Korea");
                    cCountryRef = countryRef.child("exchanges");
                    cCountryRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                String data = snapshot.child("ehome").getValue().toString();
                                tt.setText(data);
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
                if(country == "IndoPacific"){
                    countryRef = FirebaseDatabase.getInstance().getReference().child("Countries").child("IndoPacific");
                    cCountryRef = countryRef.child("exchanges");
                    cCountryRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                String data = snapshot.child("ehome").getValue().toString();
                                tt.setText(data);
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
                if(country == "SouthEastAsia"){
                    countryRef = FirebaseDatabase.getInstance().getReference().child("Countries").child("SouthEastAsia");
                    cCountryRef = countryRef.child("exchanges");
                    cCountryRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                String data = snapshot.child("ehome").getValue().toString();
                                tt.setText(data);
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            }
        });
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_exchanges, container, false);
    }
}