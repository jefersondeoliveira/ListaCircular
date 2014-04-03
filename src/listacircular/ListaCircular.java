package listacircular;

public class ListaCircular {

    public static void main(String[] args) {
       Lista li = new Lista();
       
       li.insereInicio("Soltado 01");
       li.insereInicio("Soltado 02");
       li.insereInicio("Soltado 03");
       li.insereInicio("Soltado 04");
       li.insereInicio("Soltado 05");
       li.insereInicio("Soltado 06");
       li.insereInicio("Soltado 07");
       li.insereInicio("Soltado 08");
       li.insereInicio("Soltado 09");
       li.insereInicio("Soltado 10");
       li.removeSorteio(7, "Soltado 04");
       
    }
    
}
