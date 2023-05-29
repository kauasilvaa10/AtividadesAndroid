package devandroid.kauasilva.compromissos.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.kauasilva.compromissos.R;
import devandroid.kauasilva.compromissos.model.Compromissos;

public class MainActivity extends AppCompatActivity {

    Compromissos compromissos;

    EditText editTitulo;
    EditText editData;
    EditText editHora;
    EditText editLocal;
    EditText editDescricao;

    Button btn_limpar;
    Button btn_salvar;
    Button btn_finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compromissos = new Compromissos();
        compromissos.setTitulo("Reunião Setor Logistica.");
        compromissos.setDescricao("Realizar com o Gestor do setor da Portaria, com Gestor setor Logistica, encarregador e lideres. ");
        compromissos.setData("25/05/2023");
        compromissos.setHora("15:40");
        compromissos.setLocal("Portaria");

        editTitulo = findViewById(R.id.editTitulo);
        editData = findViewById(R.id.editData);
        editHora = findViewById(R.id.editHora);
        editLocal = findViewById(R.id.editLocal);
        editDescricao = findViewById(R.id.editDescricao);

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_salvar = findViewById(R.id.btn_salvar);
        btn_finalizar = findViewById(R.id.btn_finalizar);

        editTitulo.setText(compromissos.getTitulo());
        editDescricao.setText(compromissos.getDescricao());
        editData.setText(compromissos.getData());
        editHora.setText(compromissos.getHora());
        editLocal.setText(compromissos.getLocal());


        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " limpado com sucesso.", Toast.LENGTH_LONG).show();
                editTitulo.setText("");
                editDescricao.setText("");
                editHora.setText("");
                editData.setText("");
                editLocal.setText("");
            }
        });


        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compromissos.setTitulo(editTitulo.getText().toString());
                compromissos.setData(editData.getText().toString());
                compromissos.setHora(editHora.getText().toString());
                compromissos.setDescricao(editDescricao.getText().toString());
                compromissos.setLocal(editLocal.getText().toString());


                Toast.makeText(MainActivity.this, "Salvo. !" + compromissos.toString(), Toast.LENGTH_LONG).show();
            }
        });
        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Finalizado. !", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
