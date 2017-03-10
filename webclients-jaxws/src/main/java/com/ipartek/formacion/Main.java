package com.ipartek.formacion;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.peliculas.Pelicula;
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
		requestHeaders.put("sessionid", Collections.singletonList("ipsession"));

		// introduzco los datos en el encabezado de la peticion
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);

		PeliculaMensaje respuesta = clientesoap.obtenerporid(3);
		Pelicula pelicula = respuesta.getPelicula();
		System.out.println(pelicula.getTitulo());

	}

}
