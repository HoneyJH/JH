
public class BankAccount {
    private String ano;
    private String owner;
    private int balace;
    
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalace() {
        return balace;
    }

    public void setBalace(int balace) {
        this.balace = balace;
    }

    public BankAccount(String ano, String owner, int balace) {
        this.ano = ano;
        this.owner = owner;
        this.balace = balace;
    }
    
}
