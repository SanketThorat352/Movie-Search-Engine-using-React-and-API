package main.java.com.example.services;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class MovieService {
    private static final String API_URL = "https://omdbapi.com";
    private static final String API_KEY = "fe2f6c44";

    public Map<String, Object> searchMovies(String title) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + "?apikey=" + API_KEY + "&s=" + title;

        try {
            return restTemplate.getForObject(url, HashMap.class);
        } catch (Exception e) {
            // Handle exceptions gracefully
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Unable to fetch movie data. Please try again later.");
            return errorResponse;
        }
    }
}

