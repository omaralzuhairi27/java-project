package Week10.Exercise1;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PokemonApp {


    //collect with Collectors.toList
    public void getPokemonName(List <Pokemon> pokemons) {
        List <String> names = pokemons.stream()
                .map(e -> e.getName())
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(names);
    }

    public List <String> getPokemonTyp(List <Pokemon> pokemons) {
        return pokemons.stream()
                .map(e -> e.getType1() + "  " + e.getType2())
                .limit(10)
                .collect(Collectors.toList());
    }

    //collect with Collectors.toSet
    public void getPoemonNameUseSet(List <Pokemon> pokemons) {
        Set <String> names = pokemons.stream()
                .map(e -> e.getName())
                .limit(10)
                .collect(Collectors.toSet());
        System.out.println(names);
    }

    public void getPokemonTypUseSet(List <Pokemon> pokemons) {
        Set <String> names = pokemons.stream()
                .map(e -> e.getType1() + "  " + e.getType2())
                .limit(10)
                .collect(Collectors.toSet());
        System.out.println(names);
    }

    //collect with Collectors.grouppingBy and Collectors.counting
    public void grouppByType1(List <Pokemon> pokemons) {
        Map <String, Long> names = pokemons.stream()
                .filter(e -> !e.getType1().isEmpty())
                .map(e -> e.getType1())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        names.entrySet().stream()
                .map(e -> e.getKey() + " \t |  " + e.getValue())
                .forEach(e -> System.out.println(e));
    }

    public void grouppByType2(List <Pokemon> pokemons) {
        Map <String, Long> names = pokemons.stream()
                .map(Pokemon::getType2)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        names.entrySet().stream()
                .map(e -> e.getKey() + " | " + e.getValue())
                .forEach(System.out::println);
    }

    //collect with Collectors.grouppingBy and Collectors.toList
    public void pokemonTheUseWater(List <Pokemon> pokemons) {
        pokemons.stream()
                .collect(Collectors.groupingBy(Pokemon::getType1,Collectors.toList()))
                .entrySet().stream()
                .map(e -> e.getKey() + "  " + e.getValue().stream().map(Pokemon::getName).collect(Collectors.toList()))
                //.map(e -> e.getKey() + "  " + e.getValue().stream().map(Pokemon::getName).collect(Collectors.joining(",")))
                .forEach(System.out::println);


        //  .collect(Collectors.toMap(Pokemon::getName,Pokemon::getType2));


    }
    public void trySharife(List<Pokemon> pokemons){
        pokemons.stream()
                .collect(Collectors.toMap(e->e.getName(),e->e.getType1()))
                .entrySet().stream()
                .map(e -> e.getKey() + " | "+ e.getValue())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        PokemonsReader reader = new PokemonsReader();
        List <Pokemon> pokemons = reader.asList("Week10/Exercise1/pokemon.csv");
        PokemonApp pokemonApp = new PokemonApp();
        //pokemonApp.getPokemonName(pokemons);
        //  System.out.println(pokemonApp.getPokemonTyp(pokemons));
        //  System.out.println("!----------------collect with Collectors.toSet----------------!");
        //   pokemonApp.getPoemonNameUseSet(pokemons);
        //  pokemonApp.getPokemonTypUseSet(pokemons);
        // pokemonApp.grouppByType1(pokemons);
        // System.out.println(" by_________________________");
        // pokemonApp.grouppByType2(pokemons);
        ///
         pokemonApp.pokemonTheUseWater(pokemons);

    }


}
/*
collect with Collectors.toList
collect with Collectors.toSet
collect with Collectors.grouppingBy and Collectors.counting
collect with Collectors.grouppingBy and Collectors.toList
sorted
sorted with Comparator
limit
filter
count
forEach
findFirst
noneMatch
anyMatch
allMatch
flatMap
reduce

 */
