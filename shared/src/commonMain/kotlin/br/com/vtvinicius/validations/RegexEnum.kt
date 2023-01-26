package br.com.vtvinicius.validations

enum class RegexEnum(val value: Regex) {



    EMAIL("""^[a-zA-Z0-9+._%\-+]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\-]{0,64}(\.[a-zA-Z0-9][a-zA-Z0-9\-]{0,25})+""".toRegex()),
    PHONE_NUMBER("""^\([1-9]{2}\) 9 [1-9][0-9]{3}-[0-9]{4}$""".toRegex()),
    NAME("""(^[[A-Z][a-z] (áàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ)]{3,}$)""".toRegex());

    fun match(string: String) = this.value.containsMatchIn(string)
}