package br.inatel.cartola.control;

import br.inatel.cartola.DAO.JogadorDAO;
import br.inatel.cartola.DAO.TimeDAO;
import br.inatel.cartola.model.Jogador;
import br.inatel.cartola.model.Time;


public class AdmTimes {
    Time time;
    TimeDAO timeDAO = new TimeDAO();


    public void insereTimes(){
        timeDAO.insertTime(time);
    }

    public void mostraTimes(){
        timeDAO.selectTimes();
    }
    public void deletaTimes(){
        timeDAO.deleteTime(time);
    }

    public void insereJogador(Jogador jogador){
        JogadorDAO jogadorDAO = new JogadorDAO();
        time.jogadores.add(jogadorDAO.selectJogador(jogador));
        time.setDinheiro(time.getDinheiro() - jogador.preco);
    }

    public void pontos(Time time) {
    }
}
