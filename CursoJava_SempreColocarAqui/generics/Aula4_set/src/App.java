import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // hashset - TreeSet - LinkedHashSet
        // hashSet é o mais rápido, operações de 1 passo, muito rápido.. porém ele
        // não mantém a ordem, pode bagunçar
        //
        // LinkedHashSet -//add(obj), remove(obj) - contains(obj);
        // clear() - size() - removeIf();
        Set<String> set = new LinkedHashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set.removeIf(x -> x.charAt(0) == 'T'); // quando usamos o predicato, precisa ser aspas simples

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }

    }
}
