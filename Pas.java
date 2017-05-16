
import javax.swing.JOptionPane; //Página 142 do livro
public class Pas{ //Nome da classe de nosso trabalho

    public static void main(String[] args) { //Este é o método Main
        Boolean sair_programa=false;
        String menu;
        int opcao_int = 0;
        int total_ocorrencias=0;
        String reg_ocorrencias[] = new String[500];
        String reg_locais[] = new String[500];
        String reg_descricoes[] = new String[500];
        String reg_envolvidos[] = new String[500];
        do{ //pagina 151 do {//bloco de comandos}while (expressão lógica)
            String ocorrencia_atual = "";
            String local_atual="";
            String descricao_atual="";
            String envolvido_atual="";
            String envolvidos[] = new String[10]; //Página 162 do livro, poderia optar por Arraylist, mas vou me ater a usar o que está no livro.
            menu="<html><i><b>MENU DE OPÇÕES</b></i><br><br>"+ //Aqui foi ddeclarada a variável menu como String, o texto está sendo contatenado com +
                "1 - ADICIONAR NOVA OCORRENCIA<br>"+
                "2 - VER RELATÓRIO DAS 5 MAIORES OCORRÊNCIAS<br>"+
                "3 - VER RELATÓRIO DAS OCORRENCIAS E SEUS ENVOLVIDOS<br>"+
                "4 - VER RELATÓRIO DAS OCORRENCIAS E SEU PERCENTUAL<br>"+
                "5 - VER RELATÓRIO DAS LOCALIDADES E SUAS OCORRÊNCIAS<br>"+
                "9 - SAIR<br><br>"+
                "===========================================================<br>"+
                "Digite o número da opção que deseja realizar clique em 'OK'</html>";
            String opcao=JOptionPane.showInputDialog(menu); //Página 142 do livro
            //opcao=new String(opcao);
            switch (opcao){ //Página 146 do livro, eu podia optar po if(){} else if(){} else{};
                case "1":
                    Boolean sair_caso_1=false;
                    String texto_caso_1="<html><i><b>ADICIONAR OCORRÊNCIAS - OCORRÊNCIA</b></i><br><br>"+
                                        "OCORRENCIA: ------------------------------------------<br>"+
                                        "LOCAL: -----------------------------------------------<br>"+
                                        "DESCRICAO: -------------------------------------------<br>"+
                                        "ENVOLVIDOS: ------------------------------------------<br><br>"+
                                        "==============================================================<br>"+
                                        "Qual foi a ocorrencia? Exemplo: Intolerância Religiosa</html>";
                    do{
                        if ((ocorrencia_atual=="") || (ocorrencia_atual==null)){
                            ocorrencia_atual="";
                            texto_caso_1="<html><i><b>ADICIONAR OCORRÊNCIAS - OCORRÊNCIA</b></i><br><br>"+
                            "OCORRENCIA: ------------------------------------------<br>"+
                            "LOCAL: -----------------------------------------------<br>"+
                            "DESCRICAO: -------------------------------------------<br>"+
                            "ENVOLVIDOS: ------------------------------------------<br><br>"+
                            "==============================================================<br>"+
                            "Qual foi a ocorrencia? Exemplo: Intolerância Religiosa</html>";                            
                            ocorrencia_atual=JOptionPane.showInputDialog(texto_caso_1);

                        } else if ((local_atual=="")||(local_atual==null)){
                            local_atual="";
                            texto_caso_1="<html><i><b>ADICIONAR OCORRÊNCIA - LOCAL</b></i><br><br>"+
                            "OCORRENCIA: "+ocorrencia_atual+"<br>"+
                            "LOCAL: -----------------------------------------------<br>"+
                            "DESCRICAO: -------------------------------------------<br>"+
                            "ENVOLVIDOS: ------------------------------------------<br><br>"+
                            "==============================================================<br>"+
                            "Onde Ocorreu o fato (local)? Exemplo: Aracaju</html>";
                            local_atual=JOptionPane.showInputDialog(texto_caso_1);
                        } else if ((descricao_atual=="")||(descricao_atual==null)){
                            descricao_atual="";
                            texto_caso_1="<html><i><b>ADICIONAR OCORRÊNCIA - DESCRIÇÃO</b></i><br><br>"+
                            "OCORRENCIA: "+ocorrencia_atual+"<br>"+
                            "LOCAL: "+local_atual+"<br>"+
                            "DESCRICAO: -------------------------------------------<br>"+
                            "ENVOLVIDOS: ------------------------------------------<br><br>"+
                            "==============================================================<br>"+
                            "Descreva o fato? Exemplo: Fulano maltratou Beltrano.</html>";
                            descricao_atual=JOptionPane.showInputDialog(texto_caso_1);
                            if ((descricao_atual=="")||(descricao_atual==null)){
                                descricao_atual="Sem descrição.";
                            };
                        } else if ((envolvidos[0]==null)||(envolvidos[0]=="")){
                            texto_caso_1="<html><i><b>ADICIONAR OCORRÊNCIA - ENVOLVIDOS</b></i><br><br>"+
                            "OCORRENCIA: "+ocorrencia_atual+"<br>"+
                            "LOCAL: "+local_atual+"<br>"+
                            "DESCRICAO: "+descricao_atual+"<br>"+
                            "ENVOLVIDOS: ------------------------------------------<br><br>"+
                            "==============================================================<br>"+
                            "Quais os Envolvidos? Exemplo: Fulano</html>";
                            int cont=0;
                            envolvido_atual="";
                            String aviso="";
                            do{
                                if (cont==0){
                                    try{
                                        envolvidos[cont]=new String(JOptionPane.showInputDialog(texto_caso_1));
                                    }catch(NullPointerException e){
                                        envolvidos[cont]="";
                                    }
                                    
                                    switch(envolvidos[cont]){
                                        case "":
                                            System.out.println("Foi vazio");
                                        break;
                                        case ".":
                                            System.out.println("interrompendo loop");
                                            cont=10;
                                            envolvido_atual=envolvido_atual+".";
                                        default:
                                            envolvido_atual=envolvidos[cont];
                                            cont++;
                                        break;
                                    }
                                } else {
                                    texto_caso_1="<html><i><b>ADICIONAR OCORRÊNCIA - ENVOLVIDOS</b></i><br><br>"+
                                    "OCORRENCIA: "+ocorrencia_atual+"<br>"+
                                    "LOCAL: "+local_atual+"<br>"+
                                    "DESCRICAO: "+descricao_atual+"<br>"+
                                    "ENVOLVIDOS: "+envolvido_atual+"<br><br>"+
                                    "==============================================================<br>"+
                                    "Próximo Envolvido! Exemplo: Beltrano<br> Para finalizar os envolvidos digite '.' (ponto)</html>";
                                    envolvidos[cont]=JOptionPane.showInputDialog(texto_caso_1);
                                    switch(envolvidos[cont]){
                                        case "":
                                            break;
                                        case ".":
                                            envolvido_atual=envolvido_atual+".";
                                            cont=9;
                                            break;
                                        default:
                                            envolvido_atual=envolvido_atual+", "+envolvidos[cont];
                                            cont++;
                                            break;
                                    }
                                }   
                            } while (cont<9);
                        } else{

                            
                            texto_caso_1="<html><i><b>OCORRÊNCIA "+(total_ocorrencias+1)+" ADICIONADA! - RESUMO</b></i><br><br>"+
                            "OCORRENCIA: "+ocorrencia_atual+"<br>"+
                            "LOCAL: "+local_atual+"<br>"+
                            "DESCRICAO: "+descricao_atual+"<br>"+
                            "ENVOLVIDOS: "+envolvido_atual+"<br><br>"+
                            "==============================================================<br>"+
                            "1 - SALVAR E ADICIONAR NOVA OCORRÊNCIA<br>"+
                            "2 - APAGAR E ADICIONAR NOVA OCORRÊNCIA<br>"+
                            "3 - SALVAR E VOLTAR AO MENU PRINCIPAL<br>"+
                            "9 - APAGAR E VOLTAR AO MENU PRINCIPAL<br>"+
                            "==============================================================<br>"+
                            "O QUER FAZER AGORA?</html>";
                            String opcao_2=JOptionPane.showInputDialog(texto_caso_1);
                            switch (opcao_2) {
                                case "1":
                                    reg_ocorrencias[total_ocorrencias]=ocorrencia_atual;
                                    reg_locais[total_ocorrencias]=local_atual;
                                    reg_descricoes[total_ocorrencias]=descricao_atual;
                                    reg_envolvidos[total_ocorrencias]=envolvido_atual;
                                    total_ocorrencias++;
                                    ocorrencia_atual = "";
                                    local_atual="";
                                    descricao_atual="";
                                    envolvido_atual="";
                                    envolvidos = new String[10];
                                    break;
                                case "2":
                                    ocorrencia_atual = "";
                                    local_atual="";
                                    descricao_atual="";
                                    envolvido_atual="";
                                    envolvidos = new String[10];
                                    break;
                                case "3":
                                    reg_ocorrencias[total_ocorrencias]=ocorrencia_atual;
                                    reg_locais[total_ocorrencias]=local_atual;
                                    reg_descricoes[total_ocorrencias]=descricao_atual;
                                    reg_envolvidos[total_ocorrencias]=envolvido_atual;
                                    total_ocorrencias++;
                                    sair_caso_1=true;
                                    break;
                                case "9":
                                    ocorrencia_atual = "";
                                    local_atual="";
                                    descricao_atual="";
                                    envolvido_atual="";
                                    envolvidos = new String[10];
                                    sair_caso_1=true;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção inválida"); //Não tem no livro, porém poderia colocar "System.out.ln("Opção Inválida);"
                                break;
                            }
                        };
                    }while(sair_caso_1==false);
                    break;              
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Programa sendo finalizado"); //Não tem no livro, porém poderia colocar "System.out.ln("Programa sendo finalizado");"
                    sair_programa=true; 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida"); //Não tem no livro, porém poderia colocar "System.out.ln("Opção Inválida);"
                    break;
            }
        }while(sair_programa==false);


    }
}
