package carreras;

public class Carro {
    private String modelo;
    private String marca;
    private float velocidad;
    private int numero_vueltas;
    private float[] vueltas;
     private float[] velocidades_vueltas;

    public Carro(String modelo, String marca, float velocidad) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidad = velocidad;
        this.numero_vueltas =0;
        this.vueltas = vueltas;
        this.velocidades_vueltas=velocidades_vueltas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero_vueltas() {
        return numero_vueltas;
    }

    public float getVelocidad() {
        if(numero_vueltas==0){
        return 0;
    }
        float total=0;
        for(int i=0; i<numero_vueltas;i++){
            total+=vueltas[i];
        }
        return total/numero_vueltas;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
        public float calcularVelocidadPromedioPorVuelta(int numeroVuelta) {
        if (numeroVuelta <= 0 || numeroVuelta > numero_vueltas) {
            System.out.println("Número de vuelta inválido.");
            return 0;
        }

        return velocidades_vueltas[numeroVuelta - 1];
    }
   
        public void agregar_vuelta(float tiempoVueltas, float velocidadVuelta) {
        if (numero_vueltas < vueltas.length && numero_vueltas < velocidades_vueltas.length) {
            vueltas[numero_vueltas] = tiempoVueltas;
            velocidades_vueltas[numero_vueltas] = velocidadVuelta;
            numero_vueltas++;
        } else {
            System.out.println("No se pueden agregar más vueltas, se ha alcanzado el límite del arreglo.");
        }
    }
    }
     

