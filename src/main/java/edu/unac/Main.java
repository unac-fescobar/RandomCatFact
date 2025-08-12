package edu.unac;

import org.springframework.web.client.RestTemplate;

public class Main {
    public static void main(String[] args) {
        RandomCatFact randomCatFact = new RandomCatFact(new RestTemplate());
        System.out.println(randomCatFact.getRandomCatFact());
    }
}