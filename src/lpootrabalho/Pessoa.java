
package lpootrabalho;



public class Pessoa {
    
    private String nome;
    private String date;
    private char sexo;
    private String cpf;
    private Conta[] contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta[] getConta() {
        return contas;
    }

    public void setConta(Conta[] contas) {
        this.contas = contas;
    }

    public String obterInfor(){
        
      String info = "Conta \nNome: "+nome;  
             info += "\nDate: "+date;
             info += "\nSexo: "+sexo;
             info += "\nCpf: "+cpf+"\n";
             
             if (contas !=null){
                 for (Conta c : contas){
                     info += c.obterInfo()+"\n";
                 }
             
             }
        
      return info;
    }

    

             
}
    
    
    
    

