package br.edu.ifpa.laboratorio.dao;

import br.edu.ifpa.laboratorio.database.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EquipamentoDAO {


    public void atualizarStatus(int idEquipamento, boolean disponivel) {
        String sql = "UPDATE equipamento SET disponivel = ? WHERE id = ?";


        try (Connection conn = ConexaoMySQL.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setBoolean(1, disponivel);
            stmt.setInt(2, idEquipamento);

            stmt.executeUpdate();
            System.out.println("Status do equipamento atualizado no banco de dados!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o equipamento: " + e.getMessage());
        }
    }
}
