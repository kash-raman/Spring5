package edu.kash.learn.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class WelcomeControllerTest {

    WelcomeController welcomeController;

    @Before
    public void setUp() throws Exception {
        welcomeController = new WelcomeController();
    }


    @Test
    public void getWelcomepage() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(welcomeController).build();
        mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("welcome"));
    }
}