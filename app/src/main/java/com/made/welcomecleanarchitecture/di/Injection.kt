package com.made.welcomecleanarchitecture.di

import com.made.welcomecleanarchitecture.data.IMessageDataSource
import com.made.welcomecleanarchitecture.data.MessageDataSource
import com.made.welcomecleanarchitecture.data.MessageRepository
import com.made.welcomecleanarchitecture.domain.IMessageRepository
import com.made.welcomecleanarchitecture.domain.MessageInteractor
import com.made.welcomecleanarchitecture.domain.MessageUseCase

//inject MessageUseCase to ViewModelFactory
object Injection {

    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}