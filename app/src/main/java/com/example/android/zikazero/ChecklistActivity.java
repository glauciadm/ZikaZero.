package com.example.android.zikazero;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class ChecklistActivity extends AppCompatActivity {

    private CheckBox check1, check2, check3, check4, check5, check6, check7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        check1 = (CheckBox) findViewById(R.id.check1);
        check2 = (CheckBox) findViewById(R.id.check2);
        check3 = (CheckBox) findViewById(R.id.check3);
        check4 = (CheckBox) findViewById(R.id.check4);
        check5 = (CheckBox) findViewById(R.id.check5);
        check6 = (CheckBox) findViewById(R.id.check6);
        check7 = (CheckBox) findViewById(R.id.check7);

    }


    public void onClick (View view){

        AlertDialog.Builder alerta = new AlertDialog.Builder(this); //mostrar mensagem ao concluir o processo
        alerta.setTitle("Checklist finalizado!");
        alerta.setMessage("Agradecemos sua colaboração.");
        alerta.setNeutralButton("ok", null);
        alerta.show();

        check1.setChecked(false); //desmarcar checkbox
        check2.setChecked(false);
        check3.setChecked(false);
        check4.setChecked(false);
        check5.setChecked(false);
        check6.setChecked(false);
        check7.setChecked(false);
   }
}
