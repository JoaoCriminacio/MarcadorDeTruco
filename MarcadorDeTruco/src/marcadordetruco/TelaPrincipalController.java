package marcadordetruco;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;

public class TelaPrincipalController implements Initializable {
    int contador1 = 0;
    int contador2 = 0;
    
    //Botões
    @FXML
    Button btnMenosEquipe1;
    @FXML
    Button btnMaisEquipe1;
    @FXML
    Button btnTrucoEquipe1;
    @FXML
    Button btnSeisEquipe1;
    @FXML
    Button btnNoveEquipe1;
    @FXML
    Button btnDozeEquipe1;
    @FXML
    Button btnMenosEquipe2;
    @FXML
    Button btnMaisEquipe2;
    @FXML
    Button btnTrucoEquipe2;
    @FXML
    Button btnSeisEquipe2;
    @FXML
    Button btnNoveEquipe2;
    @FXML
    Button btnDozeEquipe2;
    
    //TextField
    @FXML
    TextField txtEquipe1;
    @FXML
    TextField txtEquipe2;
    
    //Label
    @FXML
    Label placarEquipe1;
    @FXML
    Label vitoriasEquipe1;
    @FXML
    Label placarEquipe2;
    @FXML
    Label vitoriasEquipe2;
    
    public void maisEquipe1Action (ActionEvent event){
        int placar1 = Integer.parseInt(placarEquipe1.getText());
        int resultado = placar1 + 1;
        placarEquipe1.setText(String.valueOf(resultado));
        
        //Validar Vitória
        int vitorias1 = Integer.parseInt(placarEquipe1.getText());
            if(vitorias1 >= 12){
                JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe1.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador1++;
                placarEquipe1.setText("0");
            }

        vitoriasEquipe1.setText(String.valueOf(contador1));
    }
    
    public void menosEquipe1Action (ActionEvent event){
        int placar1 = Integer.parseInt(placarEquipe1.getText());
        if(placar1 != 0){
            int resultado = placar1 - 1;
            placarEquipe1.setText(String.valueOf(resultado));
        }
    }
    
    public void trucoEquipe1Action (ActionEvent event){
        int placar1 = Integer.parseInt(placarEquipe1.getText());
        int resultado = placar1 + 3;
        placarEquipe1.setText(String.valueOf(resultado));
        
        //Validar Vitória
        int vitorias1 = Integer.parseInt(placarEquipe1.getText());
            if(vitorias1 >= 12){
                JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe1.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador1++;
                placarEquipe1.setText("0");
            }

        vitoriasEquipe1.setText(String.valueOf(contador1));
    }
    
    public void seisEquipe1Action (ActionEvent event){
        int placar1 = Integer.parseInt(placarEquipe1.getText());
        int resultado = placar1 + 6;
        placarEquipe1.setText(String.valueOf(resultado));
        
        //Validar Vitória
        int vitorias1 = Integer.parseInt(placarEquipe1.getText());
            if(vitorias1 >= 12){
                JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe1.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador1++;
                placarEquipe1.setText("0");
            }

        vitoriasEquipe1.setText(String.valueOf(contador1));
    }
    
    public void noveEquipe1Action (ActionEvent event){
        int placar1 = Integer.parseInt(placarEquipe1.getText());
        int resultado = placar1 + 9;
        placarEquipe1.setText(String.valueOf(resultado));
        
        //Validar Vitória
        int vitorias1 = Integer.parseInt(placarEquipe1.getText());
            if(vitorias1 >= 12){
                JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe1.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador1++;
                placarEquipe1.setText("0");
            }

        vitoriasEquipe1.setText(String.valueOf(contador1));
    }
    
    public void dozeEquipe1Action (ActionEvent event){
        int placar1 = Integer.parseInt(placarEquipe1.getText());
        int resultado = placar1 + 12;
        placarEquipe1.setText(String.valueOf(resultado));
        
        //Validar Vitória
        int vitorias1 = Integer.parseInt(placarEquipe1.getText());
            if(vitorias1 >= 12){
                JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe1.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador1++;
                placarEquipe1.setText("0");
            }

        vitoriasEquipe1.setText(String.valueOf(contador1));
    }
    
    public void maisEquipe2Action (ActionEvent event){
        int placar2 = Integer.parseInt(placarEquipe2.getText());
        int resultado = placar2 + 1;
        placarEquipe2.setText(String.valueOf(resultado));
        
        //Validar Vitória
	int vitorias2 = Integer.parseInt(placarEquipe2.getText());
        if(vitorias2 >= 12){
        	JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe2.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador2++;
                placarEquipe2.setText("0");
            }

         vitoriasEquipe2.setText(String.valueOf(contador2));
    }
    
    public void menosEquipe2Action (ActionEvent event){
        int placar2 = Integer.parseInt(placarEquipe2.getText());
        if(placar2 != 0){
            int resultado = placar2 - 1;
            placarEquipe2.setText(String.valueOf(resultado));
        }
    }
    
    public void trucoEquipe2Action (ActionEvent event){
        int placar2 = Integer.parseInt(placarEquipe2.getText());
        int resultado = placar2 + 3;
        placarEquipe2.setText(String.valueOf(resultado));
        
        //Validar Vitória
	int vitorias2 = Integer.parseInt(placarEquipe2.getText());
        if(vitorias2 >= 12){
        	JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe2.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador2++;
                placarEquipe2.setText("0");
            }

         vitoriasEquipe2.setText(String.valueOf(contador2));
    }
    
    public void seisEquipe2Action (ActionEvent event){
        int placar2 = Integer.parseInt(placarEquipe2.getText());
        int resultado = placar2 + 6;
        placarEquipe2.setText(String.valueOf(resultado));
        
        //Validar Vitória
	int vitorias2 = Integer.parseInt(placarEquipe2.getText());
        if(vitorias2 >= 12){
        	JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe2.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador2++;
                placarEquipe2.setText("0");
            }

         vitoriasEquipe2.setText(String.valueOf(contador2));
    }
    
    public void noveEquipe2Action (ActionEvent event){
        int placar2 = Integer.parseInt(placarEquipe2.getText());
        int resultado = placar2 + 9;
        placarEquipe2.setText(String.valueOf(resultado));
        
        //Validar Vitória
	int vitorias2 = Integer.parseInt(placarEquipe2.getText());
        if(vitorias2 >= 12){
        	JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe2.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador2++;
                placarEquipe2.setText("0");
            }

         vitoriasEquipe2.setText(String.valueOf(contador2));
    }
    
    public void dozeEquipe2Action (ActionEvent event){
        int placar2 = Integer.parseInt(placarEquipe2.getText());
        int resultado = placar2 + 12;
        placarEquipe2.setText(String.valueOf(resultado));
        
        //Validar Vitória
	int vitorias2 = Integer.parseInt(placarEquipe2.getText());
        if(vitorias2 >= 12){
        	JOptionPane.showConfirmDialog(null,"Equipe "+txtEquipe2.getText()+" venceu!", "Partida Encerrada!",JOptionPane.YES_NO_OPTION);
                contador2++;
                placarEquipe2.setText("0");
            }

         vitoriasEquipe2.setText(String.valueOf(contador2));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
