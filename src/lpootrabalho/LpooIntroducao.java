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
       
       
    
               
        
    }

}
