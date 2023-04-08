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
				String BDD = "postgres";
				String url = "jdbc:postgresql://localhost:5432/" + BDD;
				//jdbc:postgresql://localhost:5432/sonarqube
				//Suppression de ":3306" dans l' URL après localhost et ajout des paramètres après BDD.
				
				String user = "postgres";
				String passwd = "postgres";

				try {
				    Class.forName("org.postgresql.Driver");
				    
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

