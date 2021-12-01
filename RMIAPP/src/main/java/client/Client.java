/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

//import java.rmi.RMISecurityManager;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import serveur.NoteInterface;

/**
 *
 * @author mohamed
 */
public class Client {

    public static void main(String[] args) {
        try {
            /* if (System.getSecurityManager() == null) {
                System.setSecurityManager(new RMISecurityManager());
            }*/
            int port = 1099;
            String url = "rmi://localhost:" + port + "/note";
            NoteInterface note = (NoteInterface) Naming.lookup(url);
            System.out.println("client connect...");
            System.out.println("Note renvoyee = " + note.getNote(1, "h22"));
        } catch (MalformedURLException | NotBoundException | RemoteException ex) {
            System.out.println("erreur !!!!!!\n\n" + ex.getMessage());
        }
        System.out.println("Fin du client");
    }
}
