package br.com.alura.appmusicas.modelos;

public class MinhasPreferidas {

    public void incluir(Audio a){
        if(a.getClassificacao() >= 8){
            System.out.println(a.getTitulo() + " é considerada sucesso absoluto com " + a.getTotalReproducoes() + " é a preferida de todos!" );
        }else{
            System.out.println( a.getTitulo()+" Também é um dos que todo mundo gosta!!");
        }
    }
}
