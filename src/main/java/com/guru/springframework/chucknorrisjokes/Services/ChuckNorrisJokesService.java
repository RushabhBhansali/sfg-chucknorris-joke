package com.guru.springframework.chucknorrisjokes.Services;
import com.guru.springframework.chucknorrisjokes.Model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class ChuckNorrisJokesService implements JokeService {

    @Override
    public Joke getJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return  new Joke(chuckNorrisQuotes.getRandomQuote());
    }
}
