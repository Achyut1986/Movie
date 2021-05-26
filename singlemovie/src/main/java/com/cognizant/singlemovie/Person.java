package com.cognizant.singlemovie;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    @JsonProperty("Role")
    public String role;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LastName")
    public String lastName;


}
