package com.kirana.stores.service.impl;

import com.kirana.stores.response.ExchangeRateResponse;
import com.kirana.stores.service.ExternalApiService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiServiceImpl implements ExternalApiService{
    private final RestTemplate restTemplate;

    public ExternalApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ExchangeRateResponse fetchDataFromExternalApi(){
        return restTemplate.getForObject("https://api.fxratesapi.com/latest", ExchangeRateResponse.class);
    }
}
