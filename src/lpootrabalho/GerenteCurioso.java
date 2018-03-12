
package lpootrabalho;


public class GerenteCurioso {
    
    public Conta clienteMaiorValor (Conta p1,Conta p2){
        
      if (p1.getSaldo() >= p2.getSaldo()) {
            return p1;
        } else {
            
            return p2;
        }  
        
        
        
    }
    
    
}
