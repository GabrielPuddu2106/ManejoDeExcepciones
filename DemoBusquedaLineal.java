import java.util.Scanner;

public class DemoBusquedaLineal{
    public static void main(String [] args) throws Exception{
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos elementos enteros va a ingresar");
        int cantidadElementos = lector.nextInt();
        //int Arreglo[] = {84,21,47,96,15}
        int Arreglo[] = new int[cantidadElementos];
    public int busquedaLineal(int A[], int n, int buscado){
        int indice = 0;
        while(indice <n){
            if(A[indice] == buscado){
                return indice;
            }
            indice = indice + 1;
        }
        return -1;
    }
    public static void main(String[] args){
        DemoBusquedaLineal obj = new DemoBusquedaLineal();

        int A[] = {84, 21, 47, 96, 15};

        int buscado = 15;

        int hallado = obj.busquedaLineal(A, A.length, buscado);

        if( hallado != -1){
            System.out.println(" El valor " + buscado + "fue encontrado en la posicion " +hallado);
        }else {
            System.out.println(" El valor " + buscado + "no fue encontrado");
        }
    }
}

