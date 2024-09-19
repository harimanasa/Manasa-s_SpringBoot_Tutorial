package io.datajek.spring.basics.movie_recommender_system.lesson1;

public class RecommenderImplementation {
    //use filter interface to select filter
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