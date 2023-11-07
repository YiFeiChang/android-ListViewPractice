package com.example.listviewpractice.models;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.listviewpractice.R;

import java.util.ArrayList;
import java.util.List;

public class LotteryDataAdapter extends BaseAdapter {
    private Context getContext() {
        return _context;
    }

    private ArrayList<LotteryData> getLotteryData() {
        return _lotteryData;
    }

    private final Context _context;
    private final ArrayList<LotteryData> _lotteryData;

    public LotteryDataAdapter(Context context) {
        super();
        _context = context;
        _lotteryData = new ArrayList<LotteryData>();
    }

    public void addData(LotteryData data) {
        LotteryData mData = data;
        ArrayList<LotteryData> mList = getLotteryData();
        try {
            mList.add(mData);
            notifyDataSetChanged();
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public int getCount() {
        return getLotteryData().size();
    }

    @Override
    public Object getItem(int i) {
        return getLotteryData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return (long) i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View mItemView = View.inflate(getContext(), R.layout.lottery_data_item_view, null);
        LotteryData mLotteryData = getLotteryData().get(i);
        TextView mNameTextView = mItemView.findViewById(R.id.nameTextView),
                mNumber1TextView = mItemView.findViewById(R.id.number1TextView),
                mNumber2TextView = mItemView.findViewById(R.id.number2TextView),
                mNumber3TextView = mItemView.findViewById(R.id.number3TextView),
                mNumber4TextView = mItemView.findViewById(R.id.number4TextView),
                mNumber5TextView = mItemView.findViewById(R.id.number5TextView),
                mNumber6TextView = mItemView.findViewById(R.id.number6TextView);
        try {
            mNameTextView.setText(mLotteryData.getName());
            mNumber1TextView.setText(String.valueOf(mLotteryData.getNumber(1)));
            mNumber2TextView.setText(String.valueOf(mLotteryData.getNumber(2)));
            mNumber3TextView.setText(String.valueOf(mLotteryData.getNumber(3)));
            mNumber4TextView.setText(String.valueOf(mLotteryData.getNumber(4)));
            mNumber5TextView.setText(String.valueOf(mLotteryData.getNumber(5)));
            mNumber6TextView.setText(String.valueOf(mLotteryData.getNumber(6)));
        } catch (Exception ex) {
            throw ex;
        }
        return mItemView;
    }
}