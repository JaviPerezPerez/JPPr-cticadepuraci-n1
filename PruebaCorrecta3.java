public class PruebaCorrecta3 {
    public static void mostrartablasparcialmente(int a, int b){
        int valor;
        for (int i=1; i<=a; i++){
        for (int j=1; j<=a;j++){
            valor = i * j;
            System.out.println(i + " * " + j + " = "+ (valor));
        }
            System.out.println("--------");
        }
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        mostrartablasparcialmente(x, y);
    }
}