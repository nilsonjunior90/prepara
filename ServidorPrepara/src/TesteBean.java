import java.util.List;

import javax.faces.bean.ManagedBean;

import conexao.Conexao;
import dao.TesteDAO;
import model.Teste;

@ManagedBean(name = "testeB")
public class TesteBean {

	public List<Teste> lista;

	public List<Teste> getLista() {

		TesteDAO t = new TesteDAO();
		try {
			lista = t.listar(new Conexao().Factory());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;

	}

}
