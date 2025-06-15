package EntidadesVirtuais;

public class Tarefa {
private int idTarefa;
private String titulo;
private String descricao;
private String dataInicio;
private String dataFim;
private String status;
private int NivelPrioridade;
public Tarefa() {
    this.idTarefa = 0;
    this.titulo = "";
    this.descricao = "";
    this.dataInicio = "";
    this.dataFim = "";
    this.status = "";
    this.NivelPrioridade = 0;
}
public Tarefa(int idTarefa, String titulo, String descricao, String dataInicio, String dataFim, String status, int NivelPrioridade) {
    this.idTarefa = idTarefa;
    this.titulo = titulo;
    this.descricao = descricao;
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
    this.status = status;
    this.NivelPrioridade = NivelPrioridade;
}
public int getIdTarefa() {
    return idTarefa;
}
public void setIdTarefa(int idTarefa) {
    this.idTarefa = idTarefa;
}
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public String getDataInicio() {
    return dataInicio;
}
public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
}
public String getDataFim() {
    return dataFim;
}
public void setDataFim(String dataFim) {
    this.dataFim = dataFim;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
public int getNivelPrioridade() {
    return NivelPrioridade;
}
public void setNivelPrioridade(int nivelPrioridade) {
    this.NivelPrioridade = nivelPrioridade;
}
}