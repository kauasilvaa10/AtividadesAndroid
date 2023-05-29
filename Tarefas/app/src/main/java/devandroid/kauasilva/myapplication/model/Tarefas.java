package devandroid.kauasilva.myapplication.model;

public class Tarefas {
    private String nomeTarefas;
    private String DesTarefas;
    private String Dataconclusao;

    public Tarefas() {
    }

    public String getNomeTarefas() {
        return nomeTarefas;
    }

    public void setNomeTarefas(String nomeTarefas) {
        this.nomeTarefas = nomeTarefas;
    }

    public String getDesTarefas() {
        return DesTarefas;
    }

    public void setDesTarefas(String desTarefas) {
        DesTarefas = desTarefas;
    }

    public String getDataconclusao() {
        return Dataconclusao;
    }

    public void setDataconclusao(String dataconclusao) {
        Dataconclusao = dataconclusao;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "nomeTarefa='" + nomeTarefas + '\'' +
                ", DesTarefa='" + DesTarefas + '\'' +
                ", Dataconclusao='" + Dataconclusao + '\'' +
                '}';
    }
}


