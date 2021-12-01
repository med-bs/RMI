/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author mohamed
 */
public interface NoteInterface extends Remote{
    double getNote(int etudiantCin, String codeMatiere) throws RemoteException;
}

