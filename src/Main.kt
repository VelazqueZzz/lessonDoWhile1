//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите количество секунд: ")
    val seconds = readln().toInt()
    var elapsed = 0

    //////1
    while (elapsed < seconds) {
        Thread.sleep(1000)
        elapsed++
    }
    println("Прошло $seconds секунд")
}