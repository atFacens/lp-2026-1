public class Exemplo02 {
    public static void main(String[] args) {
        int opcao = 4;
        int cont = 0;

        // cont++;
        // if (opcao == 1) {
        //     System.out.println("Vc escolheu 1");
        // } else {
        //     cont++;
        //     if (opcao == 2) {
        //         System.out.println("Vc escolheu 2");
        //     } else {
        //         cont++;
        //         if (opcao == 3) {
        //             System.out.println("Vc escolheu 3");
        //         } else {
        //             cont++;
        //             if (opcao == 4) {
        //                 System.out.println("Vc escolheu 4");
        //             } else {
        //                 System.out.println("Vc escolheu errado");
        //             }

        //         }
        //     }
        // }

        switch (opcao) {
            case 1:
                cont++;
                System.out.println("Vc escolheu 1");
                break;
            case 2:
                cont++;
                System.out.println("Vc escolheu 2");
                break;
            case 3:
                cont++;
                System.out.println("Vc escolheu 3");
                break;
            case 4:
                cont++;
                System.out.println("Vc escolheu 4");
                break;
            default:
                cont++;
                System.out.println("Vc escolheu errado");
                break;
        }

        System.out.println("Comparou " + cont + " vez(es)");
    }
}
