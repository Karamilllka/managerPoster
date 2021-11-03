package ru.netology;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ManagerPoster {

    private Movie[] movies = new Movie[0];
    private int limit = 10;

    public Movie[] getMovies() {
        return movies;
    }

    public int getLimit() {
        return limit;
    }

    public ManagerPoster(int limit) {
        this.limit = limit;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] showLastFilms() {
        int resultLength;
        if (getLimit() > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = getLimit();
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
