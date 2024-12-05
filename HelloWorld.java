import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Bitte gib eine Zahl ein: ");

    int zahl = myObj.nextInt(); 

    int i = 2;
    boolean isPrime = true;
    while (i <= zahl/2 && zahl % i != 0) {
        isPrime=true;
        i++;
        System.err.println("DER Wert von i nach der Schleife: " + i);
    }

    System.err.println("Der Wert von i nach der Schleife: " + i);

    if (i == zahl/2) {
       isPrime=false;
        System.err.println(zahl + " ist eine Primzahl");
    }
    

    myObj.close(); 
  }
}