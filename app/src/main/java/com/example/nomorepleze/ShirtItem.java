package com.example.nomorepleze;

import android.os.Parcel;
import android.os.Parcelable;

public class ShirtItem implements Parcelable {
    private int mImageResource_shirt;
    private String mText1_shirt;
    private String mText2_shirt;

    public ShirtItem(int imageResource, String text1, String text2)
    {
        mImageResource_shirt = imageResource;
        mText1_shirt = text1;
        mText2_shirt = text2;
    }

    protected ShirtItem(Parcel in) {
        mImageResource_shirt = in.readInt();
        mText1_shirt = in.readString();
        mText2_shirt = in.readString();
    }

    public static final Creator<ShirtItem> CREATOR = new Creator<ShirtItem>() {
        @Override
        public ShirtItem createFromParcel(Parcel in) {
            return new ShirtItem(in);
        }

        @Override
        public ShirtItem[] newArray(int size) {
            return new ShirtItem[size];
        }
    };

    public void changeImage(String text){
        mText1_shirt = text;
    }

    public int getmImageResource(){
        return mImageResource_shirt;
    }

    public String getmText1(){
        return mText1_shirt;
    }

    public String getmText2(){
        return mText2_shirt;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mImageResource_shirt);
        parcel.writeString(mText1_shirt);
        parcel.writeString(mText2_shirt);
    }
}
