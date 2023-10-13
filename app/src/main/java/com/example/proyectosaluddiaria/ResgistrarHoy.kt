package com.example.proyectosaluddiaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.json.JSONObject
import android.util.Log
import android.view.View


class ResgistrarHoy : AppCompatActivity() {

    lateinit var txtPeso : EditText
    lateinit var txtTiempoEjerc : EditText
    lateinit var txtCintura : EditText
    lateinit var txtHorasSueño : EditText
/*
    val btncancelar: Button = findViewById(R.id.btnCancelar2)
    btncancelar.setOnClickListener {
        //log.w("boton," "A pantalla")
        val intent1 = Intent(this,MainActivity::class.java)
        startActivity(intent1)
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resgistrar_hoy)

        txtPeso = findViewById(R.id.txtPeso)
        txtTiempoEjerc = findViewById(R.id.txtTiempoEjerc)
        txtCintura = findViewById(R.id.txtCintura)
        txtHorasSueño = findViewById(R.id.txtHorasSueño)

/*
        val btnEnviar: Button = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveDataToJson();
            }
        });
    }
    private void saveDataToJson() {
        JSONObject jsonData = new JSONObject();
        try {
            jsonData.put("txtPeso", txtPeso.getText().toString());
            jsonData.put("txtTiempoEjerc", txtTiempoEjerc.getText().toString());
            jsonData.put("txtCintura", txtCintura.getText().toString());
            jsonData.put("data4", txtHorasSueño.getText().toString());

            // Puedes guardar jsonData en un archivo o en otro lugar según tus necesidades.
            String jsonString = jsonData.toString();

            // Imprime el JSON por consola para verificar
            System.out.println(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }*/




    }
}










