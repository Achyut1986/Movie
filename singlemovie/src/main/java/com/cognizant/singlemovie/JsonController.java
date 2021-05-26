package com.cognizant.singlemovie;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JsonController {
    @JsonProperty("Title")
    public String title;

    @JsonProperty("Minutes")
    public int minutes;

    @JsonProperty("Genre")
    public String genre;

    @JsonProperty("Rating")
    public double rating;

    @JsonProperty("Metascore")
    public int metascore;

    @JsonProperty("Description")
    public String description;

    @JsonProperty("Votes")
    public int votes;

    @JsonProperty("Gross")
    public double gross;

    @JsonProperty("Year")
    public int year;

    @JsonProperty("Credits")
    public List<Credit> credits;
}
