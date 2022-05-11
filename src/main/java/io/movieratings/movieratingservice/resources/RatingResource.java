package io.movieratings.movieratingservice.resources;

import io.movieratings.movieratingservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
@RequestMapping("/{movieID}")
    public Rating getRating(@PathVariable("movieID") String movieID){
          return new Rating(movieID, 4);
    }
}
