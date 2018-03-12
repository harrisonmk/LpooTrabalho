
package lpootrabalho;

import java.text.DecimalFormat;


public class Conta {
    
    DecimalFormat deci = new DecimalFormat("0.00");
   
    
    private double saldo;
    private int senha;
    private int numero;
    private int agencia;

    public Conta(double saldo, int senha, int numero, int agencia) {
        this.saldo = saldo;
        this.senha = senha;
        this.numero = numero;
        this.agencia = agencia;
    }

    public Conta() {
    }

    public DecimalFormat getDeci() {
        return deci;
    }

    public void setDeci(DecimalFormat deci) {
        this.deci = deci;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    

    
  
    public double depositar (double deposita){
        
                this.saldo += deposita;
		return this.saldo;   
        
    }
    
    public double sacar (double retirar)
	{
		if (this.saldo >= retirar)
		{
			return this.saldo -= retirar;
		}
		else
		{
			System.out.println("Impossivel Retirar:");
			return this.saldo;
		}
	}
 
    public void verificarSaldo(){
        System.out.println ("Saldo: R$ " + deci.format(this.saldo));
    }
  
    

 String obterInfo() {
     
     return  "\nSaldo: "+saldo+
             "\nSenha: "+senha+
            "\nNumero: "+numero+
            "\nAgencia: "+agencia;
     
            
    }    
    
    
    public Conta clienteMaiorValor1(Conta p2) {

        

        if (this.saldo > p2.getSaldo()) {
            return this;
        } else {

            return p2;
        }

}

    
    
    
    
}
