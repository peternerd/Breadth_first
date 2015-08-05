import java.util.LinkedList;

public class Algoritmo{


	private static LinkedList<Vertice> conjunto = new LinkedList<Vertice>();
	private LinkedList<Vertice> nuevos;
	private Vertice inicial,destino;

	public void setInicial(Vertice v){
		this.inicial = inicial;
	}

	public void setDestino(Vertice v){
		this.destino = destino;
	}

	public Vertice getDestino(){
		return this.destino;
	}

	public Vertice getInicial(){
		return this.inicial;
	}

	public void execute(){
		int peso =0;
		int nuevosElementos=0;
		Vertice estadoInicial=getInicial();
		//Mientras no este en el conjunto de vertices mi Vertice destino entonces seguira buscando
		do{
			if(peso==0){
				getInicial().setPeso(1000);
				conjunto.add(getInicial());
			}
			else{
				LinkedList<Vertice> nuevos = getNuevos(estadoInicial);
				nuevosElementos = nuevos.size();
				for(int i = 0; i<nuevosElementos; i++){
					for(Vertice v: nuevos){
						conjunto.add(v);
						v.setPeso(peso);
						v.setPredecesor(estadoInicial);
					}
					estadoInicial = conjunto.get(conjunto.size-nuevosElementos);
					nuevos = getNuevos(estadoInicial);
					nuevosElementos = nuevos.size();
				}
			}

			peso++;

		}while(!isInConjunto(getDestino());
		
	}

	public boolean isInConjunto(Vertice destino){
		for(Vertice v:conjunto){
			if(v.equals(destino)){
				return true;
			}
		}
		return false;
	}

	public LinkedList<Vertice> getNuevos(Vertice vertice){
		return vertice.getSinPeso();
	}

}