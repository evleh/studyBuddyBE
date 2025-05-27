package org.example.backend.controller;

import org.example.backend.model.RegisteredUser;
import org.example.backend.model.Topic;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class TopicController {
    @GetMapping
    public List<Topic> readAll(){
        return null;
    }

    @GetMapping("/{id}")
    public Topic read(@PathVariable String id){
        return null;
    }

    @PostMapping
    public Topic create(@RequestBody RegisteredUser Topic){
        return null;
    }

    @PutMapping("/{id}")
    public Topic update(@PathVariable String id, @RequestBody RegisteredUser Topic) {
        return null;
    }

    //update delete
    @DeleteMapping("/{id}")
    public Topic delete(@PathVariable String id){
        return null;
    }
}
