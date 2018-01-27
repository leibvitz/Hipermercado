package com.cursogit.hipermercado.main;

import java.util.Arrays;
import java.util.List;

import com.cursogit.hipermercado.categorias.CategoriaBaseImpl;
import com.cursogit.hipermercado.categorias.ICategoriaBase;
import com.cursogit.hipermercado.productos.ProductoBaseImpl;

public class HiperMercadoMain {
	
	private List<ICategoriaBase> categorias;

	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(" ========================================================================= \n");
		strBuffer.append(" ===== HIPERMERCADO ====================================================== \n");
		strBuffer.append(" ------------------------------------------------------------------------- \n");
		if (categorias==null || categorias.size()==0) {
			strBuffer.append("   =====  SIN CATEGORIAS  ==  \n");
		} else {
			strBuffer.append("   ===== CATEGORIAS:  \n");
			for (ICategoriaBase iCategoriaBase : categorias) {
				strBuffer.append(iCategoriaBase.toString());
			}
		}
		strBuffer.append(" =========================================================================  \n ");
		return strBuffer.toString();
	}

	
	public List<ICategoriaBase> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<ICategoriaBase> categorias) {
		this.categorias = categorias;
	}
	
	public static void main(String[] args) {
		HiperMercadoMain hipermercado = new HiperMercadoMain();
		CategoriaBaseImpl categoriaBase = new CategoriaBaseImpl("BASE");
		ProductoBaseImpl productoBaseImpl = new ProductoBaseImpl("000011");
		productoBaseImpl.setNombre("Base");
		productoBaseImpl.setPrecio("0 €");
		categoriaBase.setProductos(Arrays.asList(productoBaseImpl));
		hipermercado.setCategorias(Arrays.asList(categoriaBase));
		System.out.println(hipermercado);

	}


}
