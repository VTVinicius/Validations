package br.com.vtvinicius.validations.domain

import br.com.vtvinicius.validations.isNotCompoundName
import br.com.vtvinicius.validations.isNotValidName

class ValidateNameUseCase {

    operator fun invoke(name: String): Boolean {
        return if (name.isNotValidName()) {
            false
        } else !name.isNotCompoundName()

    }
}