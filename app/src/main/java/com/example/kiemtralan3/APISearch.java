package com.example.kiemtralan3;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

public class APISearch extends AsyncTask<TuVung, String, String> {
    Context m_con;

    public APISearch(Context m_con) {
        this.m_con = m_con;
    }

    @Override
    protected String doInBackground(TuVung... strings) {
        return APIDict.searchWord(strings[0]);
    }
}
