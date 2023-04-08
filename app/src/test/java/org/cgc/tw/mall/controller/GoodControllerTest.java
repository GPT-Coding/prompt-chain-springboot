package org.cgc.tw.mall.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.cgc.tw.mall.domain.Good;
import org.cgc.tw.mall.service.GoodService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringJUnitConfig
@WebMvcTest(controllers = GoodController.class)
@ActiveProfiles("test")
public class GoodControllerTest {

    @MockBean
    private GoodService goodService;

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        objectMapper = new ObjectMapper();
    }

    @Test
    public void getAllGoods_ShouldReturnAllGoods() throws Exception {
        // Arrange
        Good good1 = new Good("Good 1", "Description 1", BigDecimal.valueOf(100.0), "https://example.com/good1.jpg");
        Good good2 = new Good("Good 2", "Description 2", BigDecimal.valueOf(200.0), "https://example.com/good2.jpg");
        List<Good> goods = Arrays.asList(good1, good2);
        when(goodService.getAllGoods()).thenReturn(goods);

        // Act
        MvcResult result = mockMvc.perform(get("/goods"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", Matchers.hasSize(2)))
                .andReturn();

        // Assert
        String responseBody = result.getResponse().getContentAsString();
        List<Good> returnedGoods = Arrays.asList(objectMapper.readValue(responseBody, Good[].class));
        assertThat(returnedGoods, Matchers.hasItem(good1));
        assertThat(returnedGoods, Matchers.hasItem(good2));
    }

}
