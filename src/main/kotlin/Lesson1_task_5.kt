fun main() {
    val secondsInSpace = 6480
    val minutes = secondsInSpace / 60
    val seconds = secondsInSpace % 60
    val formattedTime = "%02d:%02d".format(minutes, seconds)
    println(formattedTime)
}