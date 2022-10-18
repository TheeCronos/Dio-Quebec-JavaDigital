package exemplomap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploMap {
    
    public static void main(String[] args) {
        
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.5);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        
        System.out.println(carrosPopulares.toString());
        
        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        
        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        
        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));
        
        //System.out.println("\nExiba o terceiro modelo adicionado: "); // Como no Set não existe método que possa passar para mostrar por casa 
        
        System.out.println("\nExiba os modelos: " + carrosPopulares.keySet());
        
        System.out.println("\nExiba os consumos dos carros: " + carrosPopulares.values());
        
        System.out.print("\nExiba o modelo mais eficiente: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        
        System.out.print("\nExiba o modelo menos eficiente: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma dos consumos: " + soma);
        
        System.out.println("\nExiba a méida dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
        
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("\nRemova os modelos com consumo igual a 15.6 km/l: " + carrosPopulares);
    }
}
