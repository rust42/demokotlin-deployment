package com.example.demo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(var firstName: String?, var lastName: String?, var email: String?, var age: Int?) {

    @Id
    @GeneratedValue
    var  id: Long? = null

}