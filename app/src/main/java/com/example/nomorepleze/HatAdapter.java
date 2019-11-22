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

public class HatAdapter extends RecyclerView.Adapter<HatAdapter.HatViewHolder> {

    private ArrayList<HatItem> mHatList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);

    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }


    public static class HatViewHolder extends RecyclerView.ViewHolder{
        public ImageButton mImageButton;
        public TextView mTextView1;
        public TextView mTextView2;

        public HatViewHolder(@NonNull final View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageButton = itemView.findViewById(R.id.imagebtn1);
            mTextView1 = itemView.findViewById(R.id.text1);
            mTextView2 = itemView.findViewById(R.id.text2);

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
    public HatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.hat_item, parent, false);
        HatViewHolder hvh = new HatViewHolder(v, mListener);
        return hvh;
    }

    public HatAdapter(ArrayList<HatItem> hatList){
        mHatList = hatList;
    }

    @Override
    public void onBindViewHolder(@NonNull HatViewHolder holder, int position) {
        HatItem currentItem = mHatList.get(position);

        holder.mImageButton.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {
        return mHatList.size();
    }


}
