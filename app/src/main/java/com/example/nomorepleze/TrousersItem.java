package com.example.nomorepleze;

import android.os.Parcel;
import android.os.Parcelable;

public class TrousersItem implements Parcelable {
    private int mImageResource_trousers;
    private String mText1_trousers;
    private String mText2_trousers;

    public TrousersItem(int imageResource, String text1, String text2)
    {
        mImageResource_trousers = imageResource;
        mText1_trousers = text1;
        mText2_trousers = text2;
    }

    protected TrousersItem(Parcel in) {
        mImageResource_trousers = in.readInt();
        mText1_trousers = in.readString();
        mText2_trousers = in.readString();
    }

    public static final Creator<TrousersItem> CREATOR = new Creator<TrousersItem>() {
        @Override
        public TrousersItem createFromParcel(Parcel in) {
            return new TrousersItem(in);
        }

        @Override
        public TrousersItem[] newArray(int size) {
            return new TrousersItem[size];
        }
    };

    public void changeImage(String text){
        mText1_trousers = text;
    }

    public int getmImageResource(){ return mImageResource_trousers; }

    public String getmText1(){
        return mText1_trousers;
    }

    public String getmText2(){
        return mText2_trousers;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mImageResource_trousers);
        parcel.writeString(mText1_trousers);
        parcel.writeString(mText2_trousers);
    }
}
