package ProyectoFinal;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposito realizado con exito!\n" + showBalance());
        } else {
            System.out.println("El deposito no puede ser negativo");
        }
    }

    public void withdraw(double amount) {
        if (amount <= this.balance && amount > 0 ) {
            this.balance -= amount;
            System.out.println("Monto retirado con exito\n" + showBalance());
        } else{
            System.out.println("El retiro no puede ser mayor al saldo actual o menor a 0 ");
        }
    }
    public String showBalance() {
        String message = "Su saldo actual es de: " + this.balance + "$";
        return message;
    }
}
