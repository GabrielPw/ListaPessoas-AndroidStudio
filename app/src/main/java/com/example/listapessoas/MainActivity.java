package com.example.listapessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etNome;
    EditText etIdade;

    RadioButton rbSim;
    RadioButton rbNao;

    TextView tvQntPessoas;

    Button btnSalvar;
    Button btnListar;

    // -----------

    String nome, idade;
    boolean possuiPet;

    // -----------

    List<Pessoa> pessoas = new ArrayList<Pessoa>();
    int qntPessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salvar(View view){

        etNome = (EditText) findViewById(R.id.etNome);
        etIdade = (EditText) findViewById(R.id.etIdade);

        rbSim = (RadioButton) findViewById(R.id.rbSim);
        rbNao = (RadioButton) findViewById(R.id.rbNao);

        tvQntPessoas = (TextView) findViewById(R.id.tvQntPessoas);
        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        btnListar = (Button) findViewById(R.id.btnListar);

        obterDados(view);

        //etNome.setText("adsadsad");

        Pessoa p = new Pessoa(nome, idade, possuiPet);

        pessoas.add(p);
        Toast t = Toast.makeText(this, "Pessoa registrada com sucesso!", Toast.LENGTH_LONG);

        qntPessoas = pessoas.size();
        tvQntPessoas.setText("Qnt. Registrados: " + qntPessoas);
    }


    void obterDados(View view){

        nome = etNome.getText().toString();
        idade = etIdade.getText().toString();
        possuiPet = (rbSim.isChecked()==true?true:false);
    }
}