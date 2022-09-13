package conta;

import java.util.Hashtable;
import java.util.Map;

public class conta {
    private Hashtable<String, String> contas = new Hashtable<String, String>();// CPF/NOME

//    public Hashtable<String, String> getContas() {
//        return contas;
//    }
    public void getContas() {
        for(Map.Entry<Integer, String> entry : contas ){
            System.out.println( entry.getKey() + "->" + entry.getValue() );
        }
    }

    public void setContas(Hashtable<String, String> contas) {
        contas.put("Teste","1");
        contas.put("Teste","2");
        contas.put("Teste","3");
        this.contas = contas;
    }
}
