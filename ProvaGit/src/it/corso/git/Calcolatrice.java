package it.corso.git;

import java.util.Scanner;

public class Calcolatrice  {




public void operazioni() throws Eccezione {
Scanner input = new Scanner(System.in);
boolean termina = false;

do {
	
System.out.printf("Digita un numero: ");
float num1 = input.nextFloat();
System.out.printf("Digita un altro numero: ");
float num2 = input.nextFloat();
System.out.println("Ora digita l'operazione che desideri fare:\n1) somma;\n2) sottrazione;\n3) moltiplicazione;\n4) divisione.");
int scelta = input.nextInt();
switch(scelta) {

case 1: {
System.out.println("Hai scelto la somma.");
float result = num1+num2;
System.out.printf("La somma tra %.2f e %.2f vale %.2f.\n", num1,num2,result);
break;
}

case 2: {
System.out.println("Hai scelto la sottrazione.");
float result = num1-num2;
System.out.printf("La differenza tra %.2f e %.2f vale %.2f.\n", num1,num2,result);
break;
}

case 3: {
System.out.println("Hai scelto la moltiplicazione.");
float result = num1*num2;
System.out.printf("La moltiplicazione tra %.2f e %.2f vale %.2f.\n", num1,num2,result);
break;
}

case 4: {
System.out.println("Hai scelto la divisione.");
if ( num2 == 0) throw new Eccezione();
float result = num1/num2;
System.out.printf("La divisione tra %.2f e %.2f vale %.2f.\n", num1,num2,result);
break;
}

default: {
System.out.println("Scelta non riconosciuta.");
break;
}
}

System.out.println("vuoi continuare?");
System.out.println("s/n ?");
termina = "n".equals(input.next("\\w"));
} while(!termina) ;
}
}