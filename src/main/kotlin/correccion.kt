import kotlin.random.Random

/**
 * falta de documentación
 * Explica lo qu entiendas
 *
 */

enum class Color{
    Blanco , rojo ,azul
}
//falta ver enum



fun crearListaTazas(num:Int = 20): List<cafetera.Taza>{
    return mutableListOf<cafetera.Taza>().apply {
        for ( i in 1..num){
            val capacidadAleatoria = when(Random.nextInt(3)){
                0 -> 50
                1 -> 100
                else -> 100
            }
            val taza = cafetera.Taza(Color.entries.toTypedArray().random())
            add(taza)
        }


    }
}