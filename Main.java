import Implementaciones.ImplementacionConjunto;
import Implementaciones.ImplementacionDic;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ImplementacionDic dic=new ImplementacionDic(5);
        ImplementacionConjunto conjuntoPopular=new ImplementacionConjunto();
        ImplementacionConjunto conjuntoLiquidacion=new ImplementacionConjunto();
        conjuntoLiquidacion.InicializarConjunto();;
        conjuntoPopular.InicializarConjunto();
        Scanner sc=new Scanner(System.in);
        for (int i =0;i<2;i++){
            System.out.println("Ingrese codigo de producto: ");
            int codigo=sc.nextInt();
            System.out.println("Ingrese nombre de producto: ");
            String nombre=sc.next();
            System.out.println("Ingrese precio de producto: ");
            double precio=sc.nextDouble();
            System.out.println("Ingrese cantidad de producto: ");
            int cantidad=sc.nextInt();
            GestorAlmacen.agregarProducto(dic,codigo,nombre,precio,cantidad);

        }
        GestorAlmacen.mostrarDic(dic);

        System.out.println("Ingrese codigo de producto vendido: ");
        int codigo=sc.nextInt();
        System.out.println("Ingrese nueva cantidad de producto: ");
        int cantidad=sc.nextInt();
        GestorAlmacen.venderProducto(dic,codigo,cantidad);

        GestorAlmacen.mostrarDic(dic);

        System.out.println("Ingrese codigo de producto popular: ");
        int codigo2=sc.nextInt();
        GestorAlmacen.marcarProductoPopular(conjuntoPopular,codigo2);
        System.out.println("Listado productos Populares: ");
        GestorAlmacen.listarProductosPopulares(conjuntoPopular);
        System.out.println("Ingrese codigo de producto en liquidacion: ");
        int codigo3=sc.nextInt();
        GestorAlmacen.marcarProductoLiquidacion(conjuntoLiquidacion,codigo3);
        System.out.println("Listado productos en Liquidacion: ");
        GestorAlmacen.listarProductosLiquidacion(conjuntoLiquidacion);






    }
}