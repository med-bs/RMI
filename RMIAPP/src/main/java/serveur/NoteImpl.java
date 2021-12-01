/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveur;


public class NoteImpl implements NoteInterface {

    @Override
    public double getNote(int etudiantCin, String codeMatiere) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 10 + Math.random() * 10;// valeur aleatoire etre 10 et 20
    }

}
