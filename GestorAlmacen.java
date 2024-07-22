import Implementaciones.ImplementacionConjunto;
import Implementaciones.ImplementacionDic;
import Implementaciones.Nodo;

import java.util.Arrays;
import java.util.Scanner;

public class GestorAlmacen {
    public static void agregarProducto(ImplementacionDic dic ,int clave,String nombre,double Valor1,int Valor2){
        dic.agregar(clave,nombre,Valor1,Valor2);

    }
    public static void venderProducto(ImplementacionDic dic ,int clave,int Valor2){
        String nombre=dic.getNombre(clave);
        double Valor1=dic.getValor1(clave);
        dic.agregar(clave,nombre,Valor1,Valor2);

    }
    public static void marcarProductoPopular(ImplementacionConjunto conjunto,int codigo){
        conjunto.agregar(codigo);
    }
    public static void listarProductosPopulares(ImplementacionConjunto conjunto){
        Nodo actual=conjunto.inicio;
        while(actual!=null){
            System.out.println(actual.info);
            actual=actual.sig;}
    }
    public static void marcarProductoLiquidacion(ImplementacionConjunto conjunto,int codigo){
        conjunto.agregar(codigo);
    }
    public static void listarProductosLiquidacion(ImplementacionConjunto conjunto){
        listarProductosPopulares(conjunto);
    }
    public static void mostrarDic(ImplementacionDic dic){
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(dic.getClaves()));
        System.out.println("Ingrese codigo para ver mas INFO: ");
        int codigoProducto=sc.nextInt();
        System.out.println("Nombre: "+dic.getNombre(codigoProducto));
        System.out.println("Precio: "+dic.getValor1(codigoProducto));
        System.out.println("Cantidad: "+dic.getValor2(codigoProducto));
    }
}
