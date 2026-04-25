import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Veiculo v = new Veiculo(); // Não pode instanciar
        Carro c = new Carro();
        c.getPassageiros();

        Veiculo v = new Carro();
        Aviao a = new Aviao();

        List<Veiculo> lista = new ArrayList<>();
        lista.add(v);
        lista.add(a);

        for (Veiculo veiculo : lista) {
            veiculo.exibirDados();
        }

        List<Movimento> listMover = new ArrayList<>();
        listMover.add(a);
        listMover.add(c);

        for (Movimento movimento : listMover) {
            movimento.mover();
        }

    }
}
