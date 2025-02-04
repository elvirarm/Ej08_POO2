//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val libro1 = Libro("titulo1", "autora 1", 100, 10)
   val libro2 = Libro("titulo 2", "autora 2", 500, 7)

    val conjuntoLibros = ConjuntoLibros()

    conjuntoLibros.aniadirLibro(libro1)
    conjuntoLibros.aniadirLibro(libro2)

    conjuntoLibros.eliminarLibro()
    conjuntoLibros.eliminarLibro()

    conjuntoLibros.aniadirLibro(libro1)

    conjuntoLibros.mostrarConjunto()
}