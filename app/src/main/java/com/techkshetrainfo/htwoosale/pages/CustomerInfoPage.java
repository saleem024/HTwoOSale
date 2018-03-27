package com.techkshetrainfo.htwoosale.pages;

import android.support.v4.app.Fragment;

import com.techkshetrainfo.htwoosale.model.ModelCallbacks;
import com.techkshetrainfo.htwoosale.model.Page;
import com.techkshetrainfo.htwoosale.model.ReviewItem;

import java.util.ArrayList;

/**
 * A page asking for a name and an email.
 */

public class CustomerInfoPage extends Page {
    public static final String NAME_DATA_KEY = "name";
    public static final String PHONE_DATA_KEY = "phone";
    public static final String ADDRESS_DATA_KEY = "address";
//    public static final String EMAIL_DATA_KEY = "email";
    public static final String BOTTLE_DATA_KEY = "bottle";
//    public static final String TOTAL_DATA_KEY = "total";


    public CustomerInfoPage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    public Fragment createFragment() {
        return CustomerInfoFragment.create(getKey());
    }

    @Override
    public void getReviewItems(ArrayList<ReviewItem> dest) {
//        dest.add(new ReviewItem("Name", mData.getString(NAME_DATA_KEY), getKey(), -1));
//        dest.add(new ReviewItem("Phone", mData.getString(PHONE_DATA_KEY), getKey(), -1));
//        dest.add(new ReviewItem("Address", mData.getString(ADDRESS_DATA_KEY), getKey(), -1));
//        dest.add(new ReviewItem("E-mail", mData.getString(EMAIL_DATA_KEY), getKey(), -1));
//        dest.add(new ReviewItem("Bottle", mData.getString(BOTTLE_DATA_KEY), getKey(), -1));
//        dest.add(new ReviewItem("Total", mData.getString(TOTAL_DATA_KEY), getKey(), -1));
    }

    @Override
    public boolean isCompleted() {
//        return !TextUtils.isEmpty(mData.getString(BOTTLE_DATA_KEY)) && !TextUtils.isEmpty(mData.getString(TOTAL_DATA_KEY));
//        return !TextUtils.isEmpty(mData.getString(BOTTLE_DATA_KEY));
        return true;
    }
}
