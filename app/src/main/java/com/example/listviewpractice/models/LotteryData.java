package com.example.listviewpractice.models;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.Random;

public class LotteryData {
    public String getName() {
        return _name;
    }

    public int getNumber(int serial) {
        return _numbers[serial - 1];
    }

    private final String _name;
    private final int[] _numbers;

    public LotteryData(String name) {
        super();
        _name = name;
        _numbers = new int[6];
        Random mRandom = new Random();
        try {
            _numbers[0] = mRandom.nextInt(49) + 1;
            _numbers[1] = mRandom.nextInt(49) + 1;
            _numbers[2] = mRandom.nextInt(49) + 1;
            _numbers[3] = mRandom.nextInt(49) + 1;
            _numbers[4] = mRandom.nextInt(49) + 1;
            _numbers[5] = mRandom.nextInt(49) + 1;
        } catch (Exception ex) {
            throw ex;
        }
    }
}
