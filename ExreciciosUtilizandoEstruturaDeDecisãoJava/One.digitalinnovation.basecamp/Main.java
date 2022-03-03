import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	public static void main(String[] args) {

		ifflecha();
		ifsemflecha();
		ifferias();
		ifmenor();

		switchSemana();
		switchNumero();
		switchferias();
      
	}

	private static void ifflecha() {
		int mes = 12;

		if (mes == 1) {
			System.out.println("janeiro");
		} else {
			if (mes == 2) {
				System.out.println("fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("março");
				} else {
					if (mes == 4) {
						System.out.println("abril");
					} else {
						if (mes == 5) {
							System.out.println("maio");
						} else {
							if (mes == 6) {
								System.out.println("junho");
							} else {
								if (mes == 7) {
									System.out.println("julho");
								} else {
									if (mes == 8) {
										System.out.println("agosto");
									} else {
										if (mes == 9) {
											System.out.println("setemblo");
										} else {
											if (mes == 10) {
												System.out.println("outubro");
											} else {
												if (mes == 11) {
													System.out.println("novembro");
												} else {
													if (mes == 12) {
														System.out.println("desembro");
													} else {
														System.out.println("mes indefinido");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}

			}
		}
	}

	private static void ifsemflecha() {

		int mes = 12;

		if (mes == 1) {
			System.out.println("janeiro");
		} else if (mes == 2) {
			System.out.println("fevereiro");
		} else if (mes == 3) {
			System.out.println("março");
		} else if (mes == 5) {
			System.out.println("abril");
		} else if (mes == 6) {
			System.out.println("maio");
		} else if (mes == 7) {
			System.out.println("junho");
		} else if (mes == 8) {
			System.out.println("julho");
		} else if (mes == 9) {
			System.out.println("agosto");
		} else if (mes == 10) {
			System.out.println("semtembro");
		} else if (mes == 11) {
			System.out.println("novembro");
		} else if (mes == 12){
			System.out.println("dezembro");
		}
		else {
			System.out.println("MÊs indefinifo");
		}
	}

	private static void ifferias() {

		String mes = "julho";
		if (mes == "julho" || mes == "desembro " || mes == "janeiro") {
			System.out.println("ferias");
		}

	}

	private static void ifmenor() {
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;

		int quantidadedependente = 4;
		int mediaDependente = 2;
		// evitar fazer dessa forma
		if ((salarioMensal < mediaSalario) && (quantidadedependente >= mediaDependente)) {
			System.out.println("funcionario deve receber auxilio");
		}

		// forma correta utilizando boas praticas
		// friando variaveis adicionais
		boolean salaribaixo = salarioMensal < mediaSalario;
		boolean muitosDependente = quantidadedependente >= mediaDependente;

		if ((salaribaixo) && (muitosDependente)) {
			System.out.println("funcionario deve receber auxilio");
		}

		boolean receberAuxilio = (salaribaixo) && (muitosDependente);

		if (receberAuxilio) {
			System.out.println("funcionario deve receber auxilio ");

		} else {
			System.out.println("funcionario não deve receber auxilio");
		}

	}

	private static void switchSemana() {

		String dia = "hjghf";

		switch (dia) {
		case "segunda":
			System.out.println(1);
			break;

		case "terça":
			System.out.println(2);
			break;
		case "quarta":
			System.out.println(3);
			break;
		case "quinta":
			System.out.println(4);
			break;
		case "sexta":
			System.out.println(5);
			break;
		case "sabado":
			System.out.println(6);
			break;
		case "domingo":
			System.out.println(7);
			break;
		default :
			System.out.println("dia invalido");
			break;

		}
	}
	 private static void switchNumero() {
		 
		 int numero = 1;
		 switch (numero) {
		 case 1:
		 case 2:
		 case 3:
			 System.out.println("certo");
			break;
		 case 4:
			 System.out.println("errado");
			 break;
		 case 5:
			 System.out.println("valtez");
			 break;
		 default :
			 System.out.println("valor indefinido");
			 break;
		 }
		 
	 }
	 public static void switchferias() {
		 String mes = "dezembro";
			 switch(mes) {
			 case "dezembro":
			 case "julho":
			 case "janeiro":
				 System.out.println("ferias");
				 break;
			 default:
				System.out.println("mês indefinido");	 
				break;
			 
		 }
		 
	 }
	 
}