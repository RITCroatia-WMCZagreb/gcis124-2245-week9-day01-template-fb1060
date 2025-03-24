/*
@ASSESSME.USERID: fb1060
@ASSESSME.AUTHOR: 
@ASSESSME.DESCRIPTION: 
@ASSESSME.ANALYZE: YES
*/
import java.util.HashSet;
import java.util.Set;

public class Vertex<E> {
    private E value;
    private Set<Vertex<E>> neighbors;

    public Vertex(E value){
        this.value=value;
        this.neighbors= new HashSet<>();

    }

    public E getValue(){
        return this.value;
    }
    public void connect(Vertex<E> neighbour){
         this.neighbors.add(neighbour);
    }

    public boolean connected(Vertex<E> neighbour){
        return this.neighbors.contains(neighbour);

    }
    
    public Set<Vertex<E>> getNeighbors(){
        return this.neighbors;}

       public static void main(String[] args) {
          Vertex<String> vA= new Vertex<String>("A");
          Vertex<String> vB= new Vertex<String>("B");
          Vertex<String> vC= new Vertex<String>("C");
          vA.connect(vB);
          vA.connect(vC);
          vB.connect(vC);
          vC.connect(vB);
          vC.connect(vA);

       } 
}