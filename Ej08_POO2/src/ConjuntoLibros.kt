class ConjuntoLibros() {

     companion object {
         const val MAX_LIBROS = 5
     }

    var conjuntoLibros = setOf<Libro>()

    fun aniadirLibro(libro: Libro): Set<Libro> {

        if (conjuntoLibros.size < MAX_LIBROS) {
            conjuntoLibros += libro
        }
        return conjuntoLibros
    }

    fun eliminarLibro(): Set<Libro> {

        println("¿Quieres eliminar el libro por autor o por título?")
        val opcion = readln().trim().lowercase()


        val criterio = if (opcion == "autor"){
            println("Escribe el nombre del autor del libro que quieres eliminar")
            readln()
        } else{
            println("Escribe el título del libro que quieres eliminar")
            readln()
        }

        val libroBorrar = conjuntoLibros.find{it.autor == criterio || it.titulo == criterio}

        return if (libroBorrar != null){
            conjuntoLibros -= libroBorrar
            println("Libro ${libroBorrar.autor} eliminado.")
            conjuntoLibros
        } else{
            println("No se han encontrado libros con ese criterio.")
            conjuntoLibros
        }

    }

    fun mostrarLibroMayorYMenorCalificacion(libros: Set<Libro>) {
        val libroMayor = libros.maxBy { it.calificacion }
        println("Libro con mnayor calificación:  $libroMayor")

        val libroMenor = libros.minBy { it.calificacion }
        println("Libro con menor calificación:  $libroMenor")
    }




    fun mostrarConjunto(){

        for (libro in conjuntoLibros){
            println(libro)
        }

    }

}