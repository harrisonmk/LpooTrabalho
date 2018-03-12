package lpootrabalho;

/**
 *
 * @author Harrison
 */
public class LpooIntroducao {

    public static void main(String[] args) {

       
       Pessoa p1 = new Pessoa();
       
       p1.setNome("harrison");
       p1.setDate("13/01/1996");
       p1.setSexo('M');
       p1.setCpf("739.051.490-60");
       
       
       Conta conta = new Conta();
       
       conta.setSaldo(34.56);
       conta.setSenha(1234);
       conta.setNumero(151415);
       conta.setAgencia(15);

       Conta conta1 = new Conta();
       
       conta1.setSaldo(300.56);
       conta1.setSenha(4321);
       conta1.setNumero(101020);
       conta1.setAgencia(189);
       
       Conta conta2 = new Conta();
       
       conta2.setSaldo(50.56);
       conta2.setSenha(1010);
       conta2.setNumero(444546);
       conta2.setAgencia(24);
        
       
       Conta[] contas = new Conta[3];
       contas[0]= conta;
       contas[1]=conta1;
       contas[2] =conta2;
       
                    
       p1.setConta(contas);
       
       System.out.println(p1.obterInfor());
       
       // *********************************************//****************************************//
       
       Pessoa p2 = new Pessoa();
       
       p2.setNome("Ana");
       p2.setDate("20/05/1995");
       p2.setSexo('F');
       p2.setCpf("740.051.460-60");
       
       
       Conta c = new Conta();
       
       c.setSaldo(10.20);
       c.setSenha(8080);
       c.setNumero(98765);
       c.setAgencia(23);

       Conta c1 = new Conta();
       
       c1.setSaldo(3.56);
       c1.setSenha(1414);
       c1.setNumero(843334);
       c1.setAgencia(22);
       
       Conta c2 = new Conta();
       
       c2.setSaldo(5.70);
       c2.setSenha(2445);
       c2.setNumero(987654);
       c2.setAgencia(12);
        
       
       Conta[] contas2 = new Conta[3];
       contas2[0]= c;
       contas2[1]=c1;
       contas2[2] =c2;
    
      p2.setConta(contas2);
       
       System.out.println(p2.obterInfor());         
        
    }

}
