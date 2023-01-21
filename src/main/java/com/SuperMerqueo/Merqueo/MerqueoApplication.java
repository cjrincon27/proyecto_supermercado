package com.SuperMerqueo.Merqueo;

import com.SuperMerqueo.Merqueo.modelos.Cliente;
import com.SuperMerqueo.Merqueo.modelos.Producto;
import com.SuperMerqueo.Merqueo.repositorios.ClienteRepositorio;
import com.SuperMerqueo.Merqueo.repositorios.ProductoRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MerqueoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerqueoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, ProductoRepositorio productoRepositorio){

		return(args)-> {

			Cliente cliente1 = new Cliente("Enzo", "Estecho", "EnzoEstecho7@gmail.com", "Estecho");

			Cliente cliente2 = new Cliente("Guillermo", "Bonnuto", "Bonutto7@gmail.com", "Bonutto");

			clienteRepositorio.save(cliente1);
			clienteRepositorio.save(cliente2);


			Producto producto1= new Producto("Pancakes Avena Haz De Oros", "", 5.432, 20, "/web/assets/PancakesAvena", 300, "Despensa", "Mezclas Listas");

			Producto producto2= new Producto("Banano x Bolsa (5-7 Und Aprox) 1 Kg", "", 2.640, 15, "/web/assets/BananoBolsa.jpg",1, "Frutas y Verduras", "Frutas");

			Producto producto3= new Producto("Chuleta de Cerdo Corte Local", "", 11.391, 10, "/web/assets/ChuletaCerdo.jpg", 600, "Pollo , Carne y Pescado","Cerdo");

			Producto producto4= new Producto("Filete de Tilapia Norwen Sea", "", 13.401, 11, "/web/assets/FileteTilapia.jpg",400, "Pollo , Carne y Pescado","Pescado");

			Producto producto5= new Producto("Lavaplatos Líquido FAB LozaMax Limón 700 Ml", "", 9.368, 18, "/web/assets/LavaPlatosLiquido.jpeg",700, "Aseo del Hogar", "Lavaloza y Quitagrasa");

			Producto producto6= new Producto("Lomo de cerdo Corte Local", "", 10.441, 15, "/web/assets/LemoCerdo.jpg",500, "Nuestras Marcas", "Proteinas");

			Producto producto7= new Producto("Limpia Pisos Triple E Lavanda", "", 8.490, 13, "/web/assets/LimpiaPisos.jpeg",3.78, "Aseo del Hogar", "Limpia Pisos");

			Producto producto8= new Producto("Muslos de pollo Corte Local", "", 11.690, 22, "/web/assets/MuslosDePollo.webp", 1000,"Pollo , Carne y Pescado","Pollos");

			Producto producto9= new Producto("Arveja Desgranada x Paquete", "" , 14.880, 32, "/web/assets/ArvejaDesgranada.jpg.jpg", 280,"Frutas y Verduras","Desgranados");

			Producto producto10= new Producto("Papa Pastusa x Bolsa 3 Kg", "" , 7.040, 32, "/web/assets/PapaPastusa.jpg", 3,"Frutas y verduras","Papa");

			Producto producto11= new Producto("Pasta Spaguetti Monticello", "", 6.152, 32, "/web/assets/Spaguetti.jpg", 500,"Irresistibles", "Super Ofertas");


			productoRepositorio.save(producto1);
			productoRepositorio.save(producto2);
			productoRepositorio.save(producto3);
			productoRepositorio.save(producto4);
			productoRepositorio.save(producto5);
			productoRepositorio.save(producto6);
			productoRepositorio.save(producto7);
			productoRepositorio.save(producto8);
			productoRepositorio.save(producto9);
			productoRepositorio.save(producto10);
			productoRepositorio.save(producto11);


		};
	}


}
