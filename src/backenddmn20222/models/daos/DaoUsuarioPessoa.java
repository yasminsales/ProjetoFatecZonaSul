
package backenddmn20222.models.daos;

import backenddmn20222.models.beans.UsuarioPessoa;
import java.util.ArrayList;
import java.util.List;

public class DaoUsuarioPessoa {
        
    public UsuarioPessoa inserir(UsuarioPessoa usuEnt) {
        usuEnt.setId(1);
        return usuEnt;
    }

    public UsuarioPessoa alterar(UsuarioPessoa usuEnt) {
        return usuEnt;
    }

    public List<UsuarioPessoa> listar(UsuarioPessoa usuEnt) {
        List<UsuarioPessoa> listaUsu = new ArrayList<>();
        listaUsu.add(usuEnt);
        return listaUsu;
    }

    public UsuarioPessoa excluir(UsuarioPessoa usuEnt) {
        return usuEnt;
    }

    public UsuarioPessoa buscar(UsuarioPessoa usuEnt) {
        return usuEnt;
    }
    
}
