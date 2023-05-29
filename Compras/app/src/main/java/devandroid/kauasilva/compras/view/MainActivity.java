package devandroid.kauasilva.compras.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.kauasilva.compras.R;
import devandroid.kauasilva.compras.model.Compras;

public class MainActivity extends AppCompatActivity {

    Compras Compras;

    EditText editItem;
    EditText editQuantidade;
    EditText editLocal;

    Button btn_Limpar;
    Button btn_Salvar;
    Button btn_Finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Compras = new Compras();
        Compras.setItem("Whisky");
        Compras.setQuantidade("50 ");
        Compras.setLocal("Bahamas Mix");

        editItem = findViewById(R.id.editItem);
        editQuantidade = findViewById(R.id.editQuantidade);
        editLocal = findViewById(R.id.editLocal);

        btn_Limpar = findViewById(R.id.btn_limpar);
        btn_Salvar = findViewById(R.id.btn_salvar);
        btn_Finalizar = findViewById(R.id.btn_finalizar);

        editItem.setText(Compras.getItem());
        editQuantidade.setText(Compras.getQuantidade());
        editLocal.setText(Compras.getLocal());

        btn_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " limpado com sucesso.", Toast.LENGTH_LONG).show();
                editItem.setText("");
                editQuantidade.setText("");
                editLocal.setText("");
            }
        });


        btn_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Compras.setItem(editItem.getText().toString());
                Compras.setQuantidade(editQuantidade.getText().toString());
                Compras.setLocal(editLocal.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo. !" + Compras.toString(), Toast.LENGTH_LONG).show();
            }
        });

        btn_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Finalizado!", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}