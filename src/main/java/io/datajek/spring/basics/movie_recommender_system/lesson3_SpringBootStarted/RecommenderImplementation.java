package io.datajek.spring.basics.movie_recommender_system.lesson3_SpringBootStarted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter

    @Autowired
    private Filter filter;

    //Parameterized Constructor
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}