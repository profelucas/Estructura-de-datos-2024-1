class listaDoble{
    //atributos
    private String nombre;
    private NodoDoble primero;
    private NodoDoble ultimo;
  
    //constructor
    public listaDoble(String nombre){
      this.nombre=nombre;
      this.primero=null;
      this.ultimo=null;
    }
    //detectar si es vacia
    public boolean esvacia(){
      return this.primero==null;
    }
    //funciones de insertar
    public void insertar_principio(int dato){
      NodoDoble nuevo = new NodoDoble(dato);
  
      if(esvacia()){
        this.primero=nuevo;
        this.ultimo=nuevo;
      }else{
        nuevo.enlazar_siguiente(this.primero);
        this.primero.enlazar_anterior(nuevo);
        this.primero=nuevo;
      }
    }
  
    public void insertar_final(int dato){
      NodoDoble nuevo = new NodoDoble(dato);
      if(esvacia()){
        this.primero=null;
        this.ultimo=null;
      }else{
        this.ultimo.enlazar_siguiente(nuevo);
        nuevo.enlazar_anterior(this.ultimo);
        this.ultimo=nuevo;
      }
    }
    
    //funciones de eliminar
    public void eliminar_principio(){
      if(esvacia()){
        System.out.println("La lista esta vacia");
      }else{
        if(this.primero.getSiguiente()==null){
          this.primero=null;
          this.ultimo=null;
        }else{
          this.primero=this.primero.getSiguiente();
          this.primero.enlazar_anterior(null);
        }
      }
    }
    public void eliminar_ultimo(){
      if(esvacia()){
        System.out.println("La lista esta vacia");
      }else{
        if(this.ultimo.getanterior()==null){
          this.primero=null;
          this.ultimo=null;
        }else{
          this.ultimo=this.ultimo.getanterior();
          this.ultimo.enlazar_siguiente(null);
        }
      }
    }
  
    //funciones de mostrar
    public void mostrar(){
      NodoDoble aux;
      aux=this.primero;
      if(esvacia()){
        System.out.println("La lista esta vacia");
      }else{
        while(aux!=null){
          System.out.println(aux.getDato());
          aux=aux.getSiguiente();
        }
      }
    }
  
    public void mostrar_primero(){
      System.out.println(this.primero.getDato());
    }
  
    public void mostrar_ultimo(){
      System.out.println(this.ultimo.getDato());
    }
  }