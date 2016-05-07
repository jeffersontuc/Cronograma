package com.example.jeffersonc.stude2;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cronograma extends Activity implements View.OnClickListener {
    private TextView txt1;

    private static final int SUBACTIVITY_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronograma);
    }

    @Override
    public void onClick(View v) {
        txt1 = (TextView) findViewById(v.getId());
        Intent myIntent = new Intent(this, Form.class);
        startActivityForResult(myIntent, SUBACTIVITY_ID);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SUBACTIVITY_ID && resultCode == RESULT_OK){
            Bundle b = data.getExtras();
            String disciplina = b.getString("disciplina");
            txt1.setText(disciplina);
        }
    }

    /**
    public void dialog(){
        Dialog diag = new Dialog(this);
        diag.setContentView(R.layout.crono_diag);
        diag.show();
    }*/
}
