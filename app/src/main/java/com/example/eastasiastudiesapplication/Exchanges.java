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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Exchanges extends Fragment {

    private DatabaseReference countryRef,cCountryRef,ug_reference,ug_reference1,pg_reference,pg_reference1,phd_reference,phd_reference1;
    TextView tt,t2,h1,l1,h2,l2,h3,l3,h4,l4,h5,l5;
    FloatingActionButton ug,pg,phd;
    static String country;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tt = getActivity().findViewById(R.id.textViewExchanges);
        t2 = getActivity().findViewById(R.id.textViewExchanges1);
        h1 = getActivity().findViewById(R.id.textViewExchangesH1);
        l1 = getActivity().findViewById(R.id.textViewExchangesL1);
        h2 = getActivity().findViewById(R.id.textViewExchangesH2);
        l2 = getActivity().findViewById(R.id.textViewExchangesL2);
        h3 = getActivity().findViewById(R.id.textViewExchangesH3);
        l3 = getActivity().findViewById(R.id.textViewExchangesL3);
        h4 = getActivity().findViewById(R.id.textViewExchangesH4);
        l4 = getActivity().findViewById(R.id.textViewExchangesL4);
        h5 = getActivity().findViewById(R.id.textViewExchangesH5);
        l5 = getActivity().findViewById(R.id.textViewExchangesL5);

        ug = getActivity().findViewById(R.id.ug_exchanges);
        pg = getActivity().findViewById(R.id.pg_exchanges);
        phd = getActivity().findViewById(R.id.phd_exchanges);

        ug.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Country : "+country, Toast.LENGTH_SHORT).show();
                ug_reference = FirebaseDatabase.getInstance().getReference().child("Countries").child(""+country);
                ug_reference1 = ug_reference.child("exchanges").child("UG");
                ug_reference1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            t2.setText("Upcoming exchanges - ");
                            tt.setText("");
                            String data = snapshot.child("head1").getValue().toString();
                            h1.setText("⚫ "+data);
                            String data1 = snapshot.child("link1").getValue().toString();
                            l1.setText(data1);
                            String data3 = snapshot.child("head2").getValue().toString();
                            h2.setText("⚫ "+data3);
                            l2.setText(snapshot.child("link2").getValue().toString());
                            String data4 = snapshot.child("head3").getValue().toString();
                            h3.setText("⚫ "+data4);
                            l3.setText(snapshot.child("link3").getValue().toString());
                            String data5 = snapshot.child("head4").getValue().toString();
                            h4.setText("⚫ "+data5);
                            l4.setText(snapshot.child("link4").getValue().toString());
                            String data6 = snapshot.child("head5").getValue().toString();
                            h5.setText("⚫ "+data6);
                            l5.setText(snapshot.child("link5").getValue().toString());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pg_reference = FirebaseDatabase.getInstance().getReference().child("Countries").child(""+country);
                pg_reference1 = pg_reference.child("exchanges").child("PG");
                pg_reference1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            t2.setText("Upcoming exchanges - ");
                            tt.setText("");
                            String data = snapshot.child("head1").getValue().toString();
                            h1.setText("⚫ "+data);
                            String data1 = snapshot.child("link1").getValue().toString();
                            l1.setText(data1);
                            String data3 = snapshot.child("head2").getValue().toString();
                            h2.setText("⚫ "+data3);
                            l2.setText(snapshot.child("link2").getValue().toString());
                            String data4 = snapshot.child("head3").getValue().toString();
                            h3.setText("⚫ "+data4);
                            l3.setText(snapshot.child("link3").getValue().toString());
                            String data5 = snapshot.child("head4").getValue().toString();
                            h4.setText("⚫ "+data5);
                            l4.setText(snapshot.child("link4").getValue().toString());
                            String data6 = snapshot.child("head5").getValue().toString();
                            h5.setText("⚫ "+data6);
                            l5.setText(snapshot.child("link5").getValue().toString());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });

        phd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phd_reference = FirebaseDatabase.getInstance().getReference().child("Countries").child(""+country);
                phd_reference1 = phd_reference.child("exchanges").child("PHD");
                phd_reference1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            t2.setText("Upcoming exchanges - ");
                            tt.setText("");
                            String data = snapshot.child("head1").getValue().toString();
                            h1.setText("⚫ "+data);
                            String data1 = snapshot.child("link1").getValue().toString();
                            l1.setText(data1);
                            String data3 = snapshot.child("head2").getValue().toString();
                            h2.setText("⚫ "+data3);
                            l2.setText(snapshot.child("link2").getValue().toString());
                            String data4 = snapshot.child("head3").getValue().toString();
                            h3.setText("⚫ "+data4);
                            l3.setText(snapshot.child("link3").getValue().toString());
                            String data5 = snapshot.child("head4").getValue().toString();
                            h4.setText("⚫ "+data5);
                            l4.setText(snapshot.child("link4").getValue().toString());
                            String data6 = snapshot.child("head5").getValue().toString();
                            h5.setText("⚫ "+data6);
                            l5.setText(snapshot.child("link5").getValue().toString());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });





        MyViewModel myViewModel = new ViewModelProvider(requireActivity()).get(MyViewModel.class);
        myViewModel.getData().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String dat) {
                country = dat;
                if(country == "China"){
                    countryRef = FirebaseDatabase.getInstance().getReference().child("Countries").child("China");
                    cCountryRef = countryRef.child("exchanges");
                    cCountryRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                Toast.makeText(getActivity().getApplicationContext(), "Data from firebase ", Toast.LENGTH_SHORT).show();
                                String data = snapshot.child("ehome").getValue().toString();
                                tt.setText(data);
                            }
                            else{
                                Toast.makeText(getActivity().getApplicationContext(), "Inside else ", Toast.LENGTH_SHORT).show();

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