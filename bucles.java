import java.util.Scanner;

public class bucles {

    public void BucleIf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea comparar en bucle if");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Es menor que cero");
        }else if (n>0){
            System.out.println("Es mayor que cero");
        }else{
            System.out.println("Es igual a cero");
        }
    }
    
    public void BucleWhile(){
        System.out.println("El numero de inicio es 0");
        int NumWhile=0;
        while (NumWhile < 3) {
            System.out.println("El Numero de NumWhile es: " + NumWhile);
            NumWhile++;
        }
    }

    public void BucleDoWhile(){
        System.out.println("El numero de inicio es 3");
        int NumWhile=3;
        do{
            System.out.println("El Numero de NumWhile es: " + NumWhile);
            NumWhile++;
        }while (NumWhile < 3);
    }

    public void BucleFor(){
        System.out.println("El numero de inicio es 0");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El Numero de numeroFor es: " + numeroFor);
        }
    }

    public void BucleSwitch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra que desea comparar en bucle switch");
        System.out.println("Primavera, Verano, Otono, Invierno");
        String n = sc.nextLine();
        switch (n) {
            case "Primavera":
                System.out.println("La estacion es: " + n);
                break;
            case "Verano":
                System.out.println("La estacion es: " + n);
                break;
            case "Otono":
                System.out.println("La estacion es: " + n);
                break;
            case "Invierno":
                System.out.println("La estacion es: " + n);
                break;
            default:
                System.out.println("No es ninguna Estacion");
                break;
        }
    }

    public static void main(String[] args) {
        bucles a = new bucles();
        System.out.println("Bucle If");
        a.BucleIf();
        System.out.println("Bucle While");
        a.BucleWhile();
        System.out.println("Bucle Do While");
        a.BucleDoWhile();
        System.out.println("Bucle For");
        a.BucleFor();
        System.out.println("Bucle Switch");
        a.BucleSwitch();
    }
}
