public class Libro {

    //Atributos

    private String titulo;
    private String autor;
    private int cantidad;
    private String estado;

    //Constructor vacio

    public Libro() {
    }

    // constructor parametros

    public Libro(String titulo, String autor, int cantidad, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    // getter and setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // to string


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidad=" + cantidad +
                ", estado='" + estado + '\'' +
                '}';
    }

    // metodos propios

    public void mostrarinfo() {

        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Estado: " + this.getEstado());
        System.out.println("Cantidad disponible: " + this.getCantidad());
        System.out.println("");

    }

    public void agregarCopia(int cantidadCopias) {
        this.cantidad += cantidadCopias;
        System.out.println("Se agregó " + cantidadCopias + " copia(s) con éxito");
    }

    public void disponibilidad() {

        if(this.cantidad > 0) {
            this.estado = "Disponible";
            System.out.println("Estado: " + this.getEstado());
            System.out.println("hay " + this.getCantidad() + " unidades");
        } else {
            this.estado = "No disponible";
            System.out.println(this.getEstado());
        }


    }

    public boolean prestar(int cantidadLibros) {
        System.out.println("Cantidad de libros solicitados: " + cantidadLibros);
        if (this.cantidad >= cantidadLibros) {
            this.cantidad -= cantidadLibros;
            System.out.println("Prestamo exitoso");
            return true;
        } else{
            System.out.println("Error, libros insuficientes");
            return false;
        }
    }



}
