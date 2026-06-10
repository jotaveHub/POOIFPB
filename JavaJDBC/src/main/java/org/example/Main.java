package org.example;
import org.example.dao.UsuarioDaoJdbc;
import org.example.database.ConnectionFactory;
import org.example.model.Usuario;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
/*
//Conexão do banco de dados
        try {
            Connection connection = new ConnectionFactory().getConnection();
            if(connection!=null) {
                System.out.println("Connect");
            }
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}*/

        UsuarioDaoJdbc dao = new UsuarioDaoJdbc();

        try {
            if (dao.deletar(new Usuario("joaovictor@gmail.com", "123456"))) {
                JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao salvar usuario");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados");
        }
    }
}
