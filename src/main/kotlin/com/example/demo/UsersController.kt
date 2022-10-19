package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UsersController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping
    fun getAll(): List<UserDto> {
        return userService.getAll()
    }

    @PostMapping
    fun add(@RequestBody user: UserDto): UserDto {
        return userService.add(user);
    }

}