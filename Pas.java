
import javax.swing.JOptionPane; //Página 142 do livro
public class Pas{ //Nome da classe de nosso trabalho, está Pas, aconselho mudar, lembre-se que o nome do arquivo tb tem que mudar, exemplo, se colocar "PasJunior" salve como "PasJunior.java"

    public static void main(String[] args) { //Este é o método main
        Boolean sair_programa=false;
        Boolean sair_ordem_ocorrencia;
        String menu;
        int opcao_int = 0;
        int total_ocorrencias=0;
        String reg_ocorrencias[] = new String[500];
        String reg_locais[] = new String[500];
        String reg_descricoes[] = new String[500];
        String reg_envolvidos[] = new String[500];
        String vfiltro1[];
        int vfiltro2[];
        int rank1[] = new int[5];
        int rank2[] = new int[5];

        reg_ocorrencias[0]="Preconceito Social";
        reg_ocorrencias[1]="Preconceito Social";
        reg_ocorrencias[2]="Intolerância Religiosa";
        reg_ocorrencias[3]="Preconceito Social";
        reg_ocorrencias[4]="Bulling";
        reg_ocorrencias[5]="Preconceito Social";
        reg_ocorrencias[6]="Gênero";
        reg_ocorrencias[7]="Bulling";
        reg_ocorrencias[9]="Intolerância Religiosa";
        reg_ocorrencias[8]="Desrespeito ao Idoso";
        reg_ocorrencias[9]="Intolerância Religiosa";
        reg_ocorrencias[10]="Preconceito Social";
        reg_ocorrencias[11]="Intolerância Religiosa";
        reg_ocorrencias[12]="Preconceito Social";
        reg_ocorrencias[13]="Preconceito Racial";
        reg_ocorrencias[13]="Preconceito Racial";
        reg_ocorrencias[14]="Intolerância Religiosa";
        reg_ocorrencias[15]="Intolerância Religiosa";
        reg_locais[0]="Tobias Barreto";
        reg_locais[1]="Tobias Barreto";
        reg_locais[2]="Lagarto";
        reg_locais[3]="Itabaiana";
        reg_locais[4]="Aracaju";
        reg_locais[5]="Aracaju";
        reg_locais[6]="Tobias Barreto";
        reg_locais[7]="Lagarto";
        reg_locais[9]="Itabaiana";
        reg_locais[8]="Lagarto";
        reg_locais[9]="Aracaju";
        reg_locais[10]="Aracaju";
        reg_locais[11]="Tobias Barreto";
        reg_locais[12]="Lagarto";
        reg_locais[13]="Itabaiana";
        reg_locais[13]="Preconceito Racial";
        reg_locais[14]="Umbaúba";
        reg_locais[15]="Tobias Barreto";
        reg_descricoes[0]="Sem descrição";
        reg_descricoes[1]="Sem descrição";
        reg_descricoes[2]="Resolvido";
        reg_descricoes[3]="Sem descrição";
        reg_descricoes[4]="Em processo";
        reg_descricoes[5]="Em processo";
        reg_descricoes[6]="Estaca zero";
        reg_descricoes[7]="Emcaminhado ao Juiz";
        reg_descricoes[9]="Sem descrição";
        reg_descricoes[8]="Resolvido";
        reg_descricoes[9]="Em processo";
        reg_descricoes[10]="Em processo";
        reg_descricoes[11]="Estaca zero";
        reg_descricoes[12]="Testemunhas a ser encontrada";
        reg_descricoes[13]="Sem descrição";
        reg_descricoes[13]="Emcaminhado ao Juiz";
        reg_descricoes[14]="Emcaminhado ao Juiz";
        reg_descricoes[15]="Emcaminhado ao Juiz";
        reg_envolvidos[0]="Pedro, Simão, Jackson";
        reg_envolvidos[1]="João, José, Patrícia";
        reg_envolvidos[2]="José, Maria, Pedro";
        reg_envolvidos[3]="Marcia, Marcos";
        reg_envolvidos[4]="Maiza, Viana";
        reg_envolvidos[5]="Viana, Souzinha";
        reg_envolvidos[6]="Marcos, José, Maurício";
        reg_envolvidos[7]="Bulling";
        reg_envolvidos[9]="Marcondes, João, José";
        reg_envolvidos[8]="Santos, Manoel";
        reg_envolvidos[9]="Marcondes, João";
        reg_envolvidos[10]="Maria, Pedro";
        reg_envolvidos[11]="Marcondes, João, Maria";
        reg_envolvidos[12]="Maria, Pedro, Victor";
        reg_envolvidos[13]="Maria, Maurício";
        reg_envolvidos[13]="Maria, Maurício";
        reg_envolvidos[14]="Cirano, Viana, Rosalia";
        reg_envolvidos[15]="Ingrid, Marcelo, Hélio";

        do{ //pagina 151 do {//bloco de comandos}while (expressão lógica)
            total_ocorrencias=0;
            for (int y=0;y<500 ;y++ ) {
                if ((reg_ocorrencias[y]=="")||(reg_ocorrencias[y]==null)){

                } else{
                    total_ocorrencias++;
                }
            }
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
                                            System.out.println("Interrompendo loop");
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
                    } while(sair_caso_1==false);
                    break;              
                case "2":
                    vfiltro1 = new String[500];
                    vfiltro2 = new int[500];
                    String posicao_atual="";
                    if ((reg_ocorrencias[0]=="")||(reg_ocorrencias[0]==null)){
                        JOptionPane.showMessageDialog(null, "Não há ocorrências"); //Não tem no livro, porém poderia colocar "System.out.ln("Não há ocorrencias);"
                        sair_ordem_ocorrencia=true;
                    } else {
                        sair_ordem_ocorrencia=false;
                        int cont_caso2=0;
                        do{
                            posicao_atual=reg_ocorrencias[cont_caso2];
                            if((posicao_atual=="")||(posicao_atual==null)||(cont_caso2>498)){
                                sair_ordem_ocorrencia=true;
                            } else {
                                for (int z=0; z<499; z++) {
                                    if ((vfiltro1[z]=="")||(vfiltro1[z]==null)){
                                        vfiltro1[z]=posicao_atual;
                                        vfiltro2[z]=1;
                                        break;
                                    } else if (vfiltro1[z]==posicao_atual) {
                                        vfiltro2[z]=vfiltro2[z]+1;
                                        break;
                                    }
                                    
                                }
                            }
                            cont_caso2++;
                        }while(sair_ordem_ocorrencia==false);
                        rank1[0]=0;
                        rank1[1]=0;
                        rank1[2]=0;
                        rank1[3]=0;
                        rank1[4]=0;
                        for (int v=0; v<5; v++) {
                            for (int u=0; u<499; u++){
                                if ((vfiltro1[u]=="")||(vfiltro1[u]==null)){
                                    break;
                                } else{
                                    if (v==0){
                                        if (rank1[0]<vfiltro2[u]){
                                            rank1[0]=vfiltro2[u];
                                            rank2[0]=u;
                                        }
                                    }
                                    if (v==1){
                                        if ((rank1[1]<vfiltro2[u]) && (rank2[0]!=u)){
                                            rank1[1]=vfiltro2[u];
                                            rank2[1]=u; 
                                        }
                                    }
                                    if (v==2){
                                        if ((rank1[2]<vfiltro2[u]) && (rank2[0]!=u) && (rank2[1]!=u)){
                                            rank1[2]=vfiltro2[u];
                                            rank2[2]=u; 
                                        }
                                    }
                                    if (v==3){
                                        if ((rank1[3]<vfiltro2[u]) && (rank2[0]!=u) && (rank2[1]!=u) && (rank2[2]!=u)){
                                            rank1[3]=vfiltro2[u];
                                            rank2[3]=u; 
                                        }
                                    }
                                    if (v==4){
                                        if ((rank1[4]<vfiltro2[u]) && (rank2[0]!=u) && (rank2[1]!=u) && (rank2[2]!=u) && (rank2[3]!=u)){
                                            rank1[4]=vfiltro2[u];
                                            rank2[4]=u; 
                                        }
                                    }

                                }
                            }    
                        }
                        String texto_caso_2="<html><i><b>RELATÓRIO - AS 5 MAIORES OCORRÊNCIAS</b></i><br><br>";
                                        
                        for (int r=0; r<5; r++) {
                            texto_caso_2=texto_caso_2+(r+1)+ " - "+ vfiltro1[rank2[r]]+ " com "+vfiltro2[rank2[r]]+" ocorrência(s)<br>";
                        }
                        texto_caso_2=texto_caso_2+"==============================================================<br>PRESSIONE ENTER PARA CONTINUAR</html>";
                        String nada=JOptionPane.showInputDialog(texto_caso_2);             
                    }
                    break;
                case "3":
                    String texto_caso_3="";
                    if ((reg_ocorrencias[0]=="")||(reg_ocorrencias[0]==null)){
                        JOptionPane.showMessageDialog(null, "Não há registros"); //Não tem no livro, porém poderia colocar "System.out.ln("Não há ocorrencias); ou usar o JOptionPane.showInputDialog("Não há ocorrencias");"
  
                    }else{
                        texto_caso_3="<html><i><b>OCORRÊNCIAS E SEUS ENVOLVIDOS</b></i><br><br>";
                        for(int x=0; x<500; x++){
                            if ((reg_ocorrencias[x]=="")||(reg_ocorrencias[x]==null)){
                                break;
                            }else{ 
                                texto_caso_3=texto_caso_3+"<i>"+(x+1)+" - "+reg_ocorrencias[x]+":</i><br>";
                                texto_caso_3=texto_caso_3+" > "+reg_envolvidos[x]+"<br><br>";
                            }
                        }
                    }
                    texto_caso_3=texto_caso_3+"==============================================================<br>PRESSIONE ENTER PARA CONTINUAR</html>";
                    String nada=JOptionPane.showInputDialog(texto_caso_3);   
                    break;
                case "4":
                    vfiltro1 = new String[500];
                    vfiltro2 = new int[500];
                    String posicao_atual_c4="";
                    String texto_caso_4="";
                    if ((reg_ocorrencias[0]=="")||(reg_ocorrencias[0]==null)){
                        JOptionPane.showMessageDialog(null, "Não há ocorrências"); //Não tem no livro, porém poderia colocar "System.out.ln("Não há ocorrencias); ou usar o JOptionPane.showInputDialog("Não há ocorrencias");"
                        sair_ordem_ocorrencia=true;
                    } else {
                        sair_ordem_ocorrencia=false;
                        int cont_caso2=0;
                        do{
                            posicao_atual_c4=reg_ocorrencias[cont_caso2];
                            if((posicao_atual_c4=="")||(posicao_atual_c4==null)||(cont_caso2>498)){
                                sair_ordem_ocorrencia=true;
                            } else {
                                for (int z=0; z<499; z++) {
                                    if ((vfiltro1[z]=="")||(vfiltro1[z]==null)){
                                        vfiltro1[z]=posicao_atual_c4;
                                        vfiltro2[z]=1;
                                        break;
                                    } else if (vfiltro1[z]==posicao_atual_c4) {
                                        vfiltro2[z]=vfiltro2[z]+1;
                                        break;
                                    }
                                }
                            }
                            cont_caso2++;
                        }while(sair_ordem_ocorrencia==false);
                        texto_caso_4="<html><i><b>OCORRÊNCIAS EM PORCENTAGEM</b></i><br><br>";
                        for(int x=0; x<500; x++){
                            if ((vfiltro1[x]=="")||(vfiltro1[x]==null)){
                                break;
                            }else{
                                double porcentagem = (vfiltro2[x]/(double)total_ocorrencias*100.0);
                                String porcentagem_formatado=String.format("%.2f",porcentagem);
                                texto_caso_4=texto_caso_4+(x+1)+ " - "+ vfiltro1[x]+ " com "+porcentagem_formatado+"%<br>";
                            }
                        }
                    }
                    texto_caso_4=texto_caso_4+"==============================================================<br>PRESSIONE ENTER PARA CONTINUAR</html>";
                    String nada4=JOptionPane.showInputDialog(texto_caso_4); 
                    
                    break;
                case "5":
                    vfiltro1 = new String[500];
                    vfiltro2 = new int[500];
                    String posicao_atual_c5="";
                    String texto_caso_5="";
                    if ((reg_locais[0]=="")||(reg_locais[0]==null)){
                        JOptionPane.showMessageDialog(null, "Não há ocorrências"); //Não tem no livro, porém poderia colocar "System.out.ln("Não há ocorrencias"); ou usar o JOptionPane.showInputDialog("Não há ocorrencias");"
                        sair_ordem_ocorrencia=true;
                    } else {
                        sair_ordem_ocorrencia=false;
                        int cont_caso2=0;
                        do{
                            posicao_atual_c5=reg_locais[cont_caso2];
                            if((posicao_atual_c5=="")||(posicao_atual_c5==null)||(cont_caso2>498)){
                                sair_ordem_ocorrencia=true;
                            } else {
                                for (int z=0; z<499; z++) {
                                    if ((vfiltro1[z]=="")||(vfiltro1[z]==null)){
                                        vfiltro1[z]=posicao_atual_c5;
                                        vfiltro2[z]=1;
                                        break;
                                    } else if (vfiltro1[z]==posicao_atual_c5) {
                                        vfiltro2[z]=vfiltro2[z]+1;
                                        break;
                                    }
                                }
                            }
                            cont_caso2++;
                        }while(sair_ordem_ocorrencia==false);
                        texto_caso_5="<html><i><b>LOCAIS E SUAS OCORRÊNCIAS</b></i><br><br>";
                        for(int x=0; x<500; x++){
                            if ((vfiltro1[x]=="")||(vfiltro1[x]==null)){
                                break;
                            }else{
                                texto_caso_5=texto_caso_5+(x+1)+ " - "+ vfiltro1[x]+ " com "+vfiltro2[x]+" ocorrencia(s)<br>";
                            }
                        }
                    }
                    texto_caso_5=texto_caso_5+"==============================================================<br>PRESSIONE ENTER PARA CONTINUAR</html>";
                    String nada5=JOptionPane.showInputDialog(texto_caso_5);                     
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Programa sendo finalizado"); //Não tem no livro, porém poderia colocar "System.out.ln("Programa sendo finalizado"); ou usar o JOptionPane.showInputDialog("Programa sendo finalizado");"
                    sair_programa=true; 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida"); //Não tem no livro, porém poderia colocar "System.out.ln("Opção Inválida"); ou usar o JOptionPane.showInputDialog("Opção Inválida");"
                    break;
            }
        }while(sair_programa==false);
    }
}
