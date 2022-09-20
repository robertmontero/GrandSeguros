package com.ejercicio.GrandSeguros;

import com.ejercicio.GrandSeguros.entidades.Empleado;
import com.ejercicio.GrandSeguros.entidades.Empresa;
import com.ejercicio.GrandSeguros.entidades.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class GrandSegurosApplication {

	public static void main(String[] args) {

		SpringApplication.run(GrandSegurosApplication.class, args);

		/*Empresa emp1 = new Empresa(0,"0","0","0","0");

		Empleado usu1 = new Empleado("1","usuario","usuario@usuario.com","emp", "operativo");

		MovimientoDinero Mov1 = new MovimientoDinero(1,100.0,"0","0","0");

		emp1.getNombreEmpresa();
		emp1.getNit();
		emp1.getDireccion();
		emp1.getTelefono();

		emp1.setIdEmpresa(1);
		emp1.setNombreEmpresa("GrandSeguros");
		emp1.setDireccion("av siempre viva");
		emp1.setTelefono("31122334455");
		emp1.setNit("123456789");

		usu1.getNombreEmpleado();
		usu1.getCorreoEmpleado();
		usu1.getNombreEmpresa();
		usu1.getRolEmpleado();

		usu1.setNombreEmpleado("Homero Sanchez");
		usu1.setCorreoEmpleado("homero@grandseguro.com");
		usu1.setNombreEmpresa("Seguros carros");
		usu1.setRolEmpleado("administrador");

		Mov1.getTransaccionId();
		Mov1.getTipoMov();
		Mov1.getMonto();
		Mov1.getConcepto();
		Mov1.getNombreEmpleado();

		Mov1.setTransaccionId(1);
		Mov1.setTipoMov("Ingreso");
		Mov1.setConcepto("Factura venta");
		Mov1.setMonto(25000.00);
		Mov1.setNombreEmpleado("Homero Sanchez");


		System.out.println("Nombre Empresa: " + emp1.getNombreEmpresa());
		System.out.println("Nit: " + emp1.getNit());
		System.out.println("Dirección: " + emp1.getDireccion());
		System.out.println("Teléfono: " + emp1.getTelefono() + "\n");

		System.out.println("Nombre Empleado: " + usu1.getNombreEmpleado());
		System.out.println("Identificación: " + usu1.getNumIdentificacion());
		System.out.println("Correo: " + usu1.getCorreoEmpleado());
		System.out.println("Rol: " + usu1.getRolEmpleado());
		System.out.println("Empresa: " + usu1.getNombreEmpresa()+ "\n");

		System.out.println("Número:" + Mov1.getTransaccionId());
		System.out.println("Concepto:" + Mov1.getConcepto());
		System.out.println("Tipo:" + Mov1.getTipoMov());
		System.out.println("Monto:" + Mov1.getMonto());
		System.out.println("Vendedor:" + Mov1.getNombreEmpleado());*/



	}

}
