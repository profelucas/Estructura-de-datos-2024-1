class PilaDinamica{
    //atributos
    private Nodo cima;
    private String nombre;

    //constructor
    public PilaDinamica(String nombre){
      this.cima=null;
      this.nombre=nombre;
    }

    //determinar si esta vacia la pila
    public boolean esVacia(){
      return this.cima==null;
    }
    //funcion que permite ingresar un nodo en la cima
    public void apilar(int dato){
      Nodo nuevo = new Nodo(dato);
      Nodo aux;
  
      if(esVacia()){
        this.cima= nuevo;
      }
      else{
          aux=this.cima;
          this.cima = nuevo;
          this.cima.enlazar(aux);
        }
    }
    //funcion que permite quitar el nodo que esta en la cima
    public void desapilar(){
      Nodo aux;
      if(esVacia()){
        System.out.println("La pila esta vacia");
      }else{
        aux = this.cima;
        this.cima=this.cima.getSiguiente();
        aux.enlazar(null);
      }
      
    }
    //funcion que permite mostrar los nodos de la pila
    public void mostrar(){
      Nodo aux;
      if(esVacia()){
        System.out.println("Las pila esta vacia");
      }else{
        aux=this.cima;
        while(aux!=null){
          System.out.println(aux.getDato());
          aux=aux.getSiguiente();
        }
      }
    }
  }