package com.example.android.zikazero;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

    public class PrevencaoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevencao);
        }


        //ao clicar sobre a ImageView, será aberta uma janela com as informações sobre o combate ao mosquito

        public void imgAquatica (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Se você tiver vasos de plantas aquáticas, troque a água e lave o vaso, principalmente por dentro, com escova, água e sabão, pelo menos uma vez por semana. A orientação também é válida para aquários.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
            }

        public void imgBarril (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Mantenha bem tampados tonéis e barris d'água.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
            }

        public void imgCaixa (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Mantenha a caixa d'água sempre fechada com tampa adequada.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }
        public void imgCalha (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Remova folhas, galhos e tudo que possa impedir a água de correr pelas calhas.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgDog (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Mantenha o bebedouro dos animais sempre limpo. Não basta somente trocar a água.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgGarrafas (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Guarde garrafas sempre de cabeça para baixo.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgLaje (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Não deixe a água da chuva acumulada sobre a laje.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgPiscina (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Mantenha a água da piscina tratada com cloro e deixe as bordas sempre limpas.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgPneu (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Entregue pneus velhos ao serviço de limpeza urbana ou guarde-os sem água em local coberto e abrigados da chuva.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgRalo (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Mantenha os ralos sem acúmulo de água e tratados com água sanitária ou desinfetante.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgRecicle (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Coloque os lixos recicláveis em sacos bem fechados e encaminhe para a Coleta Seletiva.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgVaso (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Encha de aréia os pratinhos dos vasos de planta.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgRepelente (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Aplique repelente nas partes do corpo que ficarem expostas.");
            alerta.setNeutralButton("ok", null);
            alerta.show();
        }

        public void imgLixo (View view) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Prevenção");
            alerta.setMessage("Coloque o lixo em sacos plásticos e mantenha a lixeira bem fechada. Não jogue lixo em terrenos baldios.");
            alerta.setNeutralButton("Ok!", null);
            alerta.show();
        }

    }