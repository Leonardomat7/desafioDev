package com.desafio.dev;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.mockito.Mockito.*;

public class CorsConfigTest {

    @InjectMocks
    private CorsConfig corsConfig;

    @Mock
    private CorsRegistry corsRegistry;


    @Test
    public void testCorsFilter() {
        MockitoAnnotations.openMocks(this);

        CorsFilter corsFilter = corsConfig.corsFilter();
        assert corsFilter != null;
    }
}
