
fun main(){
    // leer datos readLine()
    println("Ingresa tu nombre")
    val nombre= readLine()
    println("Ingresa tu edad")
    var edad = readLine()
    // concatenacion de forma tradicional
    val mensaje ="Tu nombre es: "+nombre+" y tu edad es: "+edad
    println(mensaje)

    //La forma especial de Kotlin

    println("Tu nombre es: $nombre  y tu edad es: $edad")

}