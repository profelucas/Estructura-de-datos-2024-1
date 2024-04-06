class pilaestatica {
    // se crean los atributos de la clase pilaestatica
    private Object[] pila;
    private int tope;
    private int tamano;
    private String nombre;
  
    //funcion constructor de la pila estatica
    public pilaestatica(int tamano, String nombre){
      this.tamano = tamano;
      this.nombre = nombre;
      this.tope = -1;
      this.pila = new Object[tamano];
    }
  
    //verifica si la pila esta vacia
    public boolean espilaVacia(){
      return tope == -1;
    }
  
    //funcion que retorna el valor que esta en la cima
    public Object micima(){
      return pila[tope];
    }
    //funcion que apila un elemento en la pila estatica
    public void apilar(Object x){
      tope++;
      pila[tope] = x;
    }
  
    //funcion que elimina el valor que esta en la cima de la pila
    public Object desapilar(){
      if (!espilaVacia()){
          return this.pila[this.tope--];
      }else{
        System.out.println("La pila esta vacia");
        return null;
      }
    }
    //funcion que muestra el contenido de la pila estatica
    public void mostrar(){
      if (!espilaVacia()){
        System.out.println("Los elementos de la pila");
        for (int i =tope; i>=0;i--){
          System.out.println(pila[i]);
        }
      }else{
        System.out.println("La pila esta vacia");
      }
    } 
  }
  