package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerPosterTest {

    private final Movie first = new Movie(1, "link", "1", "1");
    private final Movie second = new Movie(2, "link", "2", "2");
    private final Movie third = new Movie(3, "link", "3", "3");
    private final Movie fourth = new Movie(4, "link", "4", "1");
    private final Movie fifth = new Movie(5, "link", "5", "2");
    private final Movie sixth = new Movie(6, "link", "6", "4");
    private final Movie seventh = new Movie(7, "link", "7", "2");
    private final Movie eighth = new Movie(8, "link", "8", "3");
    private final Movie ninth = new Movie(9, "link", "9", "1");
    private final Movie tenth = new Movie(10, "link", "10", "1");
    private final Movie eleventh = new Movie(11, "link", "11", "3");

    // тесты на добавление фильмов
    @Test
    public void shouldAddMovies() {
        ManagerPoster manager = new ManagerPoster();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {
        ManagerPoster manager = new ManagerPoster();
        manager.add(first);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNoMovie() {
        ManagerPoster manager = new ManagerPoster();
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }

    //тесты на вывод списка фильмов

    @Test
    public void shouldShowLastFilmsLimit() {
        ManagerPoster manager = new ManagerPoster();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsMoreLimit() {
        ManagerPoster manager = new ManagerPoster();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsMoreSetLimit() {
        ManagerPoster manager = new ManagerPoster(8);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsSetLimit() {
        ManagerPoster manager = new ManagerPoster(11);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsMoreSetLimit2() {
        ManagerPoster manager = new ManagerPoster(8);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}
