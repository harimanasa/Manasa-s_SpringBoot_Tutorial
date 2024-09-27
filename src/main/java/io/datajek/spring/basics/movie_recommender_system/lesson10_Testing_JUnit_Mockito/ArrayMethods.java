package io.datajek.spring.basics.movie_recommender_system.lesson10_Testing_JUnit_Mockito;

public class ArrayMethods {

    int findIndex(int[] array, int number) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                index = i;
        }
        return index;
    }

    boolean searchForNumber(int[] array, int numberToSearchFor) {
        boolean found = false;
        //...
        return found;
    }
}