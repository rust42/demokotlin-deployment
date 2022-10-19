package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {

    @Autowired
    private lateinit var userRepo: UserRepo

    override fun getAll(): List<UserDto> = userRepo.findAll().map { UserDto(
        it.id,
        it.firstName,
        it.lastName,
        it.email,
        it.age
    )}

    override fun add(userDto: UserDto): UserDto {
       var user = User(userDto.firstName, userDto.lastName, userDto.email, userDto.age)
        user = userRepo.save(user)
        return UserDto(
            user.id,
            user.firstName,
            user.lastName,
            user.email,
            user.age
        )
    }
}