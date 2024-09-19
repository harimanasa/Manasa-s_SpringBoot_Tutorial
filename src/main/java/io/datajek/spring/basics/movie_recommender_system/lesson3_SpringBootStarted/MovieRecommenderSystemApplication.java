package io.datajek.spring.basics.movie_recommender_system.lesson3_SpringBootStarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

//	public static void main(String[] args) {
//		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter()); //Tight coupling, Bad, Didn't use Spring
//		String[] result = recommender.recommendMovies("Finding Dory");
//		System.out.println(Arrays.toString(result));
//	}

	public static void main(String[] args) {
		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//use ApplicationContext to find which filter is being used
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

//		call method to get recommendations
//		String[] result = recommender.recommendMovies("Finding Dory");

//		display results
//		System.out.println(Arrays.toString(result));

		/* This works */
		Filter testFiler = appContext.getBean(ContentBasedFilter.class);
		System.out.println("This runs " + Arrays.toString(testFiler.getRecommendations("Finding Dory")));

		/* You need to comment the below | This errors out because it is not defined as @Component, so not found in beans.factory definition */
//		Filter testFiler2 = appContext.getBean(CollaborativeFilter.class);
//		System.out.println("No qualifying bean of type 'io.datajek.spring.basics.movie_recommender_system.lesson3.CollaborativeFilter'");
//		System.out.println("This does not run " + Arrays.toString(testFiler2.getRecommendations("Finding Dory")));
	}

}
