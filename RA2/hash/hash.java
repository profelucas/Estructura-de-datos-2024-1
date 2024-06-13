class hash{
    private Object[] datos;
    private int tamano;
    //constructor
    public hash(int tamano){
      this.tamano=tamano;
      this.datos=new Object[tamano];
    }
    //funcion hash
    public int funcionhash(String n){
      int suma=0,i;
      for(i=0;i<n.length();i++){
        suma+=n.charAt(i); 
      }
      return suma % this.tamano;
    }
    //funcion para insertar ocupando la funcion hash
    public void insertar(String n){
      int pos= funcionhash(n);
      if(datos[pos]==null){
        datos[pos]=n;
      }else{
        System.out.println("Colision");
      }
    }
    
    //funcion para eliminar un valor ocupando la funcion hash
    
    public void eliminar(String n){
      int pos= funcionhash(n);
      if(datos[pos]==null){
        System.out.println("No se encontro");
      }else{
        datos[pos]=null;
      }
    }
    //funcion para buscar
    public void buscar(String n){
      int pos = funcionhash(n);
      if(datos[pos]==null){
        System.out.println("No se encontro");
      }else{
        if(datos[pos].equals(n)){
          System.out.println("Se encontro en la posicion " + pos);
        }else{
          System.out.println("hay colision");
        }
      }
    }
    //funcion para buscar de manera normal
    public void busqueda_normal(String n){
      int i;
      for(i=0;i<this.tamano;i++){
        if(datos[i]!=null){
          if(datos[i].equals(n)){
            System.out.println("Se encontro en la posicion " + i);
          }
        }
      }
    }
  
    //funcion para imprimir el arreglo
    public void imprimir(){
      int i;
      for(i=0;i<this.tamano;i++){
        System.out.println(this.datos[i]);
      }
    }
  }