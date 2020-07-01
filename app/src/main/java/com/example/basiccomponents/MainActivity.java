package com.example.basiccomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    private RadioButton sexoMasculino, sexoFeminino;

    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.editNome);
        campoEmail      = findViewById(R.id.editEmail);
        textoResultado  = findViewById(R.id.textResultado);

        //checkbox
        checkVerde      = findViewById(R.id.checkVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVermelho   = findViewById(R.id.checkVermelho);

        sexoMasculino   = findViewById(R.id.radioButtonMasc);
        sexoFeminino    = findViewById(R.id.radioButtonFem);

        opcaoSexo       = findViewById(R.id.radioGroupSexo);

        radiobutton();

    }

    public void checkbox(){
        String texto = "";
        if(checkVerde.isChecked()){
            //String corSelecionado = checkVerde.getText().toString();
            //texto = corSelecionado;
            texto = "Verde Selecionado - ";
        }
        if(checkBranco.isChecked()){
            texto = texto + "Branco Selecionado - ";
        }
        if(checkVermelho.isChecked()){
            texto = texto + "Vermelho Selecionado - ";
        }
        textoResultado.setText(texto);

    }

    public void radiobutton(){
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonMasc){
                    textoResultado.setText("Masc");
                }else if(checkedId == R.id.radioButtonFem){
                    textoResultado.setText("Fem");
                }
            }
        });
        /*
        if(sexoMasculino.isChecked()){
            textoResultado.setText("Masculino");
        }else if (sexoFeminino.isChecked()){
            textoResultado.setText("Feminino");
        }
        */
    }

    public void enviar(View view){

        //radiobutton();
        //checkbox();
        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText("nome: " + nome + " / email: " + email);
        */
    }
    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
    }

}
