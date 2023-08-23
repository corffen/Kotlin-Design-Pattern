import java.util.logging.Level
import java.util.logging.Logger

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val looger = Logger.getLogger("main")
    looger.log(Level.INFO,"info")
    looger.log(Level.WARNING,"warning")
    looger.log(Level.FINE,"fine")
}