package Implementaciones;

import Interfaces.InterfazConjunto;

import java.util.Objects;

public class ImplementacionConjunto implements InterfazConjunto {
    public Nodo inicio;

    public ImplementacionConjunto() {
        inicio=null;
    }

    @Override
    public void InicializarConjunto() {
        inicio=null;
    }

    @Override
    public void agregar(int x) {
        if(!Pertenece(x)){
            Nodo nuevo=new Nodo(x,null);
            nuevo.sig=inicio;
            inicio=nuevo;

        }

    }

    @Override
    public void sacar(int x) {
        Nodo actual=inicio;
        Nodo anterior=null;
        while(actual!=null && !Objects.equals(actual.info, x)){
            anterior=actual;
            actual=actual.sig;
        }
        if(actual!=null){
            if(anterior==null){
                inicio=actual.sig;
            }
            else{
                anterior.sig=actual.sig;
            }
        }

    }

    @Override
    public boolean Pertenece(int x) {
        Nodo actual=inicio;
        while(actual!=null){
            if (Objects.equals(actual.info, x)){
                return true;
            }
            actual=actual.sig;
        }
        return false;
    }
}


