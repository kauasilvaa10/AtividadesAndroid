package devandroid.kauasilva.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import devandroid.kauasilva.myapplication.model.Pessoa;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import devandroid.kauasilva.myapplication.R;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outrapessoa;

    String dadosPessoa;
    String dadosoutrapessoa;

    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editTxtDesejo;
    EditText edittelefone;

    Button bpnLimpar;
    Button bpnSalvar;
    Button bpnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa = new Pessoa();
        pessoa.setNome("Kaua");
        pessoa.setSobrenome("Alves");
        pessoa.setCursodesejado("Programacao");
        pessoa.setTelefonecontato(00006666);

        outrapessoa = new Pessoa();
        outrapessoa.setNome("Ana");
        outrapessoa.setSobrenome("Alves");
        outrapessoa.setCursodesejado("Programacao");
        outrapessoa.setTelefonecontato(6666000);




    }

}