/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52558
 */
public class Cuenta {

    private double saldo;

    public Cuenta(){
        saldo = 0;
    }

    public void depositar(double monto){
        System.out.println("Depositando " + monto);
        saldo += monto;
    }

    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando " + monto);
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;
    }

    public double getSaldo(){
        return saldo;
    }

}
