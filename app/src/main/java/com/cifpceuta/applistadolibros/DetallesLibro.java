package com.cifpceuta.applistadolibros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesLibro extends AppCompatActivity {


    TextView tvTitulo,tvNpaginas,tvDes;
    ImageView ivPortada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_libro);

        Intent intent = this.getIntent();

        int imagenPortada = intent.getIntExtra("imagen",0);
        String titlulo = intent.getStringExtra("titulo");
        String description = intent.getStringExtra("descripcion");
        int npaginas = intent.getIntExtra("nPaginas",0);

        tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        tvNpaginas = (TextView) findViewById(R.id.tvNpaginas);
        tvDes = (TextView) findViewById(R.id.tvDes);
        ivPortada = (ImageView)  findViewById(R.id.ivPortada);

        ivPortada.setImageResource(imagenPortada);
        tvTitulo.setText(titlulo);
        tvNpaginas.setText("Numero de páginas: " +String.valueOf(npaginas));
        tvDes.setText(description);


    }

    public void volver(View view){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}