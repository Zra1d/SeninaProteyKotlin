object Chats : Table() {
    val id = integer("id").autoIncrement().primaryKey()
    val name = varchar("name", 255)
}