package Ejercici14_AccesoALaBaseDeDatos;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	public int insertNewRow(List<String> rowData);
	public Collection<String> getSearchResults(String queryString);
}
