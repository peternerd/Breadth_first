import java.util.LinkedList;
/**
*Clase Grafo representa un grafo el cual contiene un array de vertices
*@author Pedro Castro Axel Canales
*@version 0.0.1
*/
public class Grafo{

	private static Vertice[] vertices;

	/**
	*Estable los nodos del grafo
	*@param nodos es el nombre de los nodos del grafo
	*/
	public static void setNodos(String[] nodos){
		//size almacena el numero de nodos
		int size = nodos.length;
		vertices = new Vertice[size];
		//ciclo para instanciar objetos de tipo Vertice en cada posicion del array
		for(int i = 0; i<vertices.length; i++){
			vertices[i] =  new Vertice(nodos[i]);
		}
	}

	/**
	*Obtiene el vertice con el nombre indicado
	*@param nombre indica el nombre del vertice a obtener
	*@return Un objeto Vertice
	*/
	public static Vertice getVertice(String nombre){
		//ciclo para recorrer vector de vertices, hasta encontrar el vertice indicado
		for(int i = 0; i<vertices.length; i++){
			//si el objeto vertice en posicion i tiene el nombre indicado devolver tal objeto
			if( vertices[i].getNombre().equals(nombre) ){
				return vertices[i];
			}
		}
		return null;
	}

	/**
	*Establece los vertices con los que se conecta el vertice especificado
	*@param vertice es el objeto Vertice al cual se le estableceran las conexiones
	*@param conexiones son los nombres de los vertices a los cuales se conectara el vertice
	*/
	public static void setConexiones(Vertice vertice, String conexiones){
		String ciudades[] = conexiones.split(",");
		for(String ciudad:ciudades){
			System.out.println(ciudad);
			vertice.setConexiones(getVertice(ciudad));
		}
	}



}