package AV2.AV2Interfaces.Q6Palavras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {
    private Set<String> cojunto = new HashSet<>(Arrays.asList("Ola", "Pedro", "Garrafa","mouse"));

    public boolean contemPalavra(String palavras) {
        String[] palavrasArray = palavras.split(" ");

        for (String palavra: palavrasArray) {
            if (!cojunto.contains(palavra)) {
                return false;
            }
        }
        return true;
    }
}
