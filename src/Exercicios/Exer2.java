/* Este c�digo foi feito com o objetivo de receber 100 valores,
 * calcular sua m�dia, e verificar os valores que est�o acima desta m�dia
 */

package Exercicios;

import javax.swing.JOptionPane;

public class Exer2 {

	public static void main(String[] args) {
		double Val[] = new double[100], Md =0, Total =0;
		int Ac =0;
		
		for(int x =0; x < 100; x++) {//Recebimento de valores e sua soma
			Val[x] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o " + (x +1) + "� valor", "M�dia", 3));
			
			Total += Val[x];
			
		}
		Md = Total/100;//M�dia
		
		for(int x=0; x < 100; x++){//Verificando se h� valores acima da m�dia
			if(Val[x]>Md) {
				Ac++;
			}
		}
		JOptionPane.showMessageDialog(null, "A m�dia � de :\n"+ Md +  "\nTiveram " + Ac + " valores acima da m�dia", "M�dia", 1 );

	}

}
