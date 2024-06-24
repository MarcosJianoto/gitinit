public class App {
    public static void main(String[] args) throws Exception {

        String[] senha = new String[] { "5", "2", "5", "2", "M", "a", "r", "c", "o", "s", "@" };
        String[] alfabet = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

        String[] alfabetMaiusculo = new String[] {};
        for (int i = 0; i < alfabet.length; i++) {
            alfabetMaiusculo[i] = alfabet[i].toUpperCase();
        }

        String[] numero = new String[] { "0123456789" };
        String[] caracteresEspeciais = new String[] { "@!#$%&*()_-" };

        for (int i = 0; i < senha.length; i++) {

            for (int j = 0; j < alfabet.length; j++) {
                if (senha[i].contains(alfabet[i])) {

                    for (int k = 0; k < alfabetMaiusculo.length; k++) {
                        if (senha[i].contains(alfabetMaiusculo[i])) {

                            for (int l = 0; l < numero.length; l++) {
                                if (senha[i].contains(numero[i])) {

                                    for (int m = 0; m < caracteresEspeciais.length; m++) {
                                        if (senha[i].contains(caracteresEspeciais[i])) {
                                            System.out.println("Senha correta");
                                            System.out.println(senha.toString());
                                            break;
                                        }

                                    }
                                }
                            }
                        }
                    }

                }
            }

        }

    }
}
