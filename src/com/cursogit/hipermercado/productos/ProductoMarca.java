package com.cursogit.hipermercado.productos;

public class ProductoMarca implements IProductoBase {

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public ProductoMarca(String marca) {
		super();
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "ProductoMarca [marca=" + marca + "]";
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTextProductoToPrint() {
		// TODO Auto-generated method stub
		return null;
	}

}
