package devandroid.kauasilva.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.kauasilva.myapplication.R;
import devandroid.kauasilva.myapplication.model.Tarefas;

public class MainActivity extends AppCompatActivity {
    Tarefas tarefas;

    EditText editTitulo;
    EditText editDescricao;
    EditText editEntrega;

    Button btn_Limpar;
    Button btn_Salvar;
    Button btn_Finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tarefas = new Tarefas();
        tarefas.setNomeTarefas("Reunião Setor Logistica.");
        tarefas.setDesTarefas("Realizar com o Gestor do setor da Portaria, com Gestor setor Logistica, encarregador e lideres. ");
        tarefas.setDataconclusao("25/05/2023");

        editTitulo = findViewById(R.id.editTitulo);
        editDescricao = findViewById(R.id.editDescricao);
        editEntrega = findViewById(R.id.editEntrega);

        btn_Limpar = findViewById(R.id.btn_limpar);
        btn_Salvar = findViewById(R.id.btn_salvar);
        btn_Finalizar = findViewById(R.id.btn_finalizar);

        editTitulo.setText(tarefas.getNomeTarefas());
        editDescricao.setText(tarefas.getDesTarefas());
        editEntrega.setText(tarefas.getDataconclusao());

        btn_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " limpado com sucesso.", Toast.LENGTH_LONG).show();
                editTitulo.setText("");
                editDescricao.setText("");
                editEntrega.setText("");
            }
        });


        btn_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tarefas.setNomeTarefas(editTitulo.getText().toString());
                tarefas.setDesTarefas(editDescricao.getText().toString());
                tarefas.setDataconclusao(editEntrega.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo. !" + tarefas.toString(), Toast.LENGTH_LONG).show();
            }
        });
        btn_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Finalizado. !", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
