package vn.phatndt.jetentertainment

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
