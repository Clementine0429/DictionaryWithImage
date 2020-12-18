package com.example.kiemtralan3;

import android.content.Context;
import android.os.AsyncTask;
import android.os.ConditionVariable;
import android.widget.Toast;

public class APIGetting extends AsyncTask<String, String, String> {
    Context m_con;

    public APIGetting(Context m_con) {
        this.m_con = m_con;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

    }
    @Override
    protected String doInBackground(String... strings) {
        return APIDict.getWord(strings[0]);
    }
}
