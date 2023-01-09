package com.made.welcomecleanarchitecture.data

import com.made.welcomecleanarchitecture.domain.IMessageRepository

//set the datasource that will be given to the Use Case
class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}