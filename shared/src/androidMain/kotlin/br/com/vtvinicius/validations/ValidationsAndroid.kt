package br.com.vtvinicius.validations

actual fun String.isNotValidName2(): Boolean = !isValidName2()

actual fun String.isValidName2(): Boolean = RegexEnum.NAME.match(this)

actual fun String.isNotCompoundName2(): Boolean = this.split(" ").filter { fullNameParts ->
    fullNameParts != "" && fullNameParts.length >= 1
}.joinToString().split(" ").size < 2


