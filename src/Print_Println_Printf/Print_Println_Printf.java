package Print_Println_Printf;

public class Print_Println_Printf {
    public static void main(String[] args) {

        int idade = 30;
        double altura = 1.81;
        String nome = "Isabella Alves de Barros";
        boolean estudante = true;
        char sexo = 'F';

        //%s String
        //%d Int
        //%.4f float ou double com 4 casas decimais
        //%b boolean
        //%c caractere (char)

        //System.out.print("Altura: " + altura);
        //System.out.println("Idade: " + idade);

        System.out.printf("A idade é %d e a altura é %.2f. \nO nome é %s e o sexo é %c. \nÉ estudante? %b. ", idade, altura, nome, sexo, estudante);


    }
}
