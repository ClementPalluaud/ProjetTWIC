package com;



import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectBDD {
    /*
     *  Démmarrage de l'application
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
				String BDD = "projettwic";
				String url = "jdbc:mysql://localhost:3306/" + BDD;
				String user = "root";
				String passwd = "";

				try {
				    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection conn = DriverManager.getConnection(url, user, passwd);
				    System.out.println("Connecter");
				    
				    Statement statement = conn.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM ville_france");

                    // Traitement des résultats
                    while (resultSet.next()) {
                       System.out.println(resultSet.getInt("Code_commune_INSEE") + " " + resultSet.getString("Nom_commune") + " " + resultSet.getString("Code_postal"));
                    }
						
				} catch (Exception e){
				    e.printStackTrace();
				    System.out.println("Erreur");
				    System.exit(0);
				}
				
				
            }
        });
    }

}

