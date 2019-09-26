/* Este código foi feito com o objetivo de receber 100 valores,
 * calcular sua média, e verificar os valores que estão acima desta média
 */

package Exercicios;

import javax.swing.JOptionPane;

public class Exer2 {

	public static void main(String[] args) {
		double Val[] = new double[100], Md =0, Total =0;
		int Ac =0;
		
		for(int x =0; x < 100; x++) {//Recebimento de valores e sua soma
			Val[x] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o " + (x +1) + "° valor", "Média", 3));
			
			Total += Val[x];
			
		}
		Md = Total/100;//Média
		
		for(int x=0; x < 100; x++){//Verificando se há valores acima da média
			if(Val[x]>Md) {
				Ac++;
			}
		}
		JOptionPane.showMessageDialog(null, "A média é de :\n"+ Md +  "\nTiveram " + Ac + " valores acima da média", "Média", 1 );

	}

}
