package Week9.Exercise5;

public class Film {
    //budget0;genres1;id2;popularity3;release_date4;revenue5;runtime6;tagline7;title8;vote_average9;vote_count10
    private Long budget;
    private Long revenue;
    private Integer runTime;
    private String title;
    private Double score;
    private Integer voteCount;

    public Long getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public Film(Long budget, Long revenue, Integer runTime, String title, Double score, Integer voteCount) {
        this.budget = budget;
        this.revenue = revenue;
        this.runTime = runTime;
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
    }

    @Override
    public String toString() {
        return "Film" +
                "budget=" + budget +
                " revenue=" + revenue +
                " runTime=" + runTime +
                " title='" + title +
                " score=" + score +
                ", voteCount=" + voteCount;
    }
    //Create the Film class that has a , a score, a and a .


}
