package com.vinh.giflib.controller;

import com.vinh.giflib.data.GifRepository;
import com.vinh.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepo;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepo.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }

    // URL -> http://localhost:8080/gif/android-explosion
    // android-explosion will be pass in via String name through @PathVariable
    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepo.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
