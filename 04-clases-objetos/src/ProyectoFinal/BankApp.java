package ProyectoFinal;

import java.util.Scanner;

public class BankApp {
    private BankAccount bankAccount;
    private Scanner input;

    public BankApp(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.input = new Scanner(System.in);
    }

    public void start(){
        int option;
        do {
            displayMenu();
            option = input.nextInt();
            processOption(option);
        }while(option != 4);
    }

    private void displayMenu(){
        System.out.print("Bienvenido a Banco Castillo, por favor elija una de las siguientes opciones: \n" +
                "1 - Depositar dinero\n" +
                "2 - Retirar dinero\n" +
                "3 - Mostrar saldo actual\n" +
                "4 - Salir\n" +
                "opcion: ");
    }

    private int getUserOption(){
        return  input.nextInt();
    }

    private void handleDeposit(){
        System.out.println("Ingrese monto a depositar: ");
        double depositAmount = input.nextDouble();
        bankAccount.deposit(depositAmount);
    }

    private void handleWithdrawal(){
        System.out.println("Ingrese monto a retirar: ");
        double depositAmount = input.nextDouble();
        bankAccount.withdraw(depositAmount);
    }

    private void processOption(int option){
        switch (option){
            case 1:
                handleDeposit();
                break;
            case 2:
                handleWithdrawal();
                break;
            case 3:
                System.out.println(bankAccount.showBalance());
                break;
            case 4:
                System.out.println("Gracias por utilizar la aplicacion");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }

}
