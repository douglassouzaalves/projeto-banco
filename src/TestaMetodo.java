public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(100);

        System.out.println("Saldo:" + conta.saldo);

        System.out.println("Sacando o valor solicitado....");
        boolean conseguiuSacar =  conta.saca(100);

        System.out.println("Novo Saldo: " + conta.saldo);
        System.out.println(conseguiuSacar);

        Conta contaDois = new Conta();
        contaDois.deposita(1000);

        if(contaDois.transfere(300, conta)) {
            System.out.println("Transferência efetuada com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(contaDois.saldo);
    }
}
