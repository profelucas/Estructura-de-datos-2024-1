public class Main {
    public static void main(String[] args) {
      int tam=6;
  
      pilaestatica p = new pilaestatica(tam, "Pila");
  
      p.mostrar();
  
      p.apilar(10);
  
      p.apilar(2);
      p.apilar(73);
      
      p.mostrar();
  
  
      System.out.println("La cima de la pila es: "+p.micima());
      p.desapilar();
  
      p.mostrar();
      System.out.println("La cima de la pila es: "+p.micima());
    }
  
  }