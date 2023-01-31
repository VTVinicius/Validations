package br.com.vtvinicius.validations.domain

interface ValidateNameUseCase {

    fun invoke(name: String): Boolean

}