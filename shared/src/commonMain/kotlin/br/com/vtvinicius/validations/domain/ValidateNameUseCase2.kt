package br.com.vtvinicius.validations.domain

import br.com.vtvinicius.validations.isNotCompoundName2
import br.com.vtvinicius.validations.isNotValidName2

class ValidateNameUseCase2 {

    operator fun invoke(name: String): Boolean {
        return if (name.isNotValidName2()) {
            false
        } else !name.isNotCompoundName2()

    }
}