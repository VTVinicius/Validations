package br.com.vtvinicius.validations

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform