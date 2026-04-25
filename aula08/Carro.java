public class Carro extends Veiculo implements Movimento {

    @Override
    public void exibirDados() {
        System.out.println("Carro");
    }

    @Override
    public void mover() {
        System.out.println("andando com o carro");
    }
    
}

