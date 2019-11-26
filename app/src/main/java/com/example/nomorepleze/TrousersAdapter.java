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

public class TrousersAdapter extends RecyclerView.Adapter<TrousersAdapter.TrousersViewHolder> {

    private ArrayList<TrousersItem> mTrousersList;
    private OnItemClickListener mListener_trousers;

    public interface OnItemClickListener{
        void onItemClick(int position);

    }

    public void setOnItemClickListener(OnItemClickListener listener){ mListener_trousers = listener; }


    public static class TrousersViewHolder extends RecyclerView.ViewHolder{
        public ImageButton mImageButton;
        public TextView mTextView1;
        public TextView mTextView2;

        public TrousersViewHolder(@NonNull final View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageButton = itemView.findViewById(R.id.imagebtn1_trousers);
            mTextView1 = itemView.findViewById(R.id.text1_trousers);
            mTextView2 = itemView.findViewById(R.id.text2_trousers);

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
    public TrousersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.trousers_item, parent, false);
        TrousersViewHolder hvh = new TrousersViewHolder(v, mListener_trousers);
        return hvh;
    }

    public TrousersAdapter(ArrayList<TrousersItem> trousersList){
        mTrousersList = trousersList;
    }

    @Override
    public void onBindViewHolder(@NonNull TrousersViewHolder holder, int position) {
        TrousersItem currentItem = mTrousersList.get(position);

        holder.mImageButton.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {
        return mTrousersList.size();
    }


}
