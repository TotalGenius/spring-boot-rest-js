package com.example.spring_boot_rest_js.controller.rest;

import com.example.spring_boot_rest_js.entity.User;
import com.example.spring_boot_rest_js.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
public class AdminRestController {
    private final UserService userService;

    public AdminRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
        User user = userService.getById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<HttpStatus> saveUser(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<HttpStatus> updateUser(@RequestBody User user) {
        userService.update(user);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") long id) {
        userService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
