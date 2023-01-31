package br.com.vtvinicius.validations.domain

import br.com.vtvinicius.validations.isNotCompoundName
import br.com.vtvinicius.validations.isNotValidName

class ValidateNameUseCaseImpl : ValidateNameUseCase {

    override operator fun invoke(name: String): Boolean {
        return if (name.isNotValidName()) {
            false
        } else !name.isNotCompoundName()

    }
}