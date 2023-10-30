package com.talowski.pokemonapivaadinspringbootb;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonClient {

    @EventListener(ApplicationReadyEvent.class)
    public  Root getPokemon() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Root> exchange = restTemplate.exchange(
                "https://api.pokemontcg.io/v1/cards?name=charmander",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Root.class);

        System.out.println(exchange.getBody());

        return null;
    }

}
