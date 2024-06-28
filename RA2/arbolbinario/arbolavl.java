class avl extends arbolbinario{
  //atributos
  private int altura;

  //constructor
  public avl(int dato){
    super(dato);
    this.altura=1;
  }
  //set y get
  public int getaltura(arbolbinario nodo){
    if(nodo==null){
      return 0;
    }
    return ((avl)nodo).altura;
  }
  public void actualizar_altura(){
    this.altura=1+Math.max(getaltura(this.getizq()),getaltura(this.getder()));
  }

  public int getbalance(){
    return getaltura(this.getizq())-getaltura(this.getder());
  }

  //rotaciones
  //rotacion derecha
  public avl rotarderecha(){
    avl x = (avl)this.getizq();
    this.setizq(x.getder());
    x.setder(this);
    this.actualizar_altura();
    x.actualizar_altura();
    return x;
  }
  public avl rotarizquierda(){
    avl x = (avl)this.getder();
    this.setder(x.getizq());
    x.setizq(this);
    this.actualizar_altura();
    x.actualizar_altura();
    return x;
  }
  //rebalanceo
  public avl rebalancear(){
    this.actualizar_altura();
    int balance =getbalance();
    if (balance >1){
      if(getaltura(this.getizq().getizq())>=getaltura(this.getizq().getder())){
        return rotarderecha();
      }else{
        this.setizq(((avl)this.getizq()).rotarizquierda());
        return rotarderecha();
      }
    }else if(balance <-1){
      if(getaltura(this.getder().getder())>= getaltura(this.getder().getizq())){
        return rotarizquierda();
      }else{
        this.setder(((avl)this.getder()).rotarderecha());
          return rotarizquierda();
        }
      }
    return this;
  }

  //insertar
  public avl insertar(int dato){
    if(dato<this.getdato()){
      if(this.getizq()==null){
        this.setizq(new avl(dato));
      }else{
        this.setizq(((avl)this.getizq()).insertar(dato));
      }
    }else{
      if(this.getder()==null){
        this.setder(new avl(dato));
      }else{
        this.setder(((avl)this.getder()).insertar(dato));
      }
    }
    return this.rebalancear();
  }
  
  //impresiones
  public void imprimir_avl(){
    super.imprimir();
    System.out.println("altura: "+this.altura);
  }
}