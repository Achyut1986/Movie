package com.cognizant.singlemovie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;


@WebMvcTest(JsonController.class)
public class JsonControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testSingleMovie() throws Exception{
        RequestBuilder request = get("/movies/movie");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.Title",is("The Godfather")))
                .andExpect(jsonPath("$.Minutes",is(175)))
                .andExpect(jsonPath("$.Genre",is("Crime, Drama")))
                .andExpect(jsonPath("$.Rating",is(9.2)))
                .andExpect(jsonPath("$.Metascore",is(100)))
                .andExpect(jsonPath("$.Description",is("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.")))
                .andExpect(jsonPath("$.Votes",is(1561591)))
                .andExpect(jsonPath("$.Gross",is(134.97)))
                .andExpect(jsonPath("$.Year",is("1972")))

                .andExpect(jsonPath("$.Credits.Person[0].Role",is("Director")))
                .andExpect(jsonPath("$.Credits.Person[0].FirstName",is("Francis Ford")))
                .andExpect(jsonPath("$.Credits.Person[0].LastName",is("Copolla")))

                .andExpect(jsonPath("$.Credits.Person[1].Role",is("Star")))
                .andExpect(jsonPath("$.Credits.Person[1].FirstName",is("Marlon")))
                .andExpect(jsonPath("$.Credits.Person[1].LastName",is("Brando")))

                .andExpect(jsonPath("$.Credits.Person[2].Role",is("Star")))
                .andExpect(jsonPath("$.Credits.Person[2].FirstName",is("Al")))
                .andExpect(jsonPath("$.Credits.Person[2].LastName",is("Pacino")));


    }
}
