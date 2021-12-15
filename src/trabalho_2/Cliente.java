package trabalho_2;

public class Cliente {

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int aCounter) {
        counter = aCounter;
    }
    private int id;
    private String name;
    static private int counter=1;
    
    //Construtor default
    Cliente(){}
    
    //Construtor Com parametros
    Cliente(String name){
    this.id= counter++;
    this.name=name;
    
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
        
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
}
