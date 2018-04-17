package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.PessoaFisica;

public class jdbcDAO {

	private Connection conn;
	
	public jdbcDAO(Connection conn) {
		this.conn = conn;
	}
	public void salvar(PessoaFisica c) throws SQLException {
		
		String sql = "insert into cadastro_de_pessoas (nome, endereco, bairro, cep, cidade, estado, telefone, celular, rg, cpf, sexo) "
+ "values ('" +c.getNome()+"','"+c.getEndereco()+"','"+c.getBairro()+"','"+c.getCep()+"','"+c.getCidade()+"','"+c.getEstado()+"','"+c.getTelefone()+"','"+c.getCelular()+"','"+c.getRg()+"','"+c.getCpf()+"','"+c.getSexo()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
		
		
	}
	public void listar(double txtCpf) {
		String sql = "SELECT * FROM cadastro_de_pessoas where cpf='"+txtCpf+"';";
		
		
	}
	
}
