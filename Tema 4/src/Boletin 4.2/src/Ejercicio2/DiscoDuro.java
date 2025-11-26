package Ejercicio2;

import Ejercicio2.Exception.OrdenadorException;

public class DiscoDuro {

        private String marca;
        private String tipo;
        private int capacidad;

        public DiscoDuro() {
        }

        @Override
        public String toString() {
            return "DiscoDuro{" + "marca='" + marca + '\'' + ", tipo='" + tipo + '\'' + ", capacidad=" + capacidad + '}';
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }

        public int getCapacidad() {
            return capacidad;
        }
}