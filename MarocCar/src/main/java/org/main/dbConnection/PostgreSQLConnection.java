package org.main.dbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
public abstract class PostgreSQLConnection {

    private final String url = "jdbc:postgresql://localhost:5432/MarocCar";
    private final String username = "maroccaruser";
    private final String password = "password";
    private Connection connection;

    //Ouvrir une connection avec la base de données dans PostgresSql
    public void openConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //récupérer la connection afin de l'utiliser pour executer les requêtes
    public Connection getConnection() {
        return connection;
    }

    //fermer la connection et libérer les ressources
    public void closeConnection(){
        try{
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
