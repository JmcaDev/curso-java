package ProyectoFinal;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("jose", 200.10);
        BankApp bankApp = new BankApp(bankAccount);

        bankApp.start();
    }
}
