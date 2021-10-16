public class Editor {
    public void editor(){
		String prox,valor,id,colun;
		do {
			System.out.print("\n");

			for (int i = 0; i < Banco.l; i++){
				if (Banco.dados[i][0] != null){
					System.out.print("ID: "+(i+1)+"\t\t NOME: "+ Banco.dados[i][0]+"\n");
				}
			}

			do {
				System.out.print("\nQUAL REGISTRO DESEJA EDITAR? (ID): ");
				id = Teclado.leia();
				if (Validacao.validacao(id) == false | Integer.parseInt(id) == 0 | (Integer.parseInt(id)-1) >= Banco.l | Banco.dados[Integer.parseInt(id)-1][0] == null){
					System.out.print("COMANDO INVÁLIDO!");
				}
			} while (Validacao.validacao(id) == false | Integer.parseInt(id) == 0 | (Integer.parseInt(id)-1) >= Banco.l | Banco.dados[Integer.parseInt(id)-1][0] == null);

			do {
				System.out.print("\nQUAL CAMPO DESEJA EDITAR? (");
				String dsc = "";
				for (int i = 0; i < Banco.c; i++){
					dsc += (i+1)+"-"+Info.funcao[i]+" | ";
				}
                System.out.print(dsc.substring(0,dsc.length()-3)+"): ");
				colun = Teclado.leia();
				if(Validacao.validacao(colun) == false | Integer.parseInt(colun) == 0 | (Integer.parseInt(colun)-1) >= Banco.c){
					System.out.print("COMANDO INVÁLIDO!");
				}
			} while (Validacao.validacao(colun) == false | Integer.parseInt(colun) == 0 | (Integer.parseInt(colun)-1) >= Banco.c);
		
			System.out.print("\n"+Info.funcao[Integer.parseInt(colun)-1]+" ATUAL: "+Banco.dados[Integer.parseInt(id)-1][Integer.parseInt(colun)-1]+"\t "+Info.entradaEdicao[Integer.parseInt(colun)-1]+": ");
			valor = Teclado.leia();
			do {
				if (Validacao.requisito(valor, Integer.parseInt(colun)-1) == false){
					System.out.print(Info.erros[Integer.parseInt(colun)-1]+"\n"+Info.funcao[Integer.parseInt(colun)-1]+" ATUAL: "+Banco.dados[Integer.parseInt(id)-1][Integer.parseInt(colun)-1]+"\t "+Info.entradaEdicao[Integer.parseInt(colun)-1]+": ");
					valor = Teclado.leia();
				}
			} while (Validacao.requisito(valor, Integer.parseInt(colun)-1) == false);
			if ((Integer.parseInt(colun)-1) != 3){
				Banco.dados[Integer.parseInt(id)-1][Integer.parseInt(colun)-1] = valor;
			} else {
				switch (Integer.parseInt(valor)){
					case 1: Banco.dados[Integer.parseInt(id)-1][Integer.parseInt(colun)-1] = "MASCULINO"; break;
					case 2: Banco.dados[Integer.parseInt(id)-1][Integer.parseInt(colun)-1] = "FEMININO"; break;
				}
			}
			System.out.print("\nEDITADO COM SUCESSO!\n\nDESEJA EDITAR NOVAMENTE? (S/N): ");
			prox = Teclado.leia();
			do {
				if (!prox.equals("N") & !prox.equals("n") & !prox.equals("S") & !prox.equals("s")){
					System.out.print("COMANDO INVÁLIDO!\nDESEJA EDITAR NOVAMENTE? (S/N): ");
					prox = Teclado.leia();
				}
			} while (!prox.equals("N") & !prox.equals("n") & !prox.equals("S") & !prox.equals("s"));
		} while (!prox.equals("N") & !prox.equals("n"));
		System.out.print("\n");
	}
}
