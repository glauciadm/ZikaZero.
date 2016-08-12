package com.example.android.zikazero;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class DenunciaActivity extends AppCompatActivity {

    private EditText editDescricao;
    private EditText editLocal;
    private Button enviarDenuncia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denuncia);

        enviarDenuncia = (Button) findViewById(R.id.enviarDenuncia);
        editDescricao = (EditText) findViewById(R.id.edit_descricao);
        editLocal = (EditText) findViewById(R.id.edit_local);
    }

    public void buscarLocal(View v) { //abrir o maps para buscar a posição atual pelo GPS

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }

    public void enviarDenuncia (View view){  //enviar por email o local e descrição do foco encontrado - ao clicar no botão será solicitado a abertura de um aplicativo de email.

        String local = editLocal.getText().toString();
        String descricao = editDescricao.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND); //ação para enviar email ou sms
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"glaucia.admachado@gmail.com", "appzikazero@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Denúncia App Zika Virus");
        intent.putExtra(Intent.EXTRA_BCC , new String[] { ""}); //copia oculta
        intent.putExtra(Intent.EXTRA_TEXT, "Local:" + local + "\n\nDescrição: " +descricao);

        startActivity(intent.createChooser(intent, "enviar e-mail"));
        }
    }
