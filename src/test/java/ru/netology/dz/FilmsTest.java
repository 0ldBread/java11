package ru.netology.dz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class FilmsTest {
        Films film1 = new Films(12336869, "Бладшот");
        Films film2 = new Films(12439375, "Вперед");
        Films film3 = new Films(90454722, "Отель Белград");
        Films film4 = new Films(77394725, "Джентельмены");
        Films film5 = new Films(83659579, "Человек-неведимка");
        Films film6 = new Films(14038249, "Тролли. Мировой тур");
        Films film7 = new Films(20374562, "Номер один");


        @Test
        public void shouldFindAll() {
            FilmsManager manager = new FilmsManager();
            manager.addFilm(film1);
            manager.addFilm(film2);
            manager.addFilm(film3);
            manager.addFilm(film4);
            manager.addFilm(film5);
            manager.addFilm(film6);
            manager.addFilm(film7);
            Films[] expected = {film1, film2, film3, film4, film5, film6, film7};
            Films[] actual = manager.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldFindNone() {
            FilmsManager manager = new FilmsManager();
            Films[] expected = {};
            Films[] actual = manager.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldFindLast5() {
            FilmsManager manager = new FilmsManager();
            manager.addFilm(film1);
            manager.addFilm(film2);
            manager.addFilm(film3);
            manager.addFilm(film4);
            manager.addFilm(film5);
            manager.addFilm(film6);
            manager.addFilm(film7);
            Films[] expected = {film7, film6, film5, film4, film3};
            Films[] actual = manager.findLast();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldFindLast7() {
            FilmsManager manager = new FilmsManager(7);
            manager.addFilm(film1);
            manager.addFilm(film2);
            manager.addFilm(film3);
            manager.addFilm(film4);
            manager.addFilm(film5);
            manager.addFilm(film6);
            manager.addFilm(film7);
            Films[] expected = {film7, film6, film5, film4, film3, film2, film1};
            Films[] actual = manager.findLast();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldFindLast0() {
            FilmsManager manager = new FilmsManager(0);
            Films[] expected = {};
            Films[] actual = manager.findLast();
            Assertions.assertArrayEquals(expected, actual);
        }


    }

