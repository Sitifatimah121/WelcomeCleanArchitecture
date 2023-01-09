package com.made.welcomecleanarchitecture.data

import com.made.welcomecleanarchitecture.domain.MessageEntity

//implementation datasource (source message will get)
class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name, Welcome to Clean Architecture")
}