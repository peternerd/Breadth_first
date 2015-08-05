
import java.util.LinkedList;
/**
*Clase que modela un vertice del grafo
*@author Axel Canales Pedro Castro
*/
public class Vertice{

	private String nombre;
	private int peso;
	private Vertice predecesor;
	private LinkedList<Vertice> conexiones=new LinkedList<Vertice>();

	public Vertice(String nombre){
		setNombre(nombre);
	}

	public void setPeso(int peso){
		this.peso=peso;
	}

	public int getPeso(){
		return this.peso;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	public Vertice getPredecesor(){
		return this.predecesor;
	}

	public void setPredecesor(Vertice vertice){
		this.predecesor = vertice;
	}


	public LinkedList<Vertice> getSinPeso(){
		LinkedList<Vertice> sinPeso= new LinkedList<Vertice>();
		for(Vertice v : getConexiones()){
			if(v.getPeso()==0){
				sinPeso.add(v);
			}
		}
		return sinPeso;
	}

	public LinkedList<Vertice> getConexiones(){
		return this.conexiones;
	}

	public void setConexiones(Vertice ciudad){
		System.out.println("Ciudad: "+ciudad.getNombre()+" Peso "+ciudad.getPeso());

		conexiones.add(ciudad);
	}


}