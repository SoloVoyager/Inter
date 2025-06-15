package EntidadesVirtuais;

public class Suporte {
private int idFeedback;
private String titulo;
private String mensagem;
private int tipo; // 1 - Sugestão, 2 - Reclamação, 3 - Bugs/Erros
private String dataEnvio;


public Suporte() {
    this.idFeedback = 0;
    this.titulo = "";
    this.mensagem = "";
    this.tipo = 0;
    this.dataEnvio = "";
}


public Suporte(int idFeedback, String titulo, String mensagem, int tipo, String dataEnvio) {
    this.idFeedback = idFeedback;
    this.titulo = titulo;
    this.mensagem = mensagem;
    this.tipo = tipo;
    this.dataEnvio = dataEnvio;
}


public int getIdFeedback() {
    return idFeedback;
}


public void setIdFeedback(int idFeedback) {
    this.idFeedback = idFeedback;
}


public String getTitulo() {
    return titulo;
}


public void setTitulo(String titulo) {
    this.titulo = titulo;
}


public String getMensagem() {
    return mensagem;
}


public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
}


public int getTipo() {
    return tipo;
}


public void setTipo(int tipo) {
    this.tipo = tipo;
}


public String getDataEnvio() {
    return dataEnvio;
}


public void setDataEnvio(String dataEnvio) {
    this.dataEnvio = dataEnvio;
}







}
