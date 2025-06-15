package EntidadesVirtuais;

public class Relatorios {
 private int idRelatorio;
 private String titulo;
 private String mensagem;
 private String dataEntrega;
 public Relatorios() {
        this.idRelatorio = 0;
        this.titulo = "";
        this.mensagem = "";
        this.dataEntrega = "";
 } 
    public Relatorios(int idRelatorio, String titulo, String mensagem, String dataEntrega) {
            this.idRelatorio = idRelatorio;
            this.titulo = titulo;
            this.mensagem = mensagem;
            this.dataEntrega = dataEntrega;
    }
    public int getIdRelatorio() {
        return idRelatorio;
    }
    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
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
    public String getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
