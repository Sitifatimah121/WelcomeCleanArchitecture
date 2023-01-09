package com.made.welcomecleanarchitecture.data

import com.made.welcomecleanarchitecture.domain.MessageEntity

//template datasource for implementation
interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}