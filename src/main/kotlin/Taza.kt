class Taza (var color: Color,var capacidadtaza:Int = 50 ) { /// crear enumerado + capacidad de int = 50


    var cantidataza = 0 // falta el set que compruebe que no sobrepasa la capacidadtaza

    //falta la funcion de llenar ()
    fun llenar(carga: Int) {//el if no es necesario es lo que iría dentro del set de cantidad
        if (carga <= capacidadtaza) {
            this.cantidataza = carga
        } else {
            cantidataza = capacidadtaza
        }
    }

    override fun toString(): String {
        return "Taza(color = $color, capacidad = $capacidadtaza c.c., cantidad = $cantidataza c.c.)"
    }
}