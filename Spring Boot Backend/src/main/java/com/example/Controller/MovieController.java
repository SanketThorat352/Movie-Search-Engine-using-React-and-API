package main.java.com.example.Controller;
import com.example.moviesearch.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

import main.java.com.example.services.MovieService;

public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/api/movies")
    public Map<String, Object> searchMovies(@RequestParam String title) {
        return movieService.searchMovies(title);
    }
}

