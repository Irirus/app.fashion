package com.example.nomorepleze;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShirtAdapter extends RecyclerView.Adapter<ShirtAdapter.ShirtViewHolder> {

    private ArrayList<ShirtItem> mShirtList;
    private OnItemClickListener mListener_shirt;

    public interface OnItemClickListener{
        void onItemClick(int position);

    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener_shirt = listener;
    }


    public static class ShirtViewHolder extends RecyclerView.ViewHolder{
        public ImageButton mImageButton;
        public TextView mTextView1;
        public TextView mTextView2;

        public ShirtViewHolder(@NonNull final View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageButton = itemView.findViewById(R.id.imagebtn1_shirt);
            mTextView1 = itemView.findViewById(R.id.text1_shirt);
            mTextView2 = itemView.findViewById(R.id.text2_shirt);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }


    }

    @NonNull
    @Override
    public ShirtViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.shirt_item, parent, false);
        ShirtViewHolder hvh = new ShirtViewHolder(v, mListener_shirt);
        return hvh;
    }

    public ShirtAdapter(ArrayList<ShirtItem> shirtList){
        mShirtList = shirtList;
    }

    @Override
    public void onBindViewHolder(@NonNull ShirtViewHolder holder, int position) {
        ShirtItem currentItem = mShirtList.get(position);

        holder.mImageButton.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {
        return mShirtList.size();
    }


}
