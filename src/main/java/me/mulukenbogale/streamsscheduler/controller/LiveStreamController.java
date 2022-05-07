package me.mulukenbogale.streamsscheduler.controller;

import me.mulukenbogale.streamsscheduler.model.LiveStream;
import me.mulukenbogale.streamsscheduler.repository.LiveStreamRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    // GET http://localhost:8080/streams
    @GetMapping
    public List<LiveStream> findAll() {
        return repository.findAll();
    }

    // GET http://localhost:8080/streams/{id}
    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id) {
        return repository.findById(id);
    }

    // POST http://localhost:8080/streams
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream create(@RequestBody LiveStream stream) {
        return repository.create(stream);
    }

    // PUT http://localhost:8080/streams/{id}
    @PutMapping("/{id}")
    public void update(@PathVariable String id, @RequestBody LiveStream stream) {
        repository.update(stream, id);
    }

    // DELETE http://localhost:8080/streams/{id}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.delete(id);
    }
}
