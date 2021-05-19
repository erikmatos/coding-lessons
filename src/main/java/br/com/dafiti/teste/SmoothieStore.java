package br.com.dafiti.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class SmoothieStore {

    public List<String> getIngredientesSmoothie(String sabor, String... alteracoes) {
        Optional<Set<String>> ingredientesOpt = SaboresSmoothie.getIngredientes(sabor);

        if (ingredientesOpt.isEmpty()) {
            throw new RuntimeException("Sabor não encontrado");
        }

        Set<String> ingredientes = ingredientesOpt.get();

        for (int i = 0; i < alteracoes.length; i++) {
            String operacao = alteracoes[i].substring(0, 1);
            String ingrediente = alteracoes[i].substring(1);
            if ("+".equals(operacao)) {
                ingredientes.add(ingrediente);
            } else if("-".equals(operacao)) {
                ingredientes.remove(ingrediente);
            } else {
                throw new RuntimeException("Operacao invalida");
            }
        }

        return new ArrayList<>(ingredientes);
    }

    public static void main(String[] args) {
        SmoothieStore store = new SmoothieStore();

        System.out.println(store.getIngredientesSmoothie("Classic", "+chocolate"));
        System.out.println(store.getIngredientesSmoothie("Classic", "+chocolate", "-strawberry"));

    }

}
