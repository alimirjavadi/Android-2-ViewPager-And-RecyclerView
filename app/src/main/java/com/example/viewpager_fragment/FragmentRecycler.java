package com.example.viewpager_fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentRecycler extends Fragment {

    private static final String ARG_POS = "pos";
    private int position;

    public static FragmentRecycler newInstance(int pos) {
        FragmentRecycler fragment = new FragmentRecycler();
        Bundle args = new Bundle();
        args.putInt(ARG_POS, pos);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recycler, container, false);

        position = getArguments().getInt(ARG_POS);

        RecyclerView recyclerView = view.findViewById(R.id.rv_main);
        AdapterName adapterName = new AdapterName(position);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterName);

        return view;
    }
}
