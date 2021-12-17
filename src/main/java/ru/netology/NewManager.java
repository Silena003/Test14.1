package ru.netology;

public class NewManager {

    private Movie[] items = new Movie[0];

    public Movie[] findAll() {
        return items;
    }

    public Movie[] getAll() {
        Movie[] result = new Movie[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }


}


//    public void add(Movie item) {
//        int length = items.length;
//        Movie[] result = new Movie[length];
//        System.arraycopy(items, 0, result, 0, items.length);
//        int lastIndex = result.length;
//        result[lastIndex] = item;
//        items = result;
//  }

