package br.edu.ifpa.laboratorio.dao;

import br.edu.ifpa.laboratorio.database.ConexaoMySQL;
import br.edu.ifpa.laboratorio.model.Emprestimo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmprestimoDAO {


    public void salvar(Emprestimo emprestimo) {
        String sql = "INSERT INTO emprestimo (aluno_id, equipamento_id, data_emprestimo, status) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoMySQL.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {


            stmt.setInt(1, emprestimo.getAluno().getId());
            stmt.setInt(2, emprestimo.getEquipamento().getId());
            stmt.setDate(3, new java.sql.Date(emprestimo.getDataEmprestimo().getTime()));
            stmt.setString(4, emprestimo.getStatus());


            stmt.executeUpdate();
            System.out.println("Empréstimo registrado com sucesso!");


            EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
            equipamentoDAO.atualizarStatus(emprestimo.getEquipamento().getId(), false);

        } catch (SQLException e) {
            System.out.println("Erro ao salvar o empréstimo: " + e.getMessage());
        }
    }
}
