package com.example.realesetate.data;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.realesetate.R;
import com.example.realesetate.data.modelofmvp.Properties;

import java.util.ArrayList;


/*
        * ==========  Follow the 5 steps first before defining any VARIABLE
        *
        * ==========  and then go throw the rest of the 11 steps
        * */
// (1) FIRST step is to extend RecyclerView.Adapter and then implement the required methods

// (3) THIRD specify the generate type for the class <RecyclerViewAdapter.ListItemViewHolder>
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ListItemViewHolder> {


    // (6) SIXTH define the list which will hold the data
    // this variable will hold a ArrayList of the customs class object
     ArrayList<Properties> mArrayList;
    Context mContext;

    // (7) SEVENTH define the constructor
    // this is the constructor
    public RecyclerViewAdapter(Context mContext,ArrayList<Properties> mArrayList) {
        this.mArrayList = mArrayList;
        this.mContext = mContext;
    }

    // (2) SECOND is to create the view Holder Class and and extends RecyclerView.ViewHolder
    // then specify the constructor keyword
    public class ListItemViewHolder extends RecyclerView.ViewHolder {
        // (9) NINTH get reference to the views inside every row element the the RecyclerView
        // here and inside the constructor
        ImageView mRoomImage;
        TextView mPrice, mType, mRooamNumbers, mBathNumbers, mCity;

        public ListItemViewHolder(@NonNull View itemView) {
            super(itemView);
            //here this is part of (9)
            mRoomImage = itemView.findViewById(R.id.imageID);
            mPrice = itemView.findViewById(R.id.priceID);
            mType = itemView.findViewById(R.id.typeID);
            mRooamNumbers= itemView.findViewById(R.id.roomNumbersID);
            mBathNumbers = itemView.findViewById(R.id.bathsNumbersID);
            mCity = itemView.findViewById(R.id.cityID);
        }
    }


    // (4) FORTH for this method you have to be sure that
    // the return type is an object for ListItemViewHolder
    @NonNull
    @Override
    public ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    // (10) inflate the Row Item with the ProperData and return an object for the ViewHolder
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        ListItemViewHolder mListItemViewHolder = new ListItemViewHolder(mView);
        return mListItemViewHolder;
    }

    // (5) FIFTH for this method you have to be sure that the FIRST parameter
    // is an object for ListItemViewHolder
    @Override
    public void onBindViewHolder(@NonNull ListItemViewHolder viewHolder, int i) {
    // (11) ELEVENTH last we will attach the proper data from the custom class with the proper list view row

        // i is refer to list item position
        //(mArrayList.get(i) this mean for the current object get the matched data
        final Properties mProperties = mArrayList.get(i);

        //viewHolder.mRoomImage  .... cpm;ete with pecaso
        viewHolder.mPrice.setText((int) mProperties.getmPrice());
        viewHolder.mType.setText(mProperties.getmType());
        viewHolder.mRooamNumbers.setText(mProperties.getmRooms());
        viewHolder.mBathNumbers.setText(mProperties.getmBaths());
        viewHolder.mCity.setText(mProperties.getmCity());
    }


    @Override
    public int getItemCount() {
        // (8) EIGHTH return the size of the ArrayList
        return mArrayList.size();
    }

}
