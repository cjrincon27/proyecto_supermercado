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

			Producto producto11= new Producto("Pasta Spaguetti Monticello", "", 6152, 32, "./assets/img/Spaguetti.jpg", 500,"Irresistibles", "Super Ofertas");
			Producto producto6= new Producto("Lomo de cerdo Corte Local", "", 10441, 15, "./assets/img/LemoCerdo.jpg",500, "Nuestras Marcas", "Proteinas");
			Producto producto2= new Producto("Banano x Bolsa (5-7 Und Aprox) 1 Kg", "", 2640, 15, "./assets/img/BananoBolsa.jpg",1000, "Frutas y Verduras", "Frutas");

			Producto producto1= new Producto("Pancakes Avena Haz De Oros", "", 5432, 20, "./assets/img/PancakesAvena.jpg", 300, "Despensa", "Mezclas Listas");



			Producto producto3= new Producto("Chuleta de Cerdo Corte Local", "", 11391, 10, "./assets/img/ChuletaCerdo.png", 600, "Pollo , Carne y Pescado","Cerdo");

			Producto producto4= new Producto("Filete de Tilapia Norwen Sea", "", 13401, 11, "./assets/img/FileteTilapia.jpg",400, "Pollo , Carne y Pescado","Pescado");

			Producto producto5= new Producto("Lavaplatos Líquido FAB LozaMax Limón 700 Ml", "", 9368, 18, "./assets/img/LavaPlatosLiquido.jpg",700, "Aseo del Hogar", "Lavaloza y Quitagrasa");



			Producto producto7= new Producto("Limpia Pisos Triple E Lavanda", "", 8490, 13, "./assets/img/LimpiaPisos.jpg",3.78, "Aseo del Hogar", "Limpia Pisos");

			Producto producto8= new Producto("Muslos de pollo Corte Local", "", 11690, 22, "./assets/img/MuslosDePollo.jpg", 1000,"Pollo , Carne y Pescado","Pollos");

			Producto producto9= new Producto("Arveja Desgranada x Paquete", "" , 14880, 32, "./assets/img/ArvejaDesgranada.jpg", 280,"Frutas y Verduras","Desgranados");

			Producto producto10= new Producto("Papa Pastusa x Bolsa 3 Kg", "" , 7040, 32, "./assets/img/PapaPastusa.png", 3,"Frutas y verduras","Papa");
			Producto producto12= new Producto("Chocolate de Mesa La Especial", "" , 7290, 32, "https://static.merqueo.com/images/products/large/e21b20df-c2e1-4281-9a16-b7e4a8e58a0e.jpeg", 500,"Irresistibles", "Super Ofertas");
			Producto producto13= new Producto("Panela En Pastilla Panela Colombia", "" , 6490, 32, "https://static.merqueo.com/images/products/large/a9464b35-6784-4e06-b6b3-55d4a6ca70a7.jpg", 950,"Irresistibles", "Super Ofertas");
			Producto producto14= new Producto("Tomate Chonto x Bolsa (4 - 5 Und Aprox)", "" , 5300, 32, "https://static.merqueo.com/images/products/large/16854c95-eb59-42e0-81d7-46e984284df7.png", 600,"Irresistibles", "Super Ofertas");
			Producto producto15= new Producto("Recorte con Pechuga Bucanero", "", 9172, 10, "https://static.merqueo.com/images/products/large/438aed73-6597-4825-a0c5-86dfbe88acc6.png", 660, "Pollo , Carne y Pescado","Cerdo");
			Producto producto16= new Producto("Menudencia Fina De Pollo Friko Bandeja", "", 3222, 10, "https://static.merqueo.com/images/products/large/9427642d-0bb5-4f18-9f07-c99880fb66ec.jpg", 500 , "Pollo , Carne y Pescado","Cerdo");

			Producto producto17= new Producto("Harina De Maíz Blanco Pan", "", 4412, 20, "https://d50xhnwqnrbqk.cloudfront.net/images/products/large/HP0064%20Dummie%20PAN%20Blanca%20COL%201Kg%20GOGLIO_LatDer_BAJA.png", 1000, "Despensa", "harinas");
			Producto producto19= new Producto("Gelatina Gel'hada Surtida x4 und", "", 5031, 20, "https://static.merqueo.com/images/products/large/a369b9d3-6c74-42e3-ab22-b1d3bc153eeb.png", 140, "Despensa", "Mezclas Listas");

			Producto producto20= new Producto("Cereal CHOCAPIC® Bolsa", "", 12531, 20, "https://static.merqueo.com/images/products/large/805c0327-ba4b-43e2-906c-ddc7f1563115.jpg", 380, "Despensa", "cereales");
			Producto producto18= new Producto("Harina De Maíz Blanco Doñarepa Extrafina", "", 4580, 20, "https://static.merqueo.com/images/products/large/2d654170-562f-4355-9486-b4138cf8d6cb.jpg", 1000, "Despensa", "harinas");
			productoRepositorio.save(producto11);
			productoRepositorio.save(producto1);
			productoRepositorio.save(producto3);
			productoRepositorio.save(producto2);

			productoRepositorio.save(producto4);
			productoRepositorio.save(producto5);
			productoRepositorio.save(producto6);
			productoRepositorio.save(producto7);
			productoRepositorio.save(producto8);
			productoRepositorio.save(producto9);
			productoRepositorio.save(producto10);
			productoRepositorio.save(producto12);
			productoRepositorio.save(producto13);
			productoRepositorio.save(producto14);
			productoRepositorio.save(producto15);
			productoRepositorio.save(producto16);
			productoRepositorio.save(producto17);
			productoRepositorio.save(producto18);
			productoRepositorio.save(producto19);
			productoRepositorio.save(producto20);




		};
	}


}
