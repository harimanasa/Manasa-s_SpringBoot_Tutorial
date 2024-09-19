package io.datajek.spring.basics.movie_recommender_system.lesson3_SpringBootStarted;

public interface Filter {
    public String[] getRecommendations(String movie);

}
