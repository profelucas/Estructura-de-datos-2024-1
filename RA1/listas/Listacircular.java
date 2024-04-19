class Listacircular{
    private String nombre;
    private Nodo primero;
    private Nodo ultimo;

    public Listacircular(String nombre){
        this.nombre=nombre;
        this.primero=null;
        this.ultimo=null;
    }
    public boolean esvacio(){
        return this.primero==null;
    }

    public void insertar_primero(int dato){
        Nodo nuevo = new Nodo(dato);

        if(esvacio()){
            this.primero=nuevo;
            this.ultimo=nuevo;
            this.ultimo.enlazar(this.primero);
        }else{
            nuevo.enlazar(this.primero);
            this.primero=nuevo;
            this.ultimo.enlazar(nuevo);
        }

    }
    public void insertar_ultimo(int dato){
        Nodo nuevo = new Nodo(dato);
        if(esvacio()){
            this.primero=nuevo;
            this.ultimo=nuevo;
            this.ultimo.enlazar(this.primero);
        }else{
            this.ultimo.enlazar(nuevo);
            this.ultimo=nuevo;
            nuevo.enlazar(this.primero);
        }
    }
    

    public void eliminar_primero(){
        
        if(esvacio()){
            System.err.println("esta vacio");
        }else{
            this.ultimo.enlazar(this.primero.getSiguiente());
            this.primero=this.primero.getSiguiente();
        }
    }
    public void eliminar_ultimo(){
        Nodo aux;
        aux=this.primero;
        if(esvacio()){
            System.err.println("esta vacio");
        }else{
            while(aux.getSiguiente()!=this.ultimo){
                aux=aux.getSiguiente();
            }
            aux.enlazar(this.primero);
        }
    }

    public void mostrar(){
        //desafio realizar esta funcion que muestre todos los elementos de la lista circular
        //probar que es circular mediante esta funcion

    }

    public void mostrar_recursivo(){
        //desafio realizar esta funcion que muestre todos los elementos de la lista circular mediante recursividad
        //probar que es circular mediante esta funcion
    }

}