package com.example.realesetate.views.mainactivity.searchfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.realesetate.R;
import com.example.realesetate.data.RecyclerViewAdapter;
import com.example.realesetate.data.modelofmvp.Properties;

import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 */
    // this represent the View of the MVP
public class SearchFragment extends Fragment {
    // (1) define the VARIABLES
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerViewAdapter mRecyclerViewAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_search, container, false);

        // (2) initialize this variables
        mRecyclerView = mView.findViewById(R.id.searchRecyclerViewID);
        // the next three lines is obligatory to make the recycler view to show up
        mLayoutManager = new LinearLayoutManager(getContext());
//        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        // (3) call the method from the Presenter
        SearchFragmentPresenter mSearchFragmentPresenter = new SearchFragmentPresenter();
        mSearchFragmentPresenter.getData();


        // Inflate the layout for this fragment
        return mView;
    }

    public void renderArrayList(ArrayList<Properties> mArraylist){

        mRecyclerViewAdapter = new RecyclerViewAdapter( getContext(),mArraylist);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }
}
