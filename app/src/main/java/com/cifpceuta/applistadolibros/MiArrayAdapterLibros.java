package com.cifpceuta.applistadolibros;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MiArrayAdapterLibros extends ArrayAdapter<Libro> {

    private Activity context;
    ArrayList<Libro> libros;

    public MiArrayAdapterLibros(Activity c, ArrayList<Libro>l){
        super(c,R.layout.layout_libro_item,l);
        this.context = c;
        this.libros = l;
    }

    @SuppressLint("MissingInflatedId")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.layout_libro_item,parent,false);

        Libro libro = libros.get(position);
        ImageView ivPortada;
        TextView texto1,texto2;
        texto1 = (TextView) rowView.findViewById(R.id.texto1);
        texto2 = (TextView) rowView.findViewById(R.id.texto2);
        ivPortada = (ImageView) rowView.findViewById(R.id.portada);

        texto1.setText(libro.getTitulo());
        texto2.setText("Num Páginas: "+libro.getPaginas());
        ivPortada.setImageResource(libro.getPortada());



        return rowView;
    }
}
