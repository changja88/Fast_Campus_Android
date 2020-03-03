package com.example.myapplication

import java.io.Serializable


class PersonFromServer(
    var id: Int? = null,
    var name: String? = null,
    var age: Int? = null,
    var intro: String? = null
) : Serializable
