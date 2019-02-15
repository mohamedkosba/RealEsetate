package com.example.realesetate.views.mainactivity.searchfragment;

import android.widget.Toast;

import com.example.realesetate.R;
import com.example.realesetate.data.modelofmvp.APIInterface;
import com.example.realesetate.data.modelofmvp.ModelClass;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
// this represent the Presenter of the MVP
public class SearchFragmentPresenter implements SearchContract.SearchPresenter {

    public static final String URL = "http://18.191.38.255/eproperty/public/index.php/";

    private APIInterface mAPIInterface;

    @Override
    public void getData() {


        // FIRST (1) Initialize an instance of Retrofit
        Retrofit mRetrofit = new Retrofit.Builder().baseUrl(URL).
        addConverterFactory(GsonConverterFactory.create()).build();


        // SECOND (2) now will will make the request
        // we will use the APIInterface variable
        // and use the instance of the retrofit inside it
        // and then we will call the create() method and pass the APIInterface class to it
        mAPIInterface = mRetrofit.create(APIInterface.class);

        // Third (3)
        // we will save the return type in Call class instance
        // and use this interface to call the appropriate method inside this interface
        // (go and check the Interface inside data foldr)
        Call<ModelClass> mCall = mAPIInterface.getBackendProperties();
        //then we will call enqueue() method which contains some
        // callbacks for successful and failure response
        // it's parameter take a new object of Callback<CustomModelClass>()
        mCall.enqueue(new Callback<ModelClass>() {
            @Override
            public void onResponse(Call<ModelClass> call, Response<ModelClass> response) {
            // FORTH(4) publish the result to the recycler view from this method
            // body() method will return the result as ana object and then we will pass all the
            // object to array list.

                SearchFragment mSearchFragment = new SearchFragment();
                mSearchFragment.renderArrayList(response.body().getmProperties());
                System.out.println("Yeeeeeeeeeeeeeeeeees");


            }

            @Override
            public void onFailure(Call<ModelClass> call, Throwable t) {
               System.out.println(t.getMessage());

                System.out.println("Noooooooooooooooooooooooooooooooooooooooooooooo");

            }
        });
    }
}
