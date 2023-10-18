package org.main.dbConnection;
import java.sql.*;
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
                * add return value
                * */

            }
            System.out.println(this.getClients());

            //System.out.format("%32s%10d%16s", "string1", 10, "string2");

            super.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //récupérer le client par cin
    public void getClientParCin(String cin){

        if(clients.size() > 0){
        //    return clients.get(cin);
        }


        try{
            super.openConnection();
            String query = "SELECT * FROM client WHERE client.cin=?";
            PreparedStatement prepareStatement = getConnection().prepareStatement(query);
            prepareStatement.setString(1,cin);
            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("nom"));
                //create new user and return it
            }
            super.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //récupérer le client par email
    public void getClientParEmail(String email){

        try{
            if(clients.size() > 0){
                //    return clients.get(cin);
            }


            super.openConnection();
            String query = "SELECT * FROM client WHERE client.email=?";
            PreparedStatement prepareStatement = getConnection().prepareStatement(query);
            prepareStatement.setString(1,email);
            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("nom"));
                //create new user and return it
            }
            super.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //récupérer le client par password
    public void getClientParPassword(String password){

        try{
            if(clients.size() > 0){
                //    return clients.get(cin);
            }


            super.openConnection();
            String query = "SELECT * FROM client WHERE client.password=?";
            PreparedStatement prepareStatement = getConnection().prepareStatement(query);
            prepareStatement.setString(1,password);
            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("nom"));
                //create new user and return it
            }
            super.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //ajouter un client au base de données
    public void saveClient(){
        //add client as input
        try{
            super.openConnection();
            String query = "INSET INTO TABLE client" +
                    "VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = getConnection().prepareStatement(query);
            preparedStatement.setString(1,"cin");
            preparedStatement.setString(2,"nom");
            preparedStatement.setString(3,"prénom");
            preparedStatement.setString(4,"email");
            preparedStatement.setString(5,"tel");
            preparedStatement.setDate(6,new Date(12));
            preparedStatement.setString(7,"permis");
            preparedStatement.setInt(8,123);
            preparedStatement.setString(9,"password");

            preparedStatement.executeUpdate();
            //return client
            super.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //vérifier la validation du compte client
    public boolean isClientValidé (String cin){

        try{
            if(clients.size() > 0){
                return false;//à changer
            }
            super.openConnection();
            String query = "SELECT estvalidé FROM client " +
                    "WHERE client.cin=?";
            PreparedStatement preparedStatement = getConnection().prepareStatement(query);
            preparedStatement.setString(1,cin);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                return resultSet.getBoolean("estvalidé");
            }
            super.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
