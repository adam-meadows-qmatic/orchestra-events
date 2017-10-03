package com.qmatic.qp.events.config;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@CrossOrigin
public class MyCorsFilter extends CorsFilter {

    /**
     * Constructor accepting a {@link CorsConfigurationSource} used by the filter to find
     * the {@link CorsConfiguration} to use for each incoming request.
     *
     * @param configSource
     * @see UrlBasedCorsConfigurationSource
     */
    public MyCorsFilter(CorsConfigurationSource configSource) {
        super(configSource);
    }

    private static UrlBasedCorsConfigurationSource configurationSource() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }
}