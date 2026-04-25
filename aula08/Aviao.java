public class Aviao extends Veiculo implements Movimento {

    @Override
    public void exibirDados() {
        System.out.println("Avião");
    }

    @Override
    public void mover() {
        System.out.println("Andando com o avião");
    }
}
