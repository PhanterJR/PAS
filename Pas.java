import javax.swing.JOptionPane; //Página 142 do livro
public class Pas{ //Nome da classe de nosso trabalho

	public static void main(String[] args) { //Este é o método Main, 
		String menu="<html><i><b>MENU DE OPÇÕES</b></i><br><br>"+ //Aqui foi ddeclarada a variável menu como String, o texto está sendo contatenado com +
			"1 - ADICIONAR NOVA OCORRENCIA<br>"+
			"2 - VER RELATÓRIO DAS 5 MAIORES OCORRÊNCIAS<br>"+
			"3 - VER RELATÓRIO DAS OCORRENCIAS E SEUS ENVOLVIDOS<br>"+
			"4 - VER RELATÓRIO DAS OCORRENCIAS E SEU PERCENTUAL<br>"+
			"5 - VER RELATÓRIO DAS LOCALIDADES E SUAS OCORRÊNCIAS<br>"+
			"9 - SAIR<br><br>"+
			"===========================================================<br>"+
			"Digite o número da opção que deseja realizar clique em 'OK'</html>";
		String opcao=JOptionPane.showInputDialog(menu); //Página 142 do livro
	}
}
