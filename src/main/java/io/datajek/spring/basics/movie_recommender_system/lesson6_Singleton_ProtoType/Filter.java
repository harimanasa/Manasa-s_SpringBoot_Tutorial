package io.datajek.spring.basics.movie_recommender_system.lesson6_Singleton_ProtoType;

public interface Filter {
    public String[] getRecommendations(String movie);

}
