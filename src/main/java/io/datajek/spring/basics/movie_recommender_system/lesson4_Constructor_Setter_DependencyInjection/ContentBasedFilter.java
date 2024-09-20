package io.datajek.spring.basics.movie_recommender_system.lesson4_Constructor_Setter_DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter{

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}