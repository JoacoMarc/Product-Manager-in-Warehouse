package Implementaciones;

import Interfaces.InterfazDic;

import java.util.Arrays;
import java.util.Objects;

public class ImplementacionDic implements InterfazDic {
    int[] claves;
    Producto[] valores;
    int cont;

    public ImplementacionDic(int x) {
        claves = new int[x];
        valores = new Producto[x];
        cont = 0;
    }

    @Override
    public void agregar(int clave, String nombre, double valor1, int valor2) {
        Producto producto = new Producto(nombre, valor1, valor2);
        for (int i = 0; i < cont; i++) {
            if (Objects.equals(claves[i], clave)) {
                valores[i] = producto;
                return;
            }
        }

        if (cont == claves.length) {
            agrandarDic();
        }

        claves[cont] = clave;
        valores[cont] = producto;
        cont++;
    }

    @Override
    public void sacar(int clave) {
        for(int i=0;i<cont;i++){
            if(claves[i]==clave){
                for (int j=i;j<cont;j++){
                    claves[j]=claves[j+1];
                    valores[j]=valores[j+1];
                }
                cont--;
                return;
            }
        }

    }

    @Override
    public int[] getClaves() {
        return Arrays.copyOf(claves, cont);
    }

    @Override
    public String getNombre(int clave) {
        for (int i = 0; i < cont; i++) {
            if (Objects.equals(claves[i], clave)) {
                return valores[i].nombre;
            }
        }
        return "";
    }

    @Override
    public double getValor1(int clave) {
        for (int i = 0; i < cont; i++) {
            if (Objects.equals(claves[i], clave)) {
                return valores[i].precio;
            }
        }
        return 0;
    }

    @Override
    public int getValor2(int clave) {
        for (int i = 0; i < cont; i++) {
            if (Objects.equals(claves[i], clave)) {
                return valores[i].cantidad;
            }
        }
        return 0;
    }

    @Override
    public boolean estaVacia() {
        return cont == 0;
    }

    private void agrandarDic() {
        int tamanio = claves.length * 2;
        claves = Arrays.copyOf(claves, tamanio);
        valores = Arrays.copyOf(valores, tamanio);
    }
}
