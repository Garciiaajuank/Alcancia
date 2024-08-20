
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entrada,mon20=20,mon50=50,mon100=100,mon200=200,mon500=500,montotal;
        int cmon20=0,cmon50=0,cmon100=0,cmon200=0,cmon500=0;


        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("presione 1 si quiere agregar monedas \npresione 2 si quiere contar cuantas monedas tiene de cada una");
            System.out.println("presione 3 si quiere calcular el total del dinero ahorrado \npresione 4 si quiere romper la alcancia");
            entrada = teclado.nextInt();
            switch (entrada){

                case 1:
                    System.out.println("usted eligio la opcion de agregar monedas");
                    System.out.println("ingrese cuantas monedas de 20 quiere ingresar");
                    entrada= teclado.nextInt();
                    cmon20=cmon20+entrada;
                    System.out.println("usted ingreso"+" "+entrada+" "+"monedas de 20");

                    System.out.println("ingrese cuantas monedas de 50 quiere ingresar");
                    entrada = teclado.nextInt();
                    cmon50=cmon50+entrada;
                    System.out.println("usted ingreso"+" "+entrada+" "+"monedas de 50");

                    System.out.println("ingrese cuantas monedas de 100 quiere ingresar");
                    entrada= teclado.nextInt();
                    cmon100=cmon100+entrada;
                    System.out.println("usted ingreso"+" "+entrada+" "+"monedas de 100");

                    System.out.println("ingrese cuantas monedas de 200 quiere ingresar");
                    entrada = teclado.nextInt();
                    cmon200=cmon200+entrada;
                    System.out.println("usted ingreso"+" "+entrada+" "+"monedas de 200");

                    System.out.println("ingrese cuantas monedas de 500 quiere ingresar");
                    entrada= teclado.nextInt();
                    cmon500=cmon500+entrada;
                    System.out.println("usted ingreso"+" "+entrada+" "+"monedas de 500");

                    break;

                case 2:
                    System.out.println("usted eligio la opcion de ver cuantas monedas tiene");
                    System.out.println("usted tiene"+" "+cmon20+" "+"monedas de 20");
                    System.out.println("usted tiene"+" "+cmon50+" "+"monedas de 50");
                    System.out.println("usted tiene"+" "+cmon100+" "+"monedas de 100");
                    System.out.println("usted tiene"+" "+cmon200+" "+"monedas de 200");
                    System.out.println("usted tiene"+" "+cmon500+" "+"monedas de 500");
                    break;
                case 3:
                    montotal=(mon20*cmon20)+(mon50*cmon50)+(mon100*cmon100)+(mon200*cmon200)+(mon500*cmon500);
                    System.out.println("el total de monedas que ha metido en la alcancia es"+" "+montotal);
                    break;
                case 4:
                    montotal=(mon20*cmon20)+(mon50*cmon50)+(mon100*cmon100)+(mon200*cmon200)+(mon500*cmon500);
                    System.out.println("usted eligio romper la alcancia, ya puede recoger el dinero que recolecto, usted recolecto"+" "+montotal);
                    break;
                default: System.out.println("seleccione una opcion valida");

            }

        }while (entrada!=4);


    }
}