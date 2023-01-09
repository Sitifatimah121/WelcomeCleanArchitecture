package com.made.welcomecleanarchitecture.domain
//bases on UseCase
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}