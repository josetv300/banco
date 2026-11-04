import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("por favor digite o nome de usuario:");
    String usuario = scanner.nextLine();
    double saldo = 2000.56;
    int opcao = 0;

    System.out.print("################################");
    System.out.print("\nUsuario: " + usuario);
    System.out.print("\nsaldo disponivel: " + saldo);
    System.out.print("\n################################");

    String menu = """
            Digite seu comando.
            1- Retirar.
            2- Depositar.
            3- Verificar saldo.
            4- Logout.
            """;
    while (opcao != 4) {
        System.out.println(menu);
        opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Informe o valor a ser retirado: ");
            double valor = scanner.nextDouble();
            if (valor > saldo) {
                System.out.println("ALERTA SALDO INSUFICIENTE.");
            } else {
                saldo -= valor;
                System.out.println(valor + " Retirado.");
            }
        } else if (opcao == 2) {
            System.out.println("Informe a quantidade a depositar.");
            double valor = scanner.nextDouble();
            saldo += valor;
            System.out.println(valor + " Depositado a sua conta.");
        } else if (opcao == 3) {
            System.out.println("Seu saldo atual é de: " + saldo);
        } else if (opcao != 4) {
            System.out.println("Comando invalido ou indisponivel.");
        }
    }
}
