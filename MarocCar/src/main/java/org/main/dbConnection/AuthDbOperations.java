package org.main.dbConnection;
import org.main.model.Client;

import java.sql.*;
import java.util.HashMap;
import java.util.Objects;

public class AuthDbOperations extends PostgreSQLConnection{
    private HashMap<String, Client> clients;
    public AuthDbOperations() {
        super();
        this.clients = new HashMap<>();
        this.createTableClient();
    }

    //récupérer la liste des clients
    public HashMap<String, Client> getClients() {
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
                    " Prenom           VARCHAR(20)    NOT NULL, " +
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
    public HashMap<String, Client> getToutClient (){
        try{
            super.openConnection();
            Statement statement = getConnection().createStatement();
            String query = "SELECT * FROM client";
            ResultSet resultSet = statement.executeQuery(query);
            Client client = new Client();
            while (resultSet.next()){
                client.setCin(resultSet.getString("CIN"));
                client.setNom(resultSet.getString("NOM"));
                client.setPrenom(resultSet.getString("prenom"));
                client.setEmail(resultSet.getString("email"));
                client.setTel(resultSet.getString("tel"));
                client.setDateNaissance(resultSet.getDate("DateNaissance"));
                client.setPermis(resultSet.getString("permis"));
                client.setCarteBank(resultSet.getInt("carteBank"));
                client.setPassword(resultSet.getString("password"));
                client.setEstValidé(resultSet.getBoolean("EstValidé"));
                this.getClients().put(client.getCin(),client);
            }
            super.closeConnection();
            return this.getClients();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //récupérer le client par cin
    public Client getClientParCin(String cin){
        try{
            if(clients.size() > 0){
                return clients.get(cin);
            }

            super.openConnection();
            String query = "SELECT * FROM client WHERE client.cin=?";
            PreparedStatement prepareStatement = getConnection().prepareStatement(query);
            prepareStatement.setString(1,cin);
            ResultSet resultSet = prepareStatement.executeQuery();
            Client client = new Client();
            while (resultSet.next()){
                client.setCin(resultSet.getString("CIN"));
                client.setNom(resultSet.getString("NOM"));
                client.setPrenom(resultSet.getString("prenom"));
                client.setEmail(resultSet.getString("email"));
                client.setTel(resultSet.getString("tel"));
                client.setDateNaissance(resultSet.getDate("DateNaissance"));
                client.setPermis(resultSet.getString("permis"));
                client.setCarteBank(resultSet.getInt("carteBank"));
                client.setPassword(resultSet.getString("password"));
                client.setEstValidé(resultSet.getBoolean("EstValidé"));
            }
            super.closeConnection();
            return client;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    //récupérer le client par email
    public Client getClientParEmail(String email){

        try{
            if(clients.size() > 0){
                return findClientByEmail(email);
            }

            super.openConnection();
            String query = "SELECT * FROM client WHERE client.email=?";
            PreparedStatement prepareStatement = getConnection().prepareStatement(query);
            prepareStatement.setString(1,email);
            ResultSet resultSet = prepareStatement.executeQuery();
            Client client = new Client();
            while (resultSet.next()){
                client.setCin(resultSet.getString("CIN"));
                client.setNom(resultSet.getString("NOM"));
                client.setPrenom(resultSet.getString("prenom"));
                client.setEmail(resultSet.getString("email"));
                client.setTel(resultSet.getString("tel"));
                client.setDateNaissance(resultSet.getDate("DateNaissance"));
                client.setPermis(resultSet.getString("permis"));
                client.setCarteBank(resultSet.getInt("carteBank"));
                client.setPassword(resultSet.getString("password"));
                client.setEstValidé(resultSet.getBoolean("EstValidé"));
            }
            super.closeConnection();
            return client;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    //récupérer le client par password
    public Client getClientParPassword(String password){

        try{
            if(clients.size() > 0){
                return findClientByPassword(password);
            }


            super.openConnection();
            String query = "SELECT * FROM client WHERE client.password=?";
            PreparedStatement prepareStatement = getConnection().prepareStatement(query);
            prepareStatement.setString(1,password);
            ResultSet resultSet = prepareStatement.executeQuery();
            Client client = new Client();
            while (resultSet.next()) {
                client.setCin(resultSet.getString("CIN"));
                client.setNom(resultSet.getString("NOM"));
                client.setPrenom(resultSet.getString("prenom"));
                client.setEmail(resultSet.getString("email"));
                client.setTel(resultSet.getString("tel"));
                client.setDateNaissance(resultSet.getDate("DateNaissance"));
                client.setPermis(resultSet.getString("permis"));
                client.setCarteBank(resultSet.getInt("carteBank"));
                client.setPassword(resultSet.getString("password"));
                client.setEstValidé(resultSet.getBoolean("EstValidé"));
            }
            super.closeConnection();
            return client;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //ajouter un client au base de données
    public Client saveClient(Client client){
        try{
            super.openConnection();
            String query = "INSET INTO TABLE client" +
                    "VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = getConnection().prepareStatement(query);
            preparedStatement.setString(1,client.getCin());
            preparedStatement.setString(2,client.getNom());
            preparedStatement.setString(3,client.getPrenom());
            preparedStatement.setString(4,client.getEmail());
            preparedStatement.setString(5,client.getTel());
            preparedStatement.setDate(6, (Date) client.getDateNaissance());
            preparedStatement.setString(7,client.getPermis());
            preparedStatement.setInt(8,client.getCarteBank());
            preparedStatement.setString(9,client.getPassword());

            preparedStatement.executeUpdate();
            super.closeConnection();
            return client;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //vérifier la validation du compte client
    public boolean isClientValidé (String cin){

        try{
            if(clients.size() > 0){
                return this.getClients().get(cin).isEstValidé();
            }
            super.openConnection();
            String query = "SELECT estvalidé FROM client " +
                    "WHERE client.cin=?";
            PreparedStatement preparedStatement = getConnection().prepareStatement(query);
            preparedStatement.setString(1,cin);
            ResultSet resultSet = preparedStatement.executeQuery();
            boolean result = false;
            while (resultSet.next()){
                result = resultSet.getBoolean("estvalidé");
            }
            super.closeConnection();
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public Client findClientByEmail(String email){
        for(Client client:this.getClients().values()){
            if(client.getEmail().equals(email))
                return client;
        }
        return null;
    }
    public Client findClientByPassword(String pass){
        for(Client client:this.getClients().values()){
            if(client.getEmail().equals(pass))
                return client;
        }
        return null;
    }
}
