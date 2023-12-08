object ChatRepository {
    fun createChat(chat: Chat) {
        transaction {
            Chats.insertAndGetId {
                it[name] = chat.name
            }
        }
    }

    fun getAllChats(): List<Chat> {
        return transaction {
            Chats.selectAll().map {
                Chat(it[Chats.id], it[Chats.name])
            }
        }
    }
}
