package ru.kapybarin.kodkod

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform