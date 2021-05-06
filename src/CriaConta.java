public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 100;
        primeiraConta.agencia = 1;
        primeiraConta.numero = 777;
        primeiraConta.titular = "Fulano";



        System.out.println("-=-=- MINEBANK -=-=-");
        System.out.println();

        System.out.println("PRIMEIRA CONTA");
        System.out.println("Agência: " + primeiraConta.agencia);
        System.out.println("Número: " + primeiraConta.numero);
        System.out.println("Titular: " + primeiraConta.titular);
        if(primeiraConta.saldo >= 1) {
            System.out.println("Saldo: " + primeiraConta.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        //recebendo um valor, aqui o saldo será atualizado
        primeiraConta.saldo += 100;
        System.out.println("Novo Saldo: " + primeiraConta.saldo);
        System.out.println();

        System.out.println("SEGUNDA CONTA");
        Conta segundaConta = new Conta(); //estanciando uma nova conta
        segundaConta.titular = "Fulano2";
        segundaConta.saldo = 100;

        System.out.println("Titular: " + segundaConta.titular);
        System.out.println("Saldo: " + segundaConta.saldo);
    }
}
