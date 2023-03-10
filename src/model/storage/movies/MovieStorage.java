/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.storage.movies;

import java.util.Map;
import model.models.Movie;

/**
 *
 * @author Robert Szlufik #2020358
 */
public interface MovieStorage {

    Map<Integer, Movie> getAllMovies();

    Movie getMovie(int id);

}
