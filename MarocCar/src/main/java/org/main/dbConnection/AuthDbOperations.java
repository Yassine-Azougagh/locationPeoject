package org.main.dbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Objects;

public class AuthDbOperations extends PostgreSQLConnection{
    private HashMap<String, Object> clients;
    public AuthDbOperations() {
        super();
        this.clients = new HashMap<>();
        this.createTableClient();
    }

    //récupérer la liste des clients
    public HashMap<String, Object> getClients() {
        return clients;
    }

    //créer la table client dans la base de données s'elle n'existe pas
    private void createTableClient(){
        try{
            openConnection();
            Statement statement = getConnection().createStatement();
            String query = "CREATE TABLE IF NOT EXISTS Client " +
                    "(CIN VARCHAR(10) PRIMARY KEY     NOT NULL," +
                    " Nom           VARCHAR(20)    NOT NULL, " +
                    " Prénom           VARCHAR(20)    NOT NULL, " +
                    " Email           VARCHAR(20)    NOT NULL, " +
                    " Tel           VARCHAR(20)    NOT NULL, " +
                    " Permis           VARCHAR(10)    NOT NULL, " +
                    " CarteBank           INT    NOT NULL, " +
                    " DateNaissance           Date    NOT NULL, " +
                    " Password           VARCHAR(20)    NOT NULL, " +

                    " EstValidé BOOLEAN DEFAULT false)";

            statement.executeUpdate(query);
            statement.close();
            closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Table Client est crée en succés");

    }

    //récupérer la liste des clients de la base de données
    public void getToutClient (){
        try{
            super.openConnection();
            Statement statement = getConnection().createStatement();
            String query = "SELECT * FROM client";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                this.getClients().put("CIN",resultSet.getString("CIN"));
                /*
                * create a client dto
                * add infos
                * put it in clients map <key = CIN, value = clientDto>
                * */

            }
            System.out.println(this.getClients());

            //System.out.format("%32s%10d%16s", "string1", 10, "string2");

            super.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
