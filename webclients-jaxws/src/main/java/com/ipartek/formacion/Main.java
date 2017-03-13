package com.ipartek.formacion;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.peliculas.Pelicula;
import com.ipartek.peliculas.PeliculaColeccion;
import com.ipartek.peliculas.PeliculaMensaje;
import com.ipartek.peliculas.PeliculaServiceWSImp;
import com.ipartek.peliculas.Peliculasservice;

public class Main {

	public static void main(String[] args) {

		Peliculasservice cliente = new Peliculasservice();
		PeliculaServiceWSImp clientesoap = cliente.getPeliculaServiceWSImpPort();

		// capturo contexto de la peticion
		Map<String, Object> requestContext = ((BindingProvider) clientesoap).getRequestContext();

		// me genero la estructura necesaria para enviar los datos
		Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();
		requestHeaders.put("sessionId", Collections.singletonList("ipsession"));

		// introduzco los datos en el encabezado de la peticion
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);

		PeliculaMensaje respuesta = clientesoap.obtenerporid(1);

		if (respuesta.getPelicula() == null) {

			System.out.println(respuesta.getMensaje());
		} else {

			Pelicula pelicula = respuesta.getPelicula();
			System.out.println(pelicula.getTitulo());

		}

		Peliculasservice cliente1 = new Peliculasservice();
		PeliculaServiceWSImp clientesoap1 = cliente1.getPeliculaServiceWSImpPort();

		// capturo contexto de la peticion
		Map<String, Object> requestContext1 = ((BindingProvider) clientesoap1).getRequestContext();

		Map<String, List<String>> requestHeaders1 = new HashMap<String, List<String>>();
		requestHeaders1.put("usuario", Collections.singletonList("usec<xczxcr"));
		requestHeaders1.put("password", Collections.singletonList("pass"));

		requestContext1.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders1);

		PeliculaColeccion coleccion = clientesoap1.obtenerListado();

		if (coleccion.getPeliculas() == null) {
			System.out.println("pasa por aqui");
			System.out.println(coleccion.getMensaje());

		} else {
			for (Pelicula c : coleccion.getPeliculas()) {

				System.out.println(c.getTitulo());

			}
		}

	}

}
