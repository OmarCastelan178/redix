/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.redix.entidades;

/**
 *
 * @author aleja
 */
public class Reply {
    private Reaction reaction;
    private String description;
    private User user;
     private String replyDate;
     private int timeAgo;
     private String imagen;
    

    public Reaction getReaction() {
        return reaction;
    }

    public void setReaction(Reaction reaction) {
        this.reaction = reaction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRaplyDate() {
        return replyDate;
    }

    public void setRaplyDate(String raplyDate) {
        this.replyDate = raplyDate;
    }

    public int getTimeAgo() {
        return timeAgo;
    }

    public void setTimeAgo(int timeAgo) {
        this.timeAgo = timeAgo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(String replyDate) {
        this.replyDate = replyDate;
    }
}
