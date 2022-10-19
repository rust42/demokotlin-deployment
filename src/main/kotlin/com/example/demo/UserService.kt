package com.example.demo

interface UserService {
    fun getAll(): List<UserDto>;
    fun add(userDto: UserDto): UserDto;
}