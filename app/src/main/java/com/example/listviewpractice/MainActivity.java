package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.listviewpractice.models.LotteryData;
import com.example.listviewpractice.models.LotteryDataAdapter;

public class MainActivity extends AppCompatActivity {
    private ListView getLotteryDataListView() {
        return _lotteryDataListView;
    }

    private LotteryDataAdapter getLotteryDataAdapter() {
        return _lotteryDataAdapter;
    }

    private ListView _lotteryDataListView;
    private LotteryDataAdapter _lotteryDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mLotteryDataListView = findViewById(R.id.lotteryDataListView);
        LotteryDataAdapter mLotteryDataAdapter = new LotteryDataAdapter(getApplicationContext());
        try {
            mLotteryDataListView.setAdapter(mLotteryDataAdapter);
            _lotteryDataListView = mLotteryDataListView;
            _lotteryDataAdapter = mLotteryDataAdapter;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void newDataButton_Click(View view) {
        ListView mListView = getLotteryDataListView();
        LotteryDataAdapter mAdapter = getLotteryDataAdapter();
        LotteryData mData = new LotteryData(String.format("第 %02d 期", mAdapter.getCount() + 1));
        try {
            mAdapter.addData(mData);
            mListView.smoothScrollToPosition(mAdapter.getCount() - 1);
        } catch (Exception ex) {
            throw ex;
        }
    }
}