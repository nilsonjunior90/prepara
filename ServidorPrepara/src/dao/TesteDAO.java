package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Teste;

public class TesteDAO {
	
	public List<Teste> listar(Connection con) throws Exception{
		   List<Teste> lista = new ArrayList<Teste>();
		   PreparedStatement p = con.prepareStatement("select * from teste");
		   ResultSet rs = p.executeQuery();
		   while(rs.next()){
			  Teste t = new Teste();
		      t.setId(rs.getInt("id"));
		      t.setNome(rs.getString("nome"));
		      t.setValor(rs.getString("valor"));
		      lista.add(t);
		   }
		   rs.close();
		   p.close();
		   return lista;
		}

}
