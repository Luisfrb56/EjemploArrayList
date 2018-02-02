
package exemploarraylist;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ExemploArrayList {


    public static void main(String[] args) {
        //ArrayList lista=new ArrayList();
        //lista.add(1);
       // lista.add("aaaa");
       // lista.add(1.6);
       // lista.add("c");
        //for(int i=0;i<lista.size();i++){
          //  System.out.println(lista);
        //}        
        ArrayList <Integer> listanum=new ArrayList<Integer>();
        //listanum.add(2);
        //listanum.add(new Integer(3));
        //non admite String  listanum.add("Palabra");
        
        Metodos obx=new Metodos();
       // int num=parseInt(JOptionPane.showInputDialog("1.Engadir elementos \n2.Amosar elementos"));
        //switch(num){
          //  case 1:
            //    int cant=parseInt(JOptionPane.showInputDialog("¿Cuantos elementos quieres? "));
              //  for(int i=0;i<cant;i++){
                //obx.engadir(listanum);
                //}
                
            //case 2:
              //  obx.amosarIterator(listanum);
                //break;
                
        //}
        int t;
        int cant=parseInt(JOptionPane.showInputDialog("¿Cuantos elementos quieres? "));
               for(int i=0;i<cant;i++){
            obx.engadir(listanum);
               }
        obx.amosarIterator(listanum);
        System.out.println("\n");
        do{
        int num;
        num=parseInt(JOptionPane.showInputDialog("1.Engadir un elemento. \n2.Borrar por posicion \n3.Borrar por elemento \n4.Modificar por posicion \n5.Modificiar por Elemento \n6.Maior e menor elemento \n7.Pares e impares."));
        switch(num){
            
            case 1:
                
        obx.engadir(listanum);
        obx.amosarIterator(listanum);
        break;
        
            case 2:
        
        obx.borrarElementoPosicion(listanum);
        obx.amosarIterator(listanum);
        break;
            case 3:
                
        System.out.println("\n");
        obx.borrarElementoNombre(listanum);
        obx.amosarIterator(listanum);
        break;
            case 4:
                
        System.out.println("\n");
        obx.modificiarValorPosicion(listanum);
        obx.amosarIterator(listanum);
        break;
        
            case 5:
                
        System.out.println("\n");
        obx.modificiarValorElemento(listanum);
        obx.amosarIterator(listanum);
        break;
        
            case 6:
                
        System.out.println("\n");
        obx.maioreMenor(listanum);
        break;
        
            case 7:
                
        System.out.println("\n");
        obx.damePar(listanum);
        break;
        
            default:
                
        System.out.println("Esa opcion no existe.");
        break;
                
        }
         t = JOptionPane.showConfirmDialog(null,"¿Deseas hacer otra acción?","Confirmar salida",JOptionPane.YES_NO_OPTION);
        }while(t==JOptionPane.YES_OPTION);
        
         
    }
    
}
