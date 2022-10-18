package exemplostreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        
        System.out.println("Imprima todos os elementos dessa lista de String");        
        
        numerosAleatorios.stream().forEach(new Consumer<String>(){
            @Override
            public void accept(String s) {                                  //  <- Esse modo não é muito utilizado
                System.out.println(s);
            }
        });

        numerosAleatorios.stream().forEach(s -> System.out.println(s));     // <- Modo simplificado com lambida 
        
        numerosAleatorios.forEach(s -> System.out.println(s));              // <- Modo mais simplificado tirando o método Stream()
        
        numerosAleatorios.forEach(System.out::println);                       // <- Modo mais simplificado

//-----------------------------------------------------------------------------------------------------------------------------------------

//        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set");
//        numerosAleatorios.stream()
//            .limit(5)
//            .collect(Collectors
//            .toSet())
//            .forEach(System.out::println);

//-----------------------------------------------------------------------------------------------------------------------------------------

//        System.out.println("Transforme esta lista de String em uma lista de números inteiros");

//        numerosAleatorios.stream()
//              .map(new Function<String, Integer>(){
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        });
        
//        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
        
//-----------------------------------------------------------------------------------------------------------------------------------------

//        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");
        
//        List<Integer> list1 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(new Predicate<Integer>(){
//            @Override
//            public boolean test(Integer i){
//                if (i %2 == 0 && i >2) return true;
//                return false;
//            }
//        }).collect(Collectors.toList());

        //Simplificando o que está acima 
//        List<Integer> list2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i %2 == 0 && i >2))
//                .collect(Collectors.toList());
//        System.out.println(list2);

//-----------------------------------------------------------------------------------------------------------------------------------------

//        System.out.println("Mostre a média dos números");
        
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);

//-----------------------------------------------------------------------------------------------------------------------------------------

//        System.out.println("Remova os números ímpares");
        
//        List<Integer> list3 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        list3.removeIf(i -> (i %2 != 0));
//        System.out.println(list3);
    }
}
