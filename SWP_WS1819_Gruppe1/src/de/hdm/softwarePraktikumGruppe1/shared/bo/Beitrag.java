/**
 * 
 */
package de.hdm.softwarePraktikumGruppe1.shared.bo;

import java.util.*;

/**
 * @author gianluca
 * Klasse eines Beitrag Objekts das Textbeitrag als Superklasse besitzt
 */
public class Beitrag extends Textbeitrag{
	
	private long serialVersionUID;
	private int ownerId;
	private int likeID;
	private int likeAmount;
	private int commentID;
	private int commentAmount;
	private Pinnwand pinnwand;
	private Vector<Kommentar> kommentare;
	private String text;
	
	/**
	 * Methode die die ID des Users zurueck gibt der den Beitrag verfasst hat
	 */
	public int getOwnerId() {
		return ownerId;
	}
	
	/**
	 * Methode die die ID des Users setzt der den Beitrag verfasst
	 */
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * Methode die die ID der Likes für einen Beitrag zurueck gibt
	 */
	public int getLikeID() {
		return likeID;
	}
	
	/**
	 * Methode die die ID des Likes für einen Beitrag setzt
	 */
	public void setLikeID(int likeID) {
		this.likeID = likeID;
	}
	
	/**
	 * Methode die die Anzahl der Likes für einen Beitrag zurueck gibt
	 */
	public int getLikeAmount() {
		return likeAmount;
	}
	
	/**
	 * Methode die die Anzahl der Likes für einen Beitrag setzt 
	 */
	public void setLikeAmount(int likeAmount) {
		this.likeAmount = likeAmount;
	}
	
	/**
	 * Methode die die ID der Kommentare für einen Beitag zurueck gibt
	 */
	public int getCommentID() {
		return commentID;
	}
	
	/**
	 * Methode die die ID des Kommentars für einen Beitrag setzt
	 */
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	
	/**
	 * Methode die die Anzahl der Kommentare eines Beitrags zurueck gibt
	 */
	public int getCommentAmount() {
		return commentAmount;
	}
	
	/**
	 * Methode die die ANzahl von Kommentaren eines BEitrags setzt
	 */
	public void setCommentAmount(int commentAmount) {
		this.commentAmount = commentAmount;
	}
	
	/**
	 * Methode die die Pinnwand auf der ein Beitrag geteilt wurde zurueck gibt
	 */
	public Pinnwand getPinnwand() {
		return pinnwand;
	}
	
	/**
	 * Methode die die Pinnwand auf der ein Beitrag geteilt werden soll setzt
	 */
	public void setPinnwand(Pinnwand pinnwand) {
		this.pinnwand = pinnwand;
	}
	
	/**
	 * Methode die einen Vector aus Kommentaren eines Beitrags zurueck gibt
	 */
	public Vector<Kommentar> getKommentare() {
		return kommentare;
	}
	
	/**
	 * Methode die einen Vector aus Kommentaren eines Beitrags erstellt
	 */
	public void setKommentare(Vector<Kommentar> kommentare) {
		this.kommentare = kommentare;
	}
	
	/**
	 * Methode die den Text eines Beitrags zurueck gibt
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Methode die den Text eines Beitrags setzt
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * Methode die das Objekt Beitrag als String zurueck gibt
	 */
	public String toString() {
		return null;
	}
	
	
	
	

}
