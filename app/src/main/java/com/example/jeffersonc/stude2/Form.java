package com.example.jeffersonc.stude2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Form extends Activity implements View.OnClickListener{

    private EditText disc;
    private Button btn_ok;
    private Button btn_cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        disc = (EditText) findViewById(R.id.campoDisciplina);

        btn_ok = (Button) findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(this);

        btn_cancelar = (Button) findViewById(R.id.btn_cancelar);
        btn_cancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.equals(btn_ok)){
            Intent intent = new Intent();
            Bundle data = new Bundle();
            data.putString("disciplina", disc.getText().toString());
            intent.putExtras(data);
            setResult(RESULT_OK, intent);

        } else if(v.equals(btn_cancelar)){
            setResult(RESULT_CANCELED);
        }

        finish();
    }

}
