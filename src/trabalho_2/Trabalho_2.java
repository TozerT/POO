package trabalho_2;
import java.io.IOException;
import java.util.Scanner;

public class Trabalho_2 {
    
  
    public static void main(String[] args) throws IOException {
        System.out.println("Menu");
        System.out.println("Escolha uma opção: ");
        System.out.println("1:Insira  uma produto ");
        System.out.println("2:Verificar Compras ");
        System.out.println("3:Alterar Dados ");
        System.out.println("4:Apagar objetos escolhidos Dados ");
        System.out.println("5:Apagar Dados ");
        System.out.println("6:Verificar datas ");
        System.out.println("0:Para sair do programa ");
        
        Operações op = new Operações();
        Scanner item = new Scanner(System.in);
        int choice = item.nextInt();
        
   
    if(choice<0 || choice>5){
    System.out.println("Insira uma opção valida");
    }else{
        switch (choice) {
  case 1:
    op.Inserir();
    break;
  case 2:
    op.Verificar();
    break;
    case 3:
    op.Modificar();
    break;
    case 4:
    op.Apagar();   
    break;
    case 5:
    op.Apagartudo();
    break;
    case 6:
    op.VerificarData();
    break;
    case 0:
    System.out.println("Saiu ");
    break;
        }
      }
   
    }   
}

  