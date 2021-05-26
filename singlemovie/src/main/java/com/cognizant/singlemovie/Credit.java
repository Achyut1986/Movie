package com.cognizant.singlemovie;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Credit {
    @JsonProperty("Person")
    public Person person;
}
