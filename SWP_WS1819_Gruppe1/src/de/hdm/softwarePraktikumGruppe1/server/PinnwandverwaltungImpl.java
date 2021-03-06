/**
 * 
 */
package de.hdm.softwarePraktikumGruppe1.server;

import java.util.ArrayList;

import de.hdm.softwarePraktikumGruppe1.server.db.*;
import de.hdm.softwarePraktikumGruppe1.shared.Pinnwandverwaltung;
import de.hdm.softwarePraktikumGruppe1.shared.bo.*;

/**
 * @author gianluca
 * Klasse die das Interface Pinnwandverwaltung Implementiert und das RemoteServiceServlet als Superklasse besitzt
 */
public class PinnwandverwaltungImpl extends RemoteServiceServlet implements Pinnwandverwaltung{
	
	private UserMapper uMapper;
	private PinnwandMapper pMapper;
	private BeitragMapper bMapper;
	private KommentarMapper kMapper;
	private LikeMapper lMapper;
	private AbonnementMapper aMapper;
	
	/**
	 * Konstruktor der Klasse PinnwandverwaltungIMpl der bei jedem erzeugten Objekt dieser Klasse ausfgerufen wird
	 */
	public PinnwandverwaltungImpl() {
		
	}
	
	/**
	 * Methode die alle User als ArrayList zurueck gibt
	 */
	public ArrayList<User> showAllUser(){
		return null;
	}
	
	/**
	 * Methode um einen User zu erzeugen
	 */
	public void createUser() {
	}
	
	/**
	 * Methode um einen User zu Bearbeiten
	 */
	public void editUser() {
	}
	
	/**
	 * Methode um einen User zu Loeschen
	 */
	public void deleteUser() {
	}
	
	/**
	 * Methode zur Ueberpruefung der Zugangsberechtigung 
	 */
	public User loginCheck(String nickname, String password) {
		return null;
	}
	
	/**
	 * Methode um einen User anhand seiner ID zu suchen
	 */
	public User searchUserById(int userId) {
		return null;
	}
	
	/**
	 * Methode um einen User upzudaten
	 */
	public User updateUser(User u) {
		return null;
	}
	
	/**
	 * Methode um einen User anhand seines Nicknamens zu suchen
	 */
	public User  searchUserByNickname(String nickname) {
		return null;
	}
	
	/**
	 * Methode um einen Beitrag zu erzeugen
	 */
	public void createBeitrag(String inhalt) {
	}
	
	/**
	 * Methode um alle Beiträge eines Users auszugeben
	 */
	public ArrayList<Beitrag> findAllBeitraegeOfUser(User u){
		return null;
	}
	
	/**
	 * Methode um einen Beitrag zu Loeschen
	 */
	public void deleteBeitrag(Beitrag b) {
	}
	
	/**
	 * Methode um einen Beitrag zu Bearbeiten
	 */
	public Beitrag editBeitrag(Beitrag b) {
		return null;
	}
	
	/**
	 * Methode um alle Abonnements eines Users anzuzeigen
	 */
	public ArrayList<Abonnement> showAllAbonnementsByUser(User u){
		return null;
	}
	
	/**
	 * Methode um ein neues Abonnement zu erzeugen
	 */
	public void creatAbonnement(User u1, User u2) {
	}
	
	/**
	 * Methode um ein bestehendes Abonnement zu Loeschen
	 */
	public void deleteAbonnement(Abonnement a) {
	}
	
	/**
	 * Methode um einen neues Kommentar zu erzeugen
	 */
	public void createKommentar(String inhalt) {
	}
	
	/**
	 * Methode zum Loeschen eines Kommentars
	 */
	public void deleteKommentar(Kommentar k) {
	}
	
	/**
	 * Methode zum anzeigen aller Kommentare
	 */
	public ArrayList<Kommentar> findAllKommentare(Beitrag b){
		return null;
	}
	
	/**
	 * Methode zum Bearbeiten eines Kommentars
	 */
	public Kommentar editKommentar(Kommentar k) {
		return null;
	}
	
	/**
	 * Methode zum erzeugen eines Likes
	 */
	public void createLike(Like l, Beitrag b) {
	}
	
	/**
	 * Methode zur Ueberpruefung ob der Beitrag bereits geliket ist
	 */
	public boolean likeCheck(User u, Beitrag b) {
		return true;
	}
	
	/**
	 * Methode um einen Beitrag zu entliken
	 */
	public void deleteLike(Like l) {
	}
	
	/**
	 * Methode um ein Like zu suchen
	 */
	public Like searchLike(Like l) {
		return null;
	}
	
	/**
	 * Methode um alle Likes eines Beitrags zu zaehlen
	 */
	public int countLikes(Beitrag b) {
		return null;
	}
	
	/**
	 * Methode um Likes eines Beitrags zu entfernen
	 */
	public void deleteLikesOfBeitrag(Beitrag b) {

	}
	
	
}

	
	
	
	
	
	
	

