import java.lang.StackWalker.StackFrame;

import javax.management.monitor.StringMonitorMBean;

public class Publicacao {
   private String dataPublicacao;
   private String textoPublicacao;
   private String linkMidia;
   public static double contadorPublicacao;

   public Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
    this.dataPublicacao = dataPublicacao;
    this.textoPublicacao = textoPublicacao;
    this.linkMidia = linkMidia;
}

public void setTextoPublicacao(String textoPublicacao) {
    this.textoPublicacao = textoPublicacao;
}

public void setLinkMidia(String linkMidia) {
    this.linkMidia = linkMidia;
}

public String getDataPublicacao() {
    return dataPublicacao;
}

public String getTextoPublicacao() {
    return textoPublicacao;
}

public static double getContadorPublicacao() {
    return contadorPublicacao;
}    
   
}
