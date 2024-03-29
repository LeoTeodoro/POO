package br.inatel.cartola.DAO;

import br.inatel.cartola.model.Jogador;
import br.inatel.cartola.model.Time;

import java.sql.SQLException;
import java.util.ArrayList;

public class TimeDAO extends ConnectionDAO {
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou

    //INSERT
    public boolean insertTime(Time time) {

        connectToDB();

        String sql = "INSERT INTO Time (Jogadores,Pontuacao,Nome,Dinheiro) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(time.jogadores));
            pst.setFloat(2, time.pontuacaoTime );
            pst.setString(3, time.nome);
            pst.setFloat(4, time.getDinheiro());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //UPDATE
    public boolean updateTime(int id, Time time) {
        connectToDB();
        String sql = "UPDATE Time SET Jogadores=?, Pontuacao=?, Nome=?, Dinheiro=? where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(time.jogadores));
            pst.setFloat(2, time.pontuacaoTime);
            pst.setString(3, time.nome);
            pst.setFloat(4, time.getDinheiro());
            pst.setInt(5,id);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //DELETE
    public boolean deleteTime(Time time) {
        connectToDB();
        String sql = "DELETE FROM Time where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, time.id );
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public ArrayList<Time> selectTimes() {
        ArrayList<Time> times = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Time";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("Lista de times: ");

            while (rs.next()) {

                Time timeAux = new Time(rs.getInt("id"),rs.getString("nome"),rs.getFloat("dinheiro"),rs.getFloat("pontuacaoTime"));

                System.out.println("nome = " + timeAux.nome);
                System.out.println("preco = " + timeAux.getDinheiro());
                System.out.println("pontuacao = " + timeAux.pontuacaoTime);
                System.out.println("id = " + timeAux.id);
                System.out.println("--------------------------------");

                times.add(timeAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return times;
    }

    public Time selectTime(Time time) {
        Time timeReturn = null;
        connectToDB();
        String sql = "SELECT * FROM Time WHERE nome=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, time.nome );
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("Time: ");

            Time timeAux = new Time(rs.getInt("id"),rs.getString("nome"),rs.getFloat("dinheiro"),
                    rs.getFloat("pontuacaoTime"));

            System.out.println("id = " + timeAux.id);
            System.out.println("nome = " + timeAux.nome);
            System.out.println("dinheiro = " + timeAux.getDinheiro());
            System.out.println("pontuacao = " + timeAux.pontuacaoTime);
            System.out.println("--------------------------------");

            timeReturn = timeAux;
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return timeReturn;
    }
}
