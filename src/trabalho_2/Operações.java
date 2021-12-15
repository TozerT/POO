package trabalho_2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;



public class Operações implements java.io.Serializable{
    Operações(){}
    
    Scanner item = new Scanner(System.in);
    Produto prod = new Produto(); 
    LocalDate data= LocalDate.now();
    LocalDate hoje = LocalDate.now();
    
     /*
    *********************************************
    METODO DE INSERIR OS PRODUTOS NO FICHEIRO TXT
    *********************************************
    */
    public void Inserir()throws IOException{
        int inserir =0;
        int limit;
        ArrayList<Object> Produ = new ArrayList<Object>();
        
       System.out.println("Insira o numero de elementos a inserir: ");
       limit = item.nextInt();
       
    
    if(limit <= 0){
       System.out.println("numero invalido"); 
    }else{
       while(inserir != limit){
            
            System.out.println("Escreva um nome:");
            String nome = item.next();
            
            System.out.println("Escreva um preço:");
            double preco = item.nextDouble();
            //Inserir a data de validade
            System.out.println("Escreva o dia:");
            int dia = item.nextInt();
            
            System.out.println("Escreva o mes:");
            int mes = item.nextInt();
            
            System.out.println("Escreva o ano:");
            int ano = item.nextInt();


            data = data.of(ano, mes, dia);
            
            prod = new Produto(nome,preco,data,hoje);
            
            Produ.add(prod);

            inserir++;
        }
        }
        
         //WRITER
        try{
                FileOutputStream arq = new FileOutputStream("Base.txt");
                ObjectOutputStream obj = new ObjectOutputStream(arq);
                obj.writeObject(Produ);
                
            }catch(Exception e){
                e.printStackTrace();
            }
       System.out.println(ChronoUnit.DAYS.between( hoje , data ));
        
    }
    
    
   
    /*
    ***********************************************
    METODO DE VERIFICAR OS PRODUTOS NO FICHEIRO TXT
    ***********************************************
    */
    
    public void Verificar() throws IOException {
    //READER
    
    //if(produ.isEmpty()){
    //System.out.println("Erro"); 
   // }else{
   try{
                FileInputStream arq = new FileInputStream("Base.txt");
                ObjectInputStream obj = new ObjectInputStream(arq);
                ArrayList<Object> produ = (ArrayList<Object>)obj.readObject();
                System.out.println("Nome"+ produ);
                
            }catch(Exception e){
                e.printStackTrace();
            }
   //} 
    }
    
    
    /*
    ***********************************************
    METODO DE Modificar OS PRODUTOS NO FICHEIRO TXT
    ***********************************************
    */
    
    public void Modificar() throws IOException{

        try{
                FileInputStream arq = new FileInputStream("Base.txt");
                ObjectInputStream obj = new ObjectInputStream(arq);
                ArrayList<Object> produ = (ArrayList<Object>)obj.readObject(); 
                //System.out.println(produ);
                
                System.out.println("Escolha um id para alterar: ");
                int i = item.nextInt();
                
                System.out.println("Escreva um nome:");
            String nome = item.next();
            
            System.out.println("Escreva um preço:");
            double preco = item.nextDouble();
            
            System.out.println("Escreva o dia:");
            int dia = item.nextInt();
            
            System.out.println("Escreva o mes:");
            int mes = item.nextInt();
            
            System.out.println("Escreva o ano:");
            int ano = item.nextInt();


            data = data.of(ano, mes, dia);
            
            
            
            prod = new Produto(nome,preco,data,hoje);
            produ.remove(i);
            produ.add(i,prod);
            System.out.println(produ);
                
            //Escrever o objecto no ficheiro
            FileOutputStream arqe = new FileOutputStream("Base.txt");
                ObjectOutputStream obje = new ObjectOutputStream(arqe);
                obje.writeObject(produ);
                
            
            }catch(Exception e){
                e.printStackTrace();
            }
        
         
        }
    
    
    /*
    ***********************************************
    METODO DE Apagar o que eslcolher nos PRODUTOS NO FICHEIRO TXT
    ***********************************************
    */
    
    public void Apagar(){
    try{
                FileInputStream arq = new FileInputStream("Base.txt");
                ObjectInputStream obj = new ObjectInputStream(arq);
                ArrayList<Object> produ = (ArrayList<Object>)obj.readObject(); 
                
                System.out.println("Escolha um id para eliminar: ");
                int i = item.nextInt();

            produ.remove(i);
            System.out.println(produ);
                
            //Escrever o objecto no ficheiro
            FileOutputStream arqe = new FileOutputStream("Base.txt");
                ObjectOutputStream obje = new ObjectOutputStream(arqe);
                obje.writeObject(produ);
                obje.close();
            
            }catch(Exception e){
                e.printStackTrace();
            }
}
    
    /*
    ***********************************************
    METODO DE Apagar tudo nos PRODUTOS NO FICHEIRO TXT
    ***********************************************
    */
    
    public void Apagartudo() {
    try{
       new FileOutputStream("Base.txt").close();
    }catch(Exception exc){
      exc.printStackTrace();
    }
  }
    
    
    /*
    ***********************************************
    METODO DE escolher uma data e ver o produtos 
    ***********************************************
    */
    
    public void VerificarData() {
        
        System.out.println("Escolha quantos dias ate acabar o produto: ");
                int i = item.nextInt();
                
    try{
       new FileOutputStream("Base.txt").close();
    }catch(Exception exc){
      exc.printStackTrace();
    }
  }

}