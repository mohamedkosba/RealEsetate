package com.example.realesetate.views.mainactivity.searchfragment;


import com.example.realesetate.data.modelofmvp.Properties;

import java.util.ArrayList;

// this like a schema for the method I will execute inside the fragment
public interface SearchContract {
    // this will contain the contract methods for the presenter class
    public interface SearchPresenter{
        public void getData();
    }
    // this will contain the contract methods for the view class (Search Fragment)
    public interface SearchView{
        public void renderArrayList(ArrayList<Properties> mArraylist);
    }
}
