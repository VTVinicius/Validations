package br.com.vtvinicius.validations


//expect a function to validate if it is a valid name

expect fun String.isNotValidName2(): Boolean

expect fun String.isValidName2(): Boolean

expect fun String.isNotCompoundName2(): Boolean


fun String.isNotValidName(): Boolean = !isValidName()

fun String.isValidName(): Boolean = RegexEnum.NAME.match(this)

fun String.isNotCompoundName(): Boolean = this.split(" ").filter { fullNameParts ->
    fullNameParts != "" && fullNameParts.length >= 1
}.joinToString().split(" ").size < 2


