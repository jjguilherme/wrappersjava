//Nome: Joao Guilherme de Souza
//RA: a2479516


import java.util.Scanner;
import java.lang.Double;

public class WrappersClasse{
		
public static void main(String arg[]){

	Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("\nUSO DE CLASSES WRAPPERS - MENU DE OPCOES");
            System.out.println("1) INTEGER");
            System.out.println("2) BOOLEAN");
            System.out.println("3) CHARACTER");
            System.out.println("4) DOUBLE");
            System.out.println("5) BYTE");
            System.out.println("6) SHORT");
            System.out.println("7) FLOAT");
            System.out.println("8) LONG");
            System.out.println("0) SAIR");

            System.out.print("\nESCOLHA UMA OPCAO: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    convertStr_Int();
                    break;
                case 2:
                    booleanComparison();
                    break;
                case 3:
                    charExemplo();
                    break;
                case 4:
                    doubleParsing();
                    break;
                case 5:
                    byteExemplo();
                    break;
                case 6:
                    shortExemplo();
                    break;
                case 7:
                    floatExemplo();
                    break;
               case 8:
                    longExemplo();
                    break; 
                case 0:
                    System.out.println("\nEncerrando programa...");
                    break;
                default:
                    System.out.println("\nOpcao invalida! Tente novamente.");
                    break;
            }

        } while (option != 0);

	scanner.close();
    }

// i)Classe Integer: metodos parseInt() e toString()
// ii) O metodo convertStr_Int ira converter o valor de uma String para o tipo primitivo int e
// tambem um tipo int para uma String.
// iii) Referencia: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html
public static void convertStr_Int(){
	Scanner scanner = new Scanner(System.in);

	System.out.print("\nDigite um valor em formato String: ");
	String val_Str = scanner.nextLine();

	int x = Integer.parseInt(val_Str);
	String frase = Integer.toString(x);

	System.out.println("\nValor em int: "+ x);
	System.out.println("Valor em String "+ frase);
}



// i) Classe Boolean: metodo equals()
// ii) O metodo booleanComparison ira comparar se duas variaveis do tipo Boolean possuem o mesmo valor.
// iii) Referencia: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Boolean.html

public static void booleanComparison(){
	
	Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor booleano (true/false): ");
        Boolean bool1 = scanner.nextBoolean();
        System.out.print("Digite o segundo valor booleano (true/false): ");
        Boolean bool2 = scanner.nextBoolean();

        if (bool1.equals(bool2)) {
            System.out.println("\nOs valores booleanos sao iguais!");
        } else {
            System.out.println("\nOs valores booleanos sao diferentes!");
        }
	
}

// i)Classe char: metodos isDigit(), isLowerCase(), isUpperCase(), isSpaceChar()
// ii)O metodo charExemplo ira verificar o tipo dos caracteres
// iii)Referencia: https://www.devmedia.com.br/metodos-da-classe-character-string-em-java-parte-3/21811

public static void charExemplo(){
	Scanner scanner = new Scanner(System.in);

	String s;
    	char c;
    	int i, n;

    	System.out.printf("Informe uma String:\n");
    	s = scanner.nextLine();

    	System.out.println();

    	n = s.length(); // tamanho da String
    		for (i=0; i<n; i++) {
     			 c = s.charAt(i);
      		if (Character.isDigit(c))
         		System.out.printf("%c <--- numero\n", c);
     		else if (Character.isLowerCase(c))
              		System.out.printf("%c <--- letra minuscula\n", c);
           	else if (Character.isUpperCase(c))
                   	System.out.printf("%c <--- letra maiuscula\n", c);
                else if (Character.isSpaceChar(c))
                        System.out.printf("%c <--- espaco\n", c);
                else System.out.printf("%c\n", c);
  		}
  	

}

//i)Classe Float: metodo floatToRawIntBits(), intBitsToFloat;
//ii)O metodo floatToRawIntBits() da classe float converte um ponto float em um valor int bruto, sem mudar o seu tipo
//iii)Referencia: https://www.javatpoint.com/java-float
public static void floatExemplo(){
	Scanner scanner = new Scanner(System.in);
	
 	System.out.print("\nDigite um valor em formato float: ");
    	float val_float = scanner.nextFloat();

    	int raw_bits = Float.floatToRawIntBits(val_float);

    	System.out.println("\nValor float: " + val_float);
    	System.out.println("Valor em raw bits: " + raw_bits);

    	float converted_float = Float.intBitsToFloat(raw_bits);

   	System.out.println("Valor convertido: " + converted_float);
	
	
}

//i)Classe Double: metodo compareTo();
//ii)O metodo compareTo da classe double compara dois valores double numericamente
//iii)Referencia: https://www.javatpoint.com/java-double-compareto-method

public static void doubleParsing(){
	Scanner scanner = new Scanner(System.in);

	System.out.print("\nDigite um valor em formato double: ");
	Double val_double1 = scanner.nextDouble();
	System.out.print("\nDigite outro valor em formato double: ");
	Double val_double2 = scanner.nextDouble();

	int compare = val_double1.compareTo(val_double2);
	if(compare >= 0){
		System.out.println("Primeiro valor "+val_double1+" eh maior ou igual que o segundo valor "+val_double2+".");
	}
	else{
		System.out.println("Segundo valor "+val_double2+" eh maior que o primeiro "+val_double1);	
	}
	
}

//i)Classe byte: metodo byteParsing();
//ii)O codigo solicita que o usuario insira um valor do tipo byte e em seguida multiplica esse valor por dois e imprime o resultado
//iii)Referencia: https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Byte.html

public static void byteExemplo(){
	Scanner scanner = new Scanner(System.in);

	System.out.println("\nDigite um valor em formato byte (entre -128 e 127)");
	byte val_byte = scanner.nextByte();

	int resultado = val_byte * 2;
	System.out.println("O dobro do valor digitado eh: "+ resultado);

}

//i)Classe short: metodo nextShort()
//ii)O usuario digita um valor inteiro entre -32768 e 32767 para ler o valor digitado como short e armazena-lo na variavel value
//depois verificamos se ele eh positivo ou negativo
//iii)Referencia: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Short.html

public static void shortExemplo(){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um valor inteiro intre -32768 e 32767: ");
	short value = scanner.nextShort();

	if(value >= 0){
		System.out.println("O valor digitado eh positivo.");
	}else{
		System.out.println("O valor digitado eh negativo.");
	}
}

//i)Classe long: metodo convertLong_Str()
//ii)Nesta classe o programa le o valor digitado pelo usuario e o converte para uma string
//iii)Referencia: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

public static void longExemplo(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nDigite um valor em formato long: ");
    long val_Long = scanner.nextLong();

    String frase = Long.toString(val_Long);

    System.out.println("\nValor em long: "+ val_Long);
    System.out.println("Valor em String "+ frase);
}
}