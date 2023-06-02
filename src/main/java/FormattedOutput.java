public class FormattedOutput {
    public static void main(String[] args){

        var nome = "Maria";
        var sobrenome = "Silva";
        var idade = 18;
        var aplic = 123.453f;

        System.out.printf("Ola, %s\n", nome);
        System.out.printf("Ola, %s %s\n", nome, sobrenome);
        System.out.printf("Ola, %s %s. Voce tem %d anos\n", nome, sobrenome, idade);

        System.out.printf("Voce tem R$ %.2f aplicados.\n", aplic);
    }
}
