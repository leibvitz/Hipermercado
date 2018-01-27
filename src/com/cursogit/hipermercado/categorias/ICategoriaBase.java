package com.cursogit.hipermercado.categorias;

import java.util.List;

import com.cursogit.hipermercado.productos.IProductoBase;

public interface ICategoriaBase {
	
	public List<IProductoBase> getProductos();

}
