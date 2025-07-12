package com.cherrybracket

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform