package com.mangaproject.manga_asd.Controller;


import com.mangaproject.manga_asd.Model.User;
import com.mangaproject.manga_asd.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class userController {


    @Autowired
    private IUserService userd;

    @GetMapping("/list")
    public List<User> getAllUsers() {
        return userd.findAll();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userd.save(user);
    }

}
