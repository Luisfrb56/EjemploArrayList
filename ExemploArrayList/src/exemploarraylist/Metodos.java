
package exemploarraylist;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Metodos {

public void engadir(ArrayList<Integer>list){
    Integer n;
    n=Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
    list.add(n);
    //list.add(Integer.parseInt(JOptionPane.showInputDialog("Numero: ")));
    
}   
public void amosarIterator(ArrayList<Integer>list){
    Iterator it=list.iterator();
    while(it.hasNext())
        System.out.println(it.next());
}
public void borrarElementoPosicion(ArrayList<Integer>list){
    int t=parseInt(JOptionPane.showInputDialog("Dime que dato quieres elemento quires borrar: "));
    list.remove(t);
}
public void borrarElementoNombre(ArrayList<Integer>list){
    int p=Integer.parseInt(JOptionPane.showInputDialog("Dime que elemento deseas borrar: "));
    list.remove(new Integer(p));
}
public void modificiarValorPosicion(ArrayList<Integer>list){
    int k=parseInt(JOptionPane.showInputDialog("Dime que posicion quieres modificar:"));
    int o=parseInt(JOptionPane.showInputDialog("Dime el nuevo dato:"));
    list.set(k, o);
}
public void modificiarValorElemento(ArrayList<Integer>list){
    int s=Integer.parseInt(JOptionPane.showInputDialog("Dime que elemento deseas modificar: "));
    int v=parseInt(JOptionPane.showInputDialog("Dime el nuevo dato:"));
    list.set(list.indexOf(new Integer(s)), v);
}
public static void maioreMenor(ArrayList<Integer>list){
    System.out.println("Numero Maior: "+ list.stream().mapToInt(i->i).max().getAsInt());
    System.out.println("Numero Menor: "+list.stream().mapToInt(i->i).min().getAsInt());
}
public void damePar(ArrayList<Integer>list){
    ArrayList<Integer> pares = new ArrayList<Integer>();
                    ArrayList<Integer> impares = new ArrayList<Integer>();
                 
    		for (int i = 0; i < list.size(); i++) {
  
                  
			if ((list.get(i) % 2) == 0) {
                                pares.add(list.get(i));
                                Collections.sort(pares);
                                Iterator<Integer> it = pares.iterator();
				while (it.hasNext()) {
					Object Par = it.next();
					
				}
				

			} else {
				impares.add(list.get(i));
				Collections.sort(impares);
				Iterator<Integer> it = impares.iterator();
				while (it.hasNext()) {
					Object Impar = it.next();
				}
                                
} 

                }

            System.out.println("Pares "+pares);
                  System.out.println("Impares "+impares);     
}
}
