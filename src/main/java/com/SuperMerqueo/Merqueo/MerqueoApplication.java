package com.SuperMerqueo.Merqueo;

import com.SuperMerqueo.Merqueo.modelos.Cliente;
import com.SuperMerqueo.Merqueo.modelos.Productos;
import com.SuperMerqueo.Merqueo.repositorios.ClienteRepositorio;
import com.SuperMerqueo.Merqueo.repositorios.ProductosRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class MerqueoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerqueoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, ProductosRepositorio productosRepositorio){

		return(args)-> {

			Cliente cliente1 = new Cliente("Enzo", "Estecho", "EnzoEstecho7@gmail.com", "Estecho");

			Cliente cliente2 = new Cliente("Guillermo", "Bonnuto", "Bonutto7@gmail.com", "Bonutto");

			clienteRepositorio.save(cliente1);
			clienteRepositorio.save(cliente2);


			Productos producto1= new Productos("Pancakes Avena Haz De Oros", "", 5.432, 20, "/web/assets/PancakesAvena", 300, "Despensa", "Mezclas Listas");

			Productos producto2= new Productos("Banano x Bolsa (5-7 Und Aprox) 1 Kg", "", 2.640, 15, "/web/assets/BananoBolsa.jpg",1, "Frutas y Verduras", "Frutas");

			Productos producto3= new Productos("Chuleta de Cerdo Corte Local", "", 11.391, 10, "/web/assets/ChuletaCerdo.jpg", 600, "Pollo , Carne y Pescado","Cerdo");

			Productos producto4= new Productos("Filete de Tilapia Norwen Sea", "", 13.401, 11, "/web/assets/FileteTilapia.jpg",400, "Pollo , Carne y Pescado","Pescado");

			Productos producto5= new Productos("Lavaplatos Líquido FAB LozaMax Limón 700 Ml", "", 9.368, 18, "/web/assets/LavaPlatosLiquido.jpeg",700, "Aseo del Hogar", "Lavaloza y Quitagrasa");

			Productos producto6= new Productos("Lomo de cerdo Corte Local", "", 10.441, 15, "/web/assets/LemoCerdo.jpg",500, "Nuestras Marcas", "Proteinas");

			Productos producto7= new Productos("Limpia Pisos Triple E Lavanda", "", 8.490, 13, "/web/assets/LimpiaPisos.jpeg",3.78, "Aseo del Hogar", "Limpia Pisos");

			Productos producto8= new Productos("Muslos de pollo Corte Local", "", 11.690, 22, "/web/assets/MuslosDePollo.webp", 1000,"Pollo , Carne y Pescado","Pollos");

			Productos producto9= new Productos("Arveja Desgranada x Paquete", "" , 14.880, 32, "/web/assets/ArvejaDesgranada.jpg.jpg", 280,"Frutas y Verduras","Desgranados");

			Productos producto10= new Productos("Papa Pastusa x Bolsa 3 Kg", "" , 7.040, 32, "/web/assets/PapaPastusa.jpg", 3,"Frutas y verduras","Papa");

			Productos producto11= new Productos("Pasta Spaguetti Monticello", "", 6.152, 32, "/web/assets/Spaguetti.jpg", 500,"Irresistibles", "Super Ofertas");


			productosRepositorio.save(producto1);
			productosRepositorio.save(producto2);
			productosRepositorio.save(producto3);
			productosRepositorio.save(producto4);
			productosRepositorio.save(producto5);
			productosRepositorio.save(producto6);
			productosRepositorio.save(producto7);
			productosRepositorio.save(producto8);
			productosRepositorio.save(producto9);
			productosRepositorio.save(producto10);
			productosRepositorio.save(producto11);


		};
	}


}
