package io.datajek.spring.basics.movie_recommender_system.lesson3_SpringBootStarted;

public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}