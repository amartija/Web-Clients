
package com.ipartek.peliculas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pelicula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pelicula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="genero" type="{http://com.ipartek.formacion/types}genero" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fEstreno" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pelicula", propOrder = {
    "codigo",
    "genero",
    "titulo",
    "fEstreno"
})
public class Pelicula {

    protected int codigo;
    protected Genero genero;
    protected String titulo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fEstreno;

    /**
     * Gets the value of the codigo property.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the genero property.
     * 
     * @return
     *     possible object is
     *     {@link Genero }
     *     
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Sets the value of the genero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Genero }
     *     
     */
    public void setGenero(Genero value) {
        this.genero = value;
    }

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the fEstreno property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFEstreno() {
        return fEstreno;
    }

    /**
     * Sets the value of the fEstreno property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFEstreno(XMLGregorianCalendar value) {
        this.fEstreno = value;
    }

}
