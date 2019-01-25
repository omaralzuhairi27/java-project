package Week9.Exercise5;

import java.util.List;

public class FilmSummarizer {
    private FilmReader film=new FilmReader();

    public void sortbyRatting(){
        List<Film> films= film.getFilms("Week9/Exercise5/films.csv");
        films.stream()
               .sorted((e1,e2)->e2.getScore().compareTo(e1.getScore()))
               .limit(3)
               .forEach(e -> System.out.println("Title: "+e.getTitle()+"  rating:"+e.getScore()));

    }
    public void moreThanThreeHours(){
        List<Film> films= film.getFilms("Week9/Exercise5/films.csv");
        films.stream()
                .filter(e1->e1.getRunTime()>180)
                .sorted((e1,e2)->e2.getScore().compareTo(e1.getScore()) )
                .limit(3)
                .forEach(e -> System.out.format("Title: %s rating: %s runTime: %s \n",e.getTitle(),e.getScore(),e.getRunTime()));

    }
    public void sortedByBudget(){
        List<Film> films= film.getFilms("Week9/Exercise5/films.csv");
        films.stream()
                .sorted((e1,e2)->e2.getBudget().compareTo(e1.getBudget()))
                .limit(4)
                .forEach(e -> System.out.println("Title: "+e.getTitle()+"  rating: "+e.getScore()+" Budget: "+e.getBudget()));


    }
    public static void main(String[] args) {
        FilmSummarizer summarizer=new FilmSummarizer();
        summarizer.sortbyRatting();
        System.out.println("!-------------------------------!");
        summarizer.moreThanThreeHours();
        System.out.println("!-------------------------------!");
        summarizer.sortedByBudget();

    }
}


