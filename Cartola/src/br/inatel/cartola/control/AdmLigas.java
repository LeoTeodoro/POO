package br.inatel.cartola.control;

import br.inatel.cartola.DAO.JogadorDAO;
import br.inatel.cartola.DAO.TimeDAO;
import br.inatel.cartola.DAO.LigaDAO;
import br.inatel.cartola.model.Liga;
import br.inatel.cartola.model.Time;

public class AdmLigas {
    Liga liga ;
    LigaDAO ligaDAO = new LigaDAO();

    public void insereLigas(){
        ligaDAO.insertLiga(liga);
    }

    public void mostraLigas(){
        ligaDAO.selectLigas();
    }

    public void deletaTimes(){
        ligaDAO.deleteTime(liga);
    }

    public void insereTime(Time time){
        TimeDAO timeDAO = new TimeDAO();
        liga.times.add(timeDAO.selectTime(time));
    }
}
