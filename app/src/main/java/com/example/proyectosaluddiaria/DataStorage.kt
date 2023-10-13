package com.example.proyectosaluddiaria


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView
import org.json.JSONException;
import org.json.JSONObject;
import androidx.appcompat.app.AppCompatActivity;

public class DataStorage : AppCompatActivity() {

    lateinit var txtPeso : EditText
    lateinit var txtTiempoEjerc : EditText
    lateinit var txtCintura : EditText
    lateinit var txtHorasSueño : EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPeso = findViewById(R.id.txtPeso)
        txtTiempoEjerc = findViewById(R.id.txtTiempoEjerc)
        txtCintura = findViewById(R.id.txtCintura)
        txtHorasSueño = findViewById(R.id.txtHorasSueño)

        Button btnEnviar = findViewById(R.id.btnEnviar);
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
            jsonData.put("data1", editText1.getText().toString());
            jsonData.put("data2", editText2.getText().toString());
            jsonData.put("data3", editText3.getText().toString());
            jsonData.put("data4", editText4.getText().toString());

            // Puedes guardar jsonData en un archivo o en otro lugar según tus necesidades.
            String jsonString = jsonData.toString();

            // Imprime el JSON por consola para verificar
            System.out.println(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}