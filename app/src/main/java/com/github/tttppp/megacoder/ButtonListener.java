package com.github.tttppp.megacoder;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ButtonListener implements View.OnClickListener
{
    private boolean encodeFlag;
    private TextView inputView;
    private TextView outputView;

    public ButtonListener(boolean encodeFlag, TextView inputView, TextView outputView)
    {
        this.encodeFlag = encodeFlag;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    @Override
    public void onClick(View v)
    {
        AsyncCodeTask task = new AsyncCodeTask(encodeFlag, outputView);
        task.execute(inputView.getText().toString());
    }
}
