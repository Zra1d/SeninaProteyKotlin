object Users : Table() {
    val id = integer("id").autoIncrement().primaryKey()
    val username = varchar("username", 50)
    val email = varchar("email", 255)
}