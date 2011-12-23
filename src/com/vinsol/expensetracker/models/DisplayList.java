package com.vinsol.expensetracker.models;

import android.os.Parcel;
import android.os.Parcelable;

public class DisplayList extends Favorite implements Parcelable{
	
	public String timeLocation;
	public String location;
	public String favorite;
	public Long timeInMillis;
	public String displayTime;
	
	 public static final Parcelable.Creator<DisplayList> CREATOR = new Parcelable.Creator<DisplayList>() {
    	public DisplayList createFromParcel(Parcel in) {
    		return new DisplayList(in);
    	}
 
        public DisplayList[] newArray(int size) {
        	return new DisplayList[size];
        }
    };
    
	public DisplayList(){}
    
    public DisplayList(Parcel in){
    	userId = in.readString();
    	amount = in.readString();
    	description = in.readString();
    	type = in.readString();
    	timeLocation = in.readString();
    	location = in.readString();
    	favorite = in.readString();
    	timeInMillis = new Long(in.readString());
    	displayTime = in.readString();
    };
    
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(userId);
		dest.writeString(amount);
		dest.writeString(description);
		dest.writeString(type);
		dest.writeString(timeLocation);
		dest.writeString(location);
		dest.writeString(favorite);
		dest.writeString(timeInMillis.toString());
		dest.writeString(displayTime);
	}

	@Override
	public int describeContents() {
		return 0;
	}
	
}
