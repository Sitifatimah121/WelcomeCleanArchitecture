package com.made.welcomecleanarchitecture.domain
// class for usecase
class MessageInteractor(private val messaRepository: IMessageRepository) : MessageUseCase{
    override fun getMessage(name: String): MessageEntity {
        return messaRepository.getWelcomeMessage(name)
    }
}