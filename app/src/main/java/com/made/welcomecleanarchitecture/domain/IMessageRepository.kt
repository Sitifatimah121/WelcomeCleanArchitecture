package com.made.welcomecleanarchitecture.domain
// bussiness process to be called from usecase
interface IMessageRepository {
    fun getWelcomeMessage(name:String): MessageEntity
}