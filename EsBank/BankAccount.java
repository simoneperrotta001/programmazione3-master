package EsBank;

public class BankAccount {
    private float amount;

    public BankAccount(){
        amount = 0.0f;
    }

    public float balance(){
        return amount;
    }

    public void deposit(float x){
        if (x>0)
        amount = amount + x;
        else
            System.out.println("Importo invalido");
    }

    public void withdraw(float x){
        if (amount >= x)
        amount = amount - x;
        else
            System.out.println("Denaro insufficiente");
    }



    
}
