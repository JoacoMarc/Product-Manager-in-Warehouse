package Interfaces;

public interface InterfazDic {
    void agregar(int clave,String nombre,double valor1,int valor2);
    void sacar(int clave);
    int [] getClaves();
    String getNombre(int clave);
    double getValor1(int clave);
    int getValor2(int clave);
    boolean estaVacia();

}
