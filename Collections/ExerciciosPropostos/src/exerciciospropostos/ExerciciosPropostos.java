package exerciciospropostos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExerciciosPropostos {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //**--------------------------------------------------------------- List ------------------------------------------------------------------------**//
        
        // -------------- Exercício 1 --------------- //
        
        /* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
        Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
        e em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).*/
        
//        List<Integer> temp = new ArrayList<>();
//        
//        int media = 0;
//        
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Informe a temperatura do " + i + "° mês");
//            temp.add(input.nextInt());
//        }
//        
//        Iterator<Integer> iterator = temp.iterator();
//        int soma = 0;
//        while(iterator.hasNext()){
//            Integer next = iterator.next();
//            soma += next;
//        }
//        
//        media = soma / (temp.size());
//        
//        System.out.println("Média Semestral das Temperaturas: " + media + "°C");
//        
//        System.out.println("1 - Janeiro: " + temp.get(0) + "°C");
//        System.out.println("2 - Fevereiro: " + temp.get(1) + "°C");
//        System.out.println("3 - Março: " + temp.get(2) + "°C");
//        System.out.println("4 - Abril: " + temp.get(3) + "°C");
//        System.out.println("5 - Maio: " + temp.get(4) + "°C");
//        System.out.println("6 - Junho: " + temp.get(5) + "°C");    
        
        // -------------- Exercício 2 --------------- //
        
        /* Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
        As perguntas são:
        1. "Telefonou para a vítima?"
        2. "Esteve no local do crime?"
        3. "Mora perto da vítima?"
        4. "Devia para a vítima?"
        5. "Já trabalhou com a vítima?"
        
        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
        entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificado como "inocente".*/
        
        //**---------------------------------------------------------------- Set ------------------------------------------------------------------------**//
        
        // -------------- Exercício 1 --------------- //
        
        /* Crie um conjunto contendo as cores do arco-íris e:
            A. Exiba todas as cores uma abaixo da outra.
            B. Aquantidade de cores que o arco-íris tem.
            c. Exiba as cores em ordem alfabética.
            D. Exiba as cores na onden inversa da que foi informada.
            E. Exiba todas as cores que começam com a letra "v".
            F. Remova todas as cores que não começam com a letra "v".
            G. Limpe o conjunto.
            H. Confira se o conjunto está vazio.
        */
        
//        Set<String> arcoIris = new HashSet<>();
//            arcoIris.add("vermelha");
//            arcoIris.add("laranja");
//            arcoIris.add("amarela");
//            arcoIris.add("verde");
//            arcoIris.add("azul");
//            arcoIris.add("azul-escuro");
//            arcoIris.add("violeta");
//        
//        System.out.println("A: " + arcoIris);
//        System.out.println("B: " + arcoIris.size());
//        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
//        System.out.println("C: " + arcoIris2);
//        
//        List<String> arcoIris3 = new ArrayList<>(arcoIris);
//        Collections.reverse(arcoIris3);
//        System.out.println("D: " + arcoIris3);
//        
//        System.out.print("E: ");
//        for (String cor : arcoIris3) {
//            if (cor.startsWith("v")) System.out.print(cor + "  ");
//        }
//        
//        Iterator<String> iterator2 = arcoIris.iterator();
//        while(iterator2.hasNext()){
//            if (!iterator2.next().startsWith("v")) iterator2.remove();
//        }
//        System.out.println("\nF: " + arcoIris);
//        
//        arcoIris.clear();
//        System.out.println("G: " + arcoIris);
//        
//        System.out.println("H: " + arcoIris.isEmpty());
//        
//        System.out.println("---------------------------------------------------------------------\n");
        
        // -------------- Exercício 2 --------------- //
        
        /* Crie uma classse LinguagemFavorita que possua os atributos
        nome, anoDeCriacao e ide. Em seguida, crie um conjunto com 3 linguagens
        e faça um programa que ordene esse conjunto por:
            A. Ordem de inserção.
            B. Ordem Natural (nome).
            C. IDE.
            D. Ano de criação e nome.
            E. Nome, ano de criação e IDE.
        Ao final, exiba as linguagens no console, uma abaixo da outra.
        */
        
//        Set<LinguagemFavorita> linguagem = new HashSet<>(){{
//            add(new LinguagemFavorita("Java", 1991, "Intellij"));
//            add(new LinguagemFavorita("Angular", 2016, "VSCode"));
//            add(new LinguagemFavorita("React Native", 2015, "VSCode"));
//        }};
//        
//        System.out.println("A: " + linguagem);
//        
//        Set<LinguagemFavorita> linguagem2 = new TreeSet<>(linguagem);
//        System.out.println("\nB: ");
//        for (LinguagemFavorita a : linguagem) System.out.println("\t" + a.getNome() + " - "
//            + a.getAnoDeCriacao()+ " - " + a.getIde());
//        
//        Set<LinguagemFavorita> linguagem3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
//        linguagem3.addAll(linguagem);
//        System.out.println("\nC: ");
//        for (LinguagemFavorita a : linguagem3) System.out.println("\t" + linguagem3);
//        
//        Set<LinguagemFavorita> linguagem4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
//        linguagem4.addAll(linguagem);
//        System.out.println("\nD: ");
//        for (LinguagemFavorita a : linguagem4) System.out.println("\t" + linguagem);
//        
//        Set<LinguagemFavorita> linguagem5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
//        linguagem5.addAll(linguagem);
//        System.out.println("\nE: ");
//        for (LinguagemFavorita a : linguagem5) System.out.println("\t" + linguagem);

        // -------------- Exercício 3 --------------- //
        
        /*  Dadas as seguintes informações  de id e contato, crie um dicionário e
            ordene este dicionário exibindo (Nome id - Nome contato);
            id = 1 - Contato = nome: Simba, numero: 2222;
            id = 4 - Contato = nome: Cami, numero: 5555;
            id = 3 - Contato = nome: Jon, numero: 1111;
        */
        
         System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
           put(1, new Contato("Simba", 5555));
           put(4, new Contato("Cami", 1111));
           put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        
//        System.out.println("--\tOrdem número telefone\t--");
//        //precisamos organizar os valores. Logo:
//        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
//        set.addAll(agenda.entrySet());
//        for (Map.Entry<Integer, Contato> entry: set) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
//                    ": " +entry.getValue().getNome());
//        }

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}

//
//class LinguagemFavorita implements Comparable<LinguagemFavorita>{
//    private String nome;
//    private Integer anoDeCriacao;
//    private String ide;
//
//    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
//        this.nome = nome;
//        this.anoDeCriacao = anoDeCriacao;
//        this.ide = ide;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public Integer getAnoDeCriacao() {
//        return anoDeCriacao;
//    }
//
//    public void setAnoDeCriacao(Integer anoDeCriacao) {
//        this.anoDeCriacao = anoDeCriacao;
//    }
//
//    public String getIde() {
//        return ide;
//    }
//
//    public void setIde(String ide) {
//        this.ide = ide;
//    }
//
//    @Override
//    public String toString() {
//        return "\nNome = " + nome + ", Ano de Criação = " + anoDeCriacao + ", IDE = " + ide;
//    }
//
//    @Override
//    public int compareTo(LinguagemFavorita linguagem) {
//        return 0;
//    }  
//}
//
//
//class ComparatorIde implements Comparator<LinguagemFavorita>{
//
//    @Override
//    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
//        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
//    }
//}
//
//class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{
//
//    @Override
//    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
//        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
//        if (anoDeCriacao != 0) return anoDeCriacao;
//        
//        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
//    }
//}
//
//class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{
//
//    @Override
//    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
//        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
//        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
//        if (nome != 0) return nome;
//        if (anoDeCriacao != 0) return anoDeCriacao;
//        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
//    }
//}

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}