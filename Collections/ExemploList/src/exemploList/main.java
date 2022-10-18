package exemploList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class main {

    public static void main(String[] args){

//        List<Double> notas = new ArrayList<>(Arrays.asList(10.0d, 2.0d, 5.0d, 7.0d, 15.0d, 35.0d, 1.0d, 20.0d));
//        List<Double> nota = new ArrayList<>();
//        nota.add(7d);
//        nota.add(2d);
//        System.out.println(nota);
//        
//        System.out.println("Exibir a Posição do numero 7: " + notas.indexOf(7));
//       
//        System.out.println("Adicione na lista a nota 15 na posicao 2: ");
//        notas.add(2, 15d);
//        System.out.println(notas);
//
//        System.out.println("Substitua o numero 35 pelo numero 100");
//        notas.set(5, 100d);
//        System.out.println(notas);
//
//        System.out.println("Confira de o número 22 está na lista: " + notas.contains(22)); //Esse método contains confere se existe o parametro na lista e retorna um boolean.
//        
//        System.out.println("Exiba todos os números na ordem em que foram inseridos: "); //O método List quando imprimido sempre vai mostrar na sequência que foi inserido.
//        for (Double nota1 : notas) System.out.println(nota1); //Lambida - For Each
//
//        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
//      
//        System.out.println("Exiba a menor nota: " + Collections.min(notas));
//        System.out.println("Exiba a maior nota: " + Collections.max(notas));
//       
//        Iterator<Double> iterator = notas.iterator();
//        float soma = 0;
//        while(iterator.hasNext()){
//            Double next = iterator.next();
//            soma += next;
//        }
//        System.out.println("Exiba a soma dos valores: " + soma);
//
//        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
//
//        System.out.println("Remova a nota 5: ");
//        notas.remove(5d);
//        System.out.println(notas);
//       
//        System.out.println("Remova a nota na posição 5: ");
//        notas.remove(5);
//        System.out.println(notas);
//
//        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
//        Iterator<Double> iterator1 = notas.iterator();
//        while(iterator1.hasNext()){
//            Double next = iterator1.next();
//            if (next < 7) iterator1.remove();
//        }
//        System.out.println(notas);
//        
//        System.out.println("Apague toda a lista");
//        notas.clear();
//        System.out.println(notas);
//        
//        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

// ------------------------------------------------------------------------------------------------

//        List<Gato> meusGatos = new ArrayList<>(){{
//            add(new Gato("josé", 18, "amarelo"));
//            add(new Gato("canela", 6, "branco"));
//            add(new Gato("sardinha", 9, "tigrado"));
//        }};
//        
//        System.out.println("---\tOrdem de Inserção\t---");
//        System.out.println(meusGatos);
//        
//        System.out.println("---\tOrdem Aleatória\t---");
//        Collections.shuffle(meusGatos);
//        System.out.println(meusGatos);
//        
//        System.out.println("---\tOrdem Natural (Nome)\t---");
//        Collections.sort(meusGatos);
//        System.out.println(meusGatos);
//        
//        System.out.println("---\tOrdem Idade\t---");
//        //Collections.sort(meusGatos, new ComparatorIdade()); //    Os 2 métodos funcionam
//        meusGatos.sort(new ComparatorIdade());              //    Os 2 métodos funcionam
//        System.out.println(meusGatos);
//        
//        System.out.println("---\tOrdem Cor\t---");
//        //Collections.sort(meusGatos);
//        meusGatos.sort(new ComparatorCor());
//        System.out.println(meusGatos);
//        
//        System.out.println("---\tOrdem Nome/Cor/Idade\t---");
//        //Collections.sort(meusGatos);
//        meusGatos.sort(new ComparatorNomeCorIdade());
//        System.out.println(meusGatos);
        
//  ------------------------------------------------------------------------------------------------
    }
}

//class Gato implements Comparable<Gato>{
//    private String nome;
//    private Integer idade;
//    private String cor;
//
//    public Gato(String nome, Integer idade, String cor) {
//        this.nome = nome;
//        this.idade = idade;
//        this.cor = cor;
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
//    public Integer getIdade() {
//        return idade;
//    }
//
//    public void setIdade(Integer idade) {
//        this.idade = idade;
//    }
//
//    public String getCor() {
//        return cor;
//    }
//
//    public void setCor(String cor) {
//        this.cor = cor;
//    }
//
//    @Override
//    public String toString() {
//        return "{" + "nome=" + nome + ", idade=" + idade + ", cor=" + cor + '}';
//    }
//
//    @Override
//    public int compareTo(Gato gato) {
//        return this.getNome().compareToIgnoreCase(gato.getNome());
//    }
//}
//
//class ComparatorIdade implements Comparator<Gato>{
//    @Override
//    public int compare(Gato g1, Gato g2) {
//        return Integer.compare(g1.getIdade(), g2.getIdade());
//    }
//}
//
//class ComparatorCor implements Comparator<Gato>{
//
//    @Override
//    public int compare(Gato g1, Gato g2) {
//        return g1.getCor().compareToIgnoreCase(g2.getCor());
//    }
//}
//
//class ComparatorNomeCorIdade implements Comparator<Gato> {
//
//    @Override
//    public int compare(Gato g1, Gato g2) {
//        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
//        if (nome != 0) return nome;
//        
//        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
//        if (cor != 0) return cor;
//        
//        return Integer.compare(g1.getIdade(), g2.getIdade());
//    }
//}