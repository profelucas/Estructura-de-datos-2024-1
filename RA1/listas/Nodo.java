class Nodo{
    private int dato;
    private Nodo siguiente;

    public Nodo(int dato){
        this.dato=dato;
        this.siguiente=null;
    }

    public int getdato(){
        return this.dato;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }

    public void enlazar(Nodo nuevo){
        this.siguiente=nuevo;
    }


}