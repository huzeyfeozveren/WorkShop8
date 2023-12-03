package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.entities.Car;
import com.tobeto.a.spring.intro.entities.Color;
import com.tobeto.a.spring.intro.repositories.ColorRepository;
import com.tobeto.a.spring.intro.sevices.abstracts.ColorService;
import com.tobeto.a.spring.intro.sevices.dtos.color.requests.AddColorRequest;
import com.tobeto.a.spring.intro.sevices.dtos.color.requests.DeleteColorRequest;
import com.tobeto.a.spring.intro.sevices.dtos.color.requests.UpdateColorRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
public class ColorController {
    private ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }
    @PostMapping
    public void add(@RequestBody AddColorRequest request){
        colorService.add(request);
    }
    @DeleteMapping
    public void delete(@RequestBody DeleteColorRequest request) { colorService.delete(request);}
    @PutMapping
    public void update(@RequestBody UpdateColorRequest request) { colorService.update(request);}

}
    /*

    @GetMapping
    public List<Color> getAll(){

        return colorRepository.findAll();
    }
    @GetMapping("{id}")
    public Color getById(@PathVariable int id){

        return colorRepository.findById(id).orElseThrow();
    }

    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Color color) {

    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){

    }
*/
