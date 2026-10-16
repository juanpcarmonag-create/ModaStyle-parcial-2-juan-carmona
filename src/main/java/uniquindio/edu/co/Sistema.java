package uniquindio.edu.co;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    static void main() {

        Scanner sc = new Scanner(System.in);
        Empresa empresa=new Empresa("ModaStyle",1089,"crr 13");
        int option=0;
        do {
            System.out.println("┌----------------====ModaStyle====----------------┐");
            System.out.println("│          1.Agregar prendas al catalogo          │");
            System.out.println("│          2.Ingresar sucursal al sistema         │");
            System.out.println("│        3.Agregar inventario a una sucursal      │");
            System.out.println("│         3.Agregar vendedor a una sucursal       │");
            System.out.println("│               4.Generar nueva compra            │");
            System.out.println("│  5.consultar compras realizadas por un cliente  │");
            System.out.println("│  6.Consultar ventas realizadas por un vendedor  │");
            System.out.println("│ 7.Consultar historial de ventas de una sucursal │");
            System.out.println("│    8.Consultar ventas totales de la empresa     │");
            System.out.println("│               0.Finalizar Programa              │");
            System.out.println("└-------------------------------------------------┘");
            option=sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("---Ingrese datos de la prenda---");
                    System.out.println("Codigo: ");
                    int codigoPrenda = sc.nextInt();
                    sc.nextLine();

                    if(!empresa.verificarListaPrendas(codigoPrenda)==false){
                        System.out.println("Esta prenda ya esta en el inventario");
                        break;
                    }

                    System.out.println("Nombre: ");
                    String nombrePrenda = sc.nextLine();

                    System.out.println("Marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Categoria(CAMISETA" + " PANTALON" + " VESTIDO" + " CHAQUETA" + " CALZADO):");
                    CategoriaPrendas categoriaPrendas = CategoriaPrendas.valueOf(sc.nextLine());

                    Prendas prenda = new Prendas(codigoPrenda, nombrePrenda, marca, precio, categoriaPrendas);

                    CategoriaPrendas catPrenda = prenda.getCategoriaPrendas();
                    double porcentajeRecargo = catPrenda.getPorcentaje();
                    prenda.setPrecioUnitario(prenda.getPrecioUnitario() + prenda.getPrecioUnitario() * (porcentajeRecargo / 100));
                    System.out.println(prenda + " --Incluye recargo--");

                    break;
                case 2:
                    System.out.println("---Ingrese datos de la sucursal---");
                    System.out.println("Codigo: ");
                    int codigoSucursal = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nombre: ");
                    String nombreSucursal = sc.nextLine();

                    System.out.println("Direccion: ");
                    String direccionSucursal = sc.nextLine();

                    System.out.println("Ciudad: ");
                    String ciudad = sc.nextLine();

                    Sucursal sucursal = new Sucursal(codigoSucursal, nombreSucursal, direccionSucursal, ciudad);
                    break;
                case 3:
                    System.out.println("---Asignacion de inventario---");

                    System.out.println("ingrese codigo de la sucursal: ");
                    int codigoSucursalInv=sc.nextInt();
                    sc.nextLine();

                    System.out.println("registro de inventario: ");
                    int registroInventario = sc.nextInt();

                    System.out.println("Codigo de la Prenda: ");
                    int codigoPrenda1 = sc.nextInt();
                    sc.nextLine();
                    if (empresa.verificarListaPrendas(codigoPrenda1) == true) {
                        System.out.println("Ingrese producto del catalogo");
                        break;
                    }
                    System.out.println("talla");

                    System.out.println("color: ");
                    String color = sc.nextLine();

                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("ingresar talla");
                    String talla=sc.nextLine();
                    Talla talla1= Talla.valueOf(talla.valueOf(sc.nextLine()));

                    Inventario inventarioSucursal= new Inventario(empresa.agregarSucursal(codigoSucursalInv), registroInventario,empresa.agregarPrendaInventario(codigoPrenda1),talla1,color,cantidad);

                    break;
                case 4:
                    System.out.println("------Asignar vendedor------");

                    System.out.println("Documento: ");
                    int documentoVendedor = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nombre: ");
                    String nombreVendedor = sc.nextLine();

                    System.out.println("Correo: ");
                    String correoVendedor = sc.nextLine();

                    System.out.println("Telefono: ");
                    int telefonoVendedor = sc.nextInt();

                    System.out.println("codigo del empleado: ");
                    int codigoVendedor = sc.nextInt();
                    sc.nextLine();

                    System.out.println("fecha de contratacion: ");
                    DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String textoFecha1 = sc.nextLine();
                    LocalDate fecha1 = LocalDate.parse(textoFecha1, formato1);

                    System.out.println("Salario: ");
                    double salario = sc.nextDouble();

                    System.out.println("codigo de la sucursal: ");
                    int codigoSucursal1 = sc.nextInt();
                    sc.nextLine();


                    if (empresa.verificarListaSucursales(codigoSucursal1) == false) {
                        System.out.println("Ingrese producto del catalogo");
                        break;
                    }
                    Vendedores vendedor = new Vendedores(documentoVendedor, nombreVendedor, correoVendedor, telefonoVendedor, codigoVendedor, fecha1, salario, empresa.agregarSucursal(codigoSucursal1));

                    break;
                case 5:
                    System.out.println("-----nueva compra----");
                    System.out.println("Codigo de compra: ");
                    int codigoCompra = sc.nextInt();
                    sc.nextLine();

                    System.out.println("fecha de la compra: ");
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String textoFecha = sc.nextLine();
                    LocalDate fecha = LocalDate.parse(textoFecha, formato);

                    System.out.println("codigo del vendedor: ");
                    int codigoVendedor1 = sc.nextInt();
                    sc.nextLine();

                    if (empresa.verificarListaVendedores(codigoVendedor1) == false) {
                        System.out.println("ingrese vendedor valido");
                        break;
                    }
                    int codigoSucursal2 = empresa.codigoSucursal(codigoVendedor1);

                    System.out.print("----ingrese el cliente----");
                    System.out.println("codigo de afiliacion del cliente: ");
                    int codigoCliente = sc.nextInt();
                    sc.nextLine();

                    if (empresa.verificarCliente(codigoCliente) == false) {
                        System.out.println("Este cliente no existe en el sistema, crear nuevo cliente ingresando el resto de sus datos");

                        System.out.println("documento del cliente: ");
                        int documento = sc.nextInt();

                        System.out.println("Nombre: ");
                        String nombreCliente = sc.nextLine();

                        System.out.println("Correo: ");
                        String correoCliente = sc.nextLine();

                        System.out.println("Telefono: ");
                        int telefonoCliente = sc.nextInt();

                        System.out.println("ingrese categoria del cliente");
                        CategoriaCliente categoriaCliente = CategoriaCliente.valueOf(sc.nextLine());

                        Cliente clienteCompra = new Cliente(documento, nombreCliente, correoCliente, telefonoCliente, codigoCliente, categoriaCliente);
                    }

                    List<Inventario> miLista = new ArrayList<>();
                    double valorTotal = 0;

                    int op;
                    do {
                        System.out.println("┌-----------==Pedido==-----------┐");
                        System.out.println("│ 1.Agregar producto a la compra │");
                        System.out.println("│      0.pedido completado       │");
                        System.out.println("└--------------------------------┘");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println();
                                System.out.println("Productos disponibles: \n" + empresa.mostrarInventario(codigoVendedor1));

                                System.out.println("Escriba el codigo del producto: ");
                                int codigoProd = sc.nextInt();

                                System.out.println("¿Cuantos desea?: ");
                                int cantidadProducto = sc.nextInt();

                                if (empresa.verificarCantidadProducto(codigoProd, cantidadProducto) == false) {
                                    System.out.println("No hay esa cantidad de prendas en el inventario o el codigo es incorrecto");
                                    break;
                                }

                                Inventario clienteCompra = empresa.agregarCantidadProducto(codigoProd, cantidadProducto);
                                miLista.add(clienteCompra);

                                System.out.println();
                                System.out.println("Producto agregado a la compra");
                                System.out.println();

                                for(Inventario producto1: miLista){
                                    Prendas prenda3=producto1.getPrenda();
                                    valorTotal+= prenda3.getPrecioUnitario()*cantidadProducto;
                                }

                                break;
                            case 0:
                                System.out.println("________Compra finalizada_________");
                                break;
                            default:
                                System.out.println("Opción no válida");

                        }
                    } while (op != 0);


                    CategoriaCliente catCliente = empresa.categoriaCliente(codigoCliente);
                    double descuento=catCliente.getPorcentaje();

                    valorTotal-=(valorTotal*(descuento/100));
                    Ventas venta=new Ventas(codigoCompra,fecha,empresa.agregarVendedor(codigoVendedor1),empresa.agregarSucursal(codigoSucursal2),empresa.agregarCliente(codigoCliente),valorTotal);
                    break;
                case 6:
                    System.out.println("---Compras realizadas por un cliente---");
                    System.out.println("ingrese codigo de afiliacion: ");
                    int codigoAfiliacion= sc.nextInt();
                    sc.nextLine();

                    if (empresa.verificarCliente(codigoAfiliacion)==false){
                        System.out.println("usuario inexistente");
                    }
                    String mensaje= empresa.calcularComprasCliente(codigoAfiliacion);
                    System.out.println(mensaje);

                    break;
                case 7:
                    System.out.println("---Ventas realizadas por un vendedor---");
                    System.out.println("ingrese codigo de afiliacion: ");
                    int codigoEmpleado= sc.nextInt();
                    sc.nextLine();

                    if (empresa.verificarListaVendedores(codigoEmpleado)==false){
                        System.out.println("usuario inexistente");
                    }
                    String mensaje1= empresa.calcularVentasVendedor(codigoEmpleado);
                    System.out.println(mensaje1);
                    break;
                case 8:
                    System.out.println("---Ventas realizadas por una sucursal---");
                    System.out.println("ingrese codigo de afiliacion: ");
                    int codigoSucursal3= sc.nextInt();
                    sc.nextLine();

                    if (empresa.verificarListaSucursales(codigoSucursal3)==false){
                        System.out.println("usuario inexistente");
                    }
                    String mensaje2= empresa.calcularVentasSucursal(codigoSucursal3);
                    System.out.println(mensaje2);
                    break;
                case 9:
                    String mensaje3= empresa.calcularVentasTotales("\"---Ventas realizadas por La empresa---\"");
                    System.out.println(mensaje3);
                    break;
                case 0:
                    System.out.println("Programa finalizado.....");
                    break;
                default:
                    System.out.println("Opción no válida....");
                    break;
            }
        } while (option !=0);
    }
}
