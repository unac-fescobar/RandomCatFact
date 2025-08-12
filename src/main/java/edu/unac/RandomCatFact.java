package edu.unac;

import org.springframework.web.client.RestTemplate;;

public class RandomCatFact {
    private RestTemplate restTemplate;

    public RandomCatFact(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public String getRandomCatFact() {
        try {
            CatFact catFact = restTemplate.getForObject("https://catfact.ninja/fact", CatFact.class);
            return catFact.getFact();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
