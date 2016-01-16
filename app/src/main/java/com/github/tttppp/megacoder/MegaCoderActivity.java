package com.github.tttppp.megacoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MegaCoderActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mega_coder);

        TextView plainTextView = (TextView) findViewById(R.id.plainText);
        TextView codedTextView = (TextView) findViewById(R.id.codedText);

        View.OnClickListener megacodeListener = new ButtonListener(true, plainTextView, codedTextView);
        findViewById(R.id.megacodeButton).setOnClickListener(megacodeListener);
        View.OnClickListener demegacodeListener = new ButtonListener(false, codedTextView, plainTextView);
        findViewById(R.id.demegacodeButton).setOnClickListener(demegacodeListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mega_coder, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
