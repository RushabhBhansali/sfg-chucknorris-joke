package com.guru.springframework.chucknorrisjokes.Controller;

import com.guru.springframework.chucknorrisjokes.Services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokesController {
    JokeService jokeService;

   @Autowired
    public JokesController(@Qualifier("chuckNorrisJokesService") JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping(value={"/",""},method = RequestMethod.GET)
    public String getJoke(Model model){
       model.addAttribute("chucknorris",jokeService.getJoke());
       return "chucknorris";
    }

}
