package com.example.db

import org.jetbrains.exposed.sql.Database

object DatabaseFactory {
    fun init() {
        Database.connect(
            url = "jdbc:postgresql://localhost:5432/chat_db",
            driver = "org.postgresql.Driver",
            user = "chat_user",
            password = "chat_password"
        )
    }
}