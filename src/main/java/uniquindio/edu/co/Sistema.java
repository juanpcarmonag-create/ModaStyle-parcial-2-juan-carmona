package uniquindio.edu.co;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private List<Prendas> prendas;
    static void main() {

        Scanner sc = new Scanner(System.in);
        Empresa empresa=new Empresa("ModaStyle",1089,"crr 13");
        int option=0;
        do {
            System.out.println("┌----------------====ModaStyle====----------------┐");
            System.out.println("│          1.Agregar prendas al catalogo          │");
            System.out.println("│          2.Ingresar sucursal al sistema         │");
            System.out.println("│      3.Modificar inventario de una sucursal     │");
            System.out.println("│         4.Agregar vendedor a una sucursal       │");
            System.out.println("│               5.Generar nueva compra            │");
            System.out.println("│  6.consultar compras realizadas por un cliente  │");
            System.out.println("│  7.Consultar ventas realizadas por un vendedor  │");
            System.out.println("│8.Cononsultar historial de ventas de una sucursal│");
            System.out.println("│    9.Consultar ventas totales de la empresa     │");
            System.out.println("│               0.Finalizar Programa              │");
            System.out.println("└-------------------------------------------------┘");
            option=sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println("---Ingrese datos de la prenda---");
                    System.out.println("Codigo: ");
                    int codigoPrenda=sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nombre: ");
                    String nombrePrenda= sc.nextLine();

                    System.out.println("Marca: ");
                    String marca= sc.nextLine();

                    System.out.println("Precio: ");
                    double precio=sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Categoria(CAMISETA" + " PANTALON" + " VESTIDO" + " CHAQUETA" + " CALZADO):");
                    CategoriaPrendas categoriaPrendas= CategoriaPrendas.valueOf(sc.nextLine());

                    Prendas prenda=new Prendas(codigoPrenda,nombrePrenda,marca,precio,categoriaPrendas);
                    System.out.println(prenda);

                    break;
                case 2:
                    System.out.println("---Ingrese datos de la sucursal---");
                    System.out.println("Codigo: ");
                    int codigoSucursal=sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nombre: ");
                    String nombreSucursal= sc.nextLine();

                    System.out.println("Direccion: ");
                    String direccionSucursal= sc.nextLine();

                    System.out.println("Ciudad: ");
                    String ciudad= sc.nextLine();

                    Sucursal sucursal=new Sucursal(codigoSucursal,nombreSucursal,direccionSucursal,ciudad);

                    System.out.println("---Asignacion de inventario---");
                    System.out.println("registro de inventario: ");
                    int registroInventario=sc.nextInt();

                    System.out.println("Codigo de la Prenda: ");
                    int codigoPrenda1=sc.nextInt();
                    sc.nextLine();
                    if(sucursal.verificarListaPrendas(codigoPrenda1)==false){
                        System.out.println("Ingrese producto del catalogo");
                        break;
                    }
                    System.out.println("talla");

                    System.out.println("color: ");
                    String color=sc.nextLine();

                    int cantidad= sc.nextInt();
                    sc.nextLine();

                    Inventario inventarioSucursal= new Inventario(sucursal, registroInventario,sucursal.agregarPrendaInventario(codigoPrenda1), ,color,cantidad);

                    break;
                case 3:


                    break;
                case 4:
                    System.out.println("------Asignar vendedor------");

                    System.out.println("Documento: ");
                    int documentoVendedor=sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nombre: ");
                    String nombreVendedor=sc.nextLine();

                    System.out.println("Correo: ");
                    String correoVendedor=sc.nextLine();

                    System.out.println("Telefono: ");
                    int telefonoVendedor=sc.nextInt();

                    System.out.println("codigo del empleado: ");
                    int codigoVendedor=sc.nextInt();
                    sc.nextLine();

                    System.out.println("fecha de contratacion: ");
                    DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String textoFecha1 = sc.nextLine();
                    LocalDate fecha1 = LocalDate.parse(textoFecha1, formato1);

                    System.out.println("Salario: ");
                    double salario=sc.nextDouble();

                    System.out.println("codigo de la sucursal: ");
                    int codigoSucursal1=sc.nextInt();
                    sc.nextLine();


                    if(empresa.verificarListaSucursales(codigoSucursal1)==false){
                        System.out.println("Ingrese producto del catalogo");
                        break;
                    }
                    Vendedores vendedor=new Vendedores(documentoVendedor,nombreVendedor,correoVendedor,telefonoVendedor,codigoVendedor,fecha1,salario,empresa.agregarSucursal(codigoSucursal1));

                    break;
                case 5:
                    System.out.println("-----nueva compra----");
                    System.out.println("Codigo de compra: ");
                    int codigoCompra=sc.nextInt();
                    sc.nextLine();

                    System.out.println("fecha de la compra: ");
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String textoFecha = sc.nextLine();
                    LocalDate fecha = LocalDate.parse(textoFecha, formato);

                    System.out.println("codigo del vendedor: ");
                    int codigoVendedor1=sc.nextInt();
                    sc.nextLine();

                    if(empresa.verificarListaVendedores(codigoVendedor1)==false){
                        System.out.println("ingrese vendedor valido");
                        break;
                    }
                    empresa.agregarVendedor(codigoVendedor1);
                    Ventas venta=new Ventas(codigoCompra,fecha,empresa.agregarVendedor(codigoVendedor1),);
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;

            }
        } while (option !=0);
    }
}
