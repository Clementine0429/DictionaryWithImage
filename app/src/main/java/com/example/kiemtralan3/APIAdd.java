package com.example.kiemtralan3;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

public class APIAdd extends AsyncTask<TuVung, String, String> {
    private Context m_con;
    public  APIAdd(Context con)
    {
        m_con = con;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Toast.makeText(m_con, "Start", Toast.LENGTH_SHORT).show();
    }
    // nao a???
    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Toast.makeText(m_con, "Finish"+s, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected String doInBackground(TuVung... words) {
        return APIDict.addWord(words[0]);

    }
}
