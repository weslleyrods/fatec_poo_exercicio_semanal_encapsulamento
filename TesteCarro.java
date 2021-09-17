public class TesteCarro {

    public static void main(String[] args){

        Carro fusca = new Carro("Aberto", "Aceso");
        Carro kombi = new Carro("Fechado", "Apagado");
        // fusca.setPorta("aberta");
        // fusca.setFarol("aceso");
        // kombi = setPorta("fechada");
        // kobmi = setFarol("apagado");
        System.out.println(fusca.getPorta());
        System.out.println(fusca.getFarol());
        System.out.println(kombi.getPorta());
        System.out.println(kombi.getFarol());
        
    }
    
}
