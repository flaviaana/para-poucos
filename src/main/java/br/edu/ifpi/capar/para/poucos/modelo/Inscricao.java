package br.edu.ifpi.capar.para.poucos.modelo;

/**
 
 * @author Lucas Rafael
 * @author Ana Flavia
/**Classe que faz especificação de Inscricao
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Gregorio Magno
 */
public class Inscricao {
    private int numero;
    private int codParticipante;
    /**
 * @return retorna o numero de inscrintos
   */ 
    public int getNumero() {
        return numero;
    }
    /**
 * @param numero  insere o numero de inscrintos
   */ 
    public void setNumero(int numero) {
        this.numero = numero;
    }
/**
 * @return retorna o codigo de cada participante do evento 
 */
    public int getCodParticipante() {
        return codParticipante;
    }
    /**
 * @param codParticipante insere o codigo de cada particiante 
 */ 
    public void setCodParticipante(int codParticipante) {
        this.codParticipante = codParticipante;
    }
}
