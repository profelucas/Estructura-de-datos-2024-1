public class Main {
    public static void main(String[] args) {
      hash hs= new hash(10);
      System.out.println("Jacob -> "+ hs.funcionhash("Jacob"));
      System.out.println("Miguel -> "+ hs.funcionhash("Miguel"));
      System.out.println("Rodrigo -> "+ hs.funcionhash("Rodrigo"));
      System.out.println("Alberto -> "+ hs.funcionhash("Alberto"));
      System.out.println("Juan -> "+ hs.funcionhash("Juan"));
      System.out.println("Jose -> "+ hs.funcionhash("Jose"));
      hs.insertar("Jacob");
      hs.insertar("Miguel");
      hs.insertar("Rodrigo");
      hs.imprimir();
      hs.buscar("Miguel");
      hs.eliminar("Miguel");
      hs.imprimir();
    }
  
  
  }