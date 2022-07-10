package chapter07.section2

sealed class Result {
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

class Inside: Result.Success("Status")