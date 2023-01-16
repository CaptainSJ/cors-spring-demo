package dev.captainsj.corsspringdemo.controller;

import dev.captainsj.corsspringdemo.model.Coffee;
import dev.captainsj.corsspringdemo.model.Size;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
//@RequestMapping("/coffee")
public class CoffeeController {

    List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Saurabh", Size.LARGE));
        coffeeList.add(new Coffee(2, "Monu", Size.GRANDE));
        coffeeList.add(new Coffee(3, "Sonu", Size.SMALL));

    }

    @GetMapping("/coffees")
    public List<Coffee> getCoffees() {
        return coffeeList;
    }

    @GetMapping("coffee/{id}")
    public Coffee getCoffee(@PathVariable Integer id) {
        return coffeeList.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst().orElse(null);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Coffee, Lovers!";
    }




}
