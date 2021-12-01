/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveur;

//import java.rmi.RMISecurityManager;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author mohamed
 */
public class Serveur {

    public static void main(String[] args) {
        try {
            /* if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
            }*/
            int port=1099;
            LocateRegistry.createRegistry(port);
            NoteImpl n = new NoteImpl();
            Remote obj = UnicastRemoteObject.exportObject(n, port);
            String url="rmi://localhost:"+port+"/note";
            Naming.rebind(url, obj);
            System.out.println("serveur start...");
        } catch (MalformedURLException | RemoteException ex) {
            //Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur !!!!!!\n\n"+ex.getMessage());
        }

    }
}
