package guru.springframework.chucknorrisforactuator.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesService implements JokesInterface{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public ChuckNorrisQuotes getChuckNorrisQuotes() {
        return chuckNorrisQuotes;
    }

    public void setChuckNorrisQuotes(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getRandomnJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
