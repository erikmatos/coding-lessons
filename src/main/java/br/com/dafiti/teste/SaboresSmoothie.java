package br.com.dafiti.teste;

import java.util.*;

import static java.util.stream.Collectors.toList;

public enum SaboresSmoothie {

    CLASSIC("Classic", Arrays.asList("strawberry", "banana", "pineapple", "mango", "peach", "honey", "ice", "yogurt")),
    FOREST_BERRY("Forest Berry", Arrays.asList("strawberry", "raspberry", "blueberry", "honey", "ice", "yogurt")),
    FREEZIE("Freezie", Arrays.asList("blackberry", "blueberry", "black currant", "grape juice", "frozen yogurt")),
    GREENIE("Greenie", Arrays.asList("green apple", "kiwi", "lime", "avocado", "spinach", "ice", "apple juice")),
    VEGAN_DELITE("Vegan Delite", Arrays.asList("strawberry", "passion fruit", "pineapple", "mango", "peach", "ice", "soy milk")),
    JUST_DESSERTS("Just Desserts", Arrays.asList("banana", "ice cream", "chocolate", "peanut", "cherry"));

    private String nome;
    private List<String> ingredientes;

    SaboresSmoothie(String nome, List<String> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public static Optional<Set<String>> getIngredientes(String sabor) {
         Optional<SaboresSmoothie> saborEncontrado =
                 Arrays.stream(values()).filter(s -> s.nome.equals(sabor)).findFirst();
        return saborEncontrado.isPresent() ?
                Optional.of(new HashSet<>(saborEncontrado.get().getIngredientes())) : Optional.empty();
    }
}
