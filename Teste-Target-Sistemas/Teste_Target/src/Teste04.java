
public class Teste04 {

	public static void main(String[] args) {
		double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
		
		final double totalMensal = sp + rj + mg + es + outros;
		
		double representsp, representrj, representmg, representes, representoutros;
		representsp = (sp/totalMensal) * 100.00;
		representrj = (rj/totalMensal) * 100.00;
		representmg = (mg/totalMensal) * 100.00;
		representes = (es/totalMensal) * 100.00;
		representoutros = (outros/totalMensal) * 100.00;
		
		System.out.println("O estado de São Paulo representa " + String.format("%.2f", representsp) + "% do total do faturamento mensal da distribuidora");
		System.out.println("O estado do Rio de Janeiro representa " + String.format("%.2f", representrj) + "% do total do faturamento mensal da distribuidora");
		System.out.println("O estado de Minas Gerais representa " + String.format("%.2f", representmg) + "% do total do faturamento mensal da distribuidora");
		System.out.println("O estado do Espírito Santo representa " + String.format("%.2f", representes) + "% do total do faturamento mensal da distribuidora");
		System.out.println("Os outros estados representam " + String.format("%.2f", representoutros) + "% do total do faturamento mensal da distribuidora");
	}

}
