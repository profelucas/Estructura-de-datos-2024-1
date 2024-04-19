class listaSimple{
    private String nombre;
    private Nodo primero;
    private Nodo ultimo;
  
    public listaSimple(String nombre){
      this.nombre=nombre;
      this.primero=null;
      this.ultimo=null;
    }
    public Nodo primero(){
      return this.primero;
    }
  
    public boolean esVacia(){
      return this.primero==null;
    }
    public void insertar_primero(int dato){
      Nodo nuevo = new Nodo(dato);
      if(esVacia()){
        this.primero=nuevo;
        this.ultimo=nuevo;
      }else{
        nuevo.enlazar(this.primero);
        this.primero=nuevo;
      }
    }
    
    public void insertar_ultimo(int dato){
      Nodo nuevo = new Nodo(dato);
      if(esVacia()){
        this.primero=nuevo;
        this.ultimo=nuevo;
      }else{
        this.ultimo.enlazar(nuevo);
        this.ultimo=nuevo;
      }
    }
     public void mostrar_simple(){
        //desafio realizar esta funcion que muestre todos los elementos de la lista simple.
     }

     public void mostrar_simple_recursivo(){
        //desafio realizar esta funcion que muestre todos los elementos de la lista simple mediante recursividad.
     }
  
  }