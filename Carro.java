
public class Carro {
    
    private String porta = "fechada"; 
    private String farol;


    public Carro(String porta, String farol) {
        setPorta(porta);
        setFarol(farol);
    }

    public String getPorta() {
        return this.porta;
    }

    public void setPorta(String p) {
        porta = p;
    } 

    public String getFarol() {
        return this.farol;
    }

    public void setFarol(String farol) {
        this.farol = farol;
    }
    
}
