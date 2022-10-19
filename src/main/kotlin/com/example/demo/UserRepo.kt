package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepo: JpaRepository<User, Long> {

}