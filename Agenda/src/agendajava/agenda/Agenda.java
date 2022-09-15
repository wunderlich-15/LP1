package agendajava.agenda;

import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
/**
 *
 * @author guilh
 */
public class Agenda {
    private String nome;
    private String numero;
    private String email;
    private int ligacao;
    private int enviados;
    
    
    /*public void salvar(String nome, String numero, String email){
        
        try{
            
        }catch (IOException ex) {
		// TODO Auto-generated catch block
		Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
	}
    }*/
    
    public Agenda(){
        
    }
    
    public Agenda(String nome, String numero, String email){
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        
    }
    
    
   //GETTERS E SETTERS
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    void ligar(){
        ligacao = ligacao + 1;
        
    }
    
    void enviaremail(){
        enviados = enviados + 1;

    }
    
    public int getLigacao(){
        return ligacao;
    }
    
    public void setLigacao(int ligacao){
        this.ligacao = ligacao;
    }
    
    public int getEnviados(){
        return enviados;
    }
    
    public void setEnviados(int enviados){
        this.enviados = enviados;
    }
}
