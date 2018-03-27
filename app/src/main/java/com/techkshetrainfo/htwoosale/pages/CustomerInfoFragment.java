package com.techkshetrainfo.htwoosale.pages;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.techkshetrainfo.htwoosale.R;
import com.techkshetrainfo.htwoosale.ui.PageFragmentCallbacks;

public class CustomerInfoFragment extends Fragment {
    private static final String ARG_KEY = "key";

    private PageFragmentCallbacks mCallbacks;
    private String mKey;
    private CustomerInfoPage mPage;
    private TextView mNameView;
    private TextView mPhoneView;
    private TextView mAddress;
    private TextView mEmailView;
    private Spinner mBottle;
//    private EditText mTotal;


    public static CustomerInfoFragment create(String key) {
        Bundle args = new Bundle();
        args.putString(ARG_KEY, key);

        CustomerInfoFragment fragment = new CustomerInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public CustomerInfoFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();
        mKey = args.getString(ARG_KEY);
        mPage = (CustomerInfoPage) mCallbacks.onGetPage(mKey);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page_customer_info, container, false);
        ((TextView) rootView.findViewById(android.R.id.title)).setText(mPage.getTitle());

        mNameView = ((TextView) rootView.findViewById(R.id.customer_name));
        mNameView.setText(mPage.getData().getString(CustomerInfoPage.NAME_DATA_KEY));

        mPhoneView = ((TextView) rootView.findViewById(R.id.customer_no));
        mPhoneView.setText(mPage.getData().getString(CustomerInfoPage.PHONE_DATA_KEY));

        mAddress = ((TextView) rootView.findViewById(R.id.customer_address));
        mAddress.setText(mPage.getData().getString(CustomerInfoPage.ADDRESS_DATA_KEY));

//        mEmailView = ((TextView) rootView.findViewById(R.id.your_email));
//        mEmailView.setText(mPage.getData().getString(CustomerInfoPage.EMAIL_DATA_KEY));

        NumberPicker np = rootView.findViewById(R.id.numberPicker);
        np.setMinValue(0);
        np.setMaxValue(100);

        np.setOnValueChangedListener(onValueChangeListener);

//        mBottle = ((Spinner) rootView.findViewById(R.id.customer_bottle));
//        mBottle.setText(mPage.getData().getString(CustomerInfoPage.BOTTLE_DATA_KEY));

//        mTotal = ((EditText) rootView.findViewById(R.id.total_amount));
//        mTotal.setText(mPage.getData().getString(CustomerInfoPage.TOTAL_DATA_KEY));

        return rootView;
    }
    NumberPicker.OnValueChangeListener onValueChangeListener =
            new 	NumberPicker.OnValueChangeListener(){
                @Override
                public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                    Toast.makeText(getActivity(),
                            "selected number "+numberPicker.getValue(), Toast.LENGTH_SHORT);
                }
            };
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if (!(activity instanceof PageFragmentCallbacks)) {
            throw new ClassCastException("Activity must implement PageFragmentCallbacks");
        }

        mCallbacks = (PageFragmentCallbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = null;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mNameView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1,
                                          int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                mPage.getData().putString(CustomerInfoPage.NAME_DATA_KEY,
                        (editable != null) ? editable.toString() : null);
                mPage.notifyDataChanged();
            }
        });
        mPhoneView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1,
                                          int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                mPage.getData().putString(CustomerInfoPage.PHONE_DATA_KEY,
                        (editable != null) ? editable.toString() : null);
                mPage.notifyDataChanged();
            }
        });
        mAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1,
                                          int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                mPage.getData().putString(CustomerInfoPage.ADDRESS_DATA_KEY,
                        (editable != null) ? editable.toString() : null);
                mPage.notifyDataChanged();
            }
        });
//        mEmailView.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1,
//                                          int i2) {
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                mPage.getData().putString(CustomerInfoPage.EMAIL_DATA_KEY,
//                        (editable != null) ? editable.toString() : null);
//                mPage.notifyDataChanged();
//            }
//        });
//        mBottle.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1,
//                                          int i2) {
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                mPage.getData().putString(CustomerInfoPage.BOTTLE_DATA_KEY,
//                        (editable != null) ? editable.toString() : null);
//                mPage.notifyDataChanged();
//            }
//        });
//        mTotal.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1,
//                                          int i2) {
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                mPage.getData().putString(CustomerInfoPage.TOTAL_DATA_KEY,
//                        (editable != null) ? editable.toString() : null);
//                mPage.notifyDataChanged();
//            }
//        });
    }

    @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);

        // In a future update to the support library, this should override setUserVisibleHint
        // instead of setMenuVisibility.
//        if (mBottle != null && mTotal != null) {
//            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(
//                    Context.INPUT_METHOD_SERVICE);
//            if (!menuVisible) {
//                imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
//            }
//        }
        if (mBottle != null) {
            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(
                    Context.INPUT_METHOD_SERVICE);
            if (!menuVisible) {
                imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
            }
        }
    }
}
