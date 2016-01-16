package com.github.tttppp.megacoder;

import android.os.AsyncTask;
import android.widget.TextView;

public class AsyncCodeTask extends AsyncTask<String, String, String>
{
    private boolean encodeFlag;
    private TextView outputView;

    public AsyncCodeTask(boolean encodeFlag, TextView outputView)
    {
        this.encodeFlag = encodeFlag;
        this.outputView = outputView;
    }

    @Override
    protected String doInBackground(String... input)
    {
        if (encodeFlag)
        {
            return MegaCoder.encode(input[0]);
        }
        else
        {
            return MegaCoder.decode(input[0]);
        }
    }

    @Override
    protected void onPostExecute(String result)
    {
        outputView.setText(result);
    }
}
