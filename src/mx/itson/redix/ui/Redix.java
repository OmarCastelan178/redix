/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.redix.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.redix.entidades.Post;
import mx.itson.redix.entidades.Reaction;
import mx.itson.redix.entidades.Reply;
import mx.itson.redix.entidades.User;

/**
 *
 * @author aleja
 */
public class Redix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       User user= new User();
       user.setName("Omar Castelan");
       user.setNickname("Lokox123");
       user.setEmail("omar.castelan@gmail.com");
       user.setPassword("Omar123");
       
        User user2= new User();
       user2.setName("Roberto Leon");
       user2.setNickname("sombron123");
       user2.setEmail("roberto.leon@gmail.com");
       user2.setPassword("lion123");
       
      
       
       
       Reaction reaction = new Reaction();
       reaction.setLike(1);
       reaction.setDislike(1);
       
       Reaction reaction2 = new Reaction();
       reaction2.setLike(1);
       reaction2.setDislike(3);
       
        Post post= new Post();
       post.setTitle("Las nuevas politicas de Unity, son horribles.");
       post.setDescription(" Apartir de enero Unity comenzara a cobrar 0.20 centavos de dolar"
               + "\npor cada instalacion que tenga el proyecto de cada uno de sus usuarios, tanto "
               + "\nuevos como viejos, ya sean que tengan membresia o no, incusive si el juego es gratis o no da igual ellos seguiran cobrando por instalacion"
               + "\n. Esto a causado que varios desarolladores tengan que sacar sus juegos del mercado, causando asi un gran disgusto a la comunidad en general.");
       post.setImagen("https://i.kym-cdn.com/entries/icons/original/000/046/501/cover2.jpg");
       post.setUser(user);
       post.setDate("18/10/23");
       post.setReaction(reaction);
       post.setTimeAgo(30);
       
        System.out.println("\nUsuario:"+post.getUser().getNickname()+
                "    "+post.getDate()+" Hace:"+post.getTimeAgo()+
                "\n"+post.getTitle()+"\n"+post.getDescription()+"\n"+post.getImagen()+
                "\nLike:"+post.getReaction().getLike()+" Dislike:"+post.getReaction().getDislike()+"M");
        System.out.println("Ver respuestas a este post.");
        String  showReply= scanner.nextLine();
        
        if(showReply.equals("si")){
            Reply reply= new Reply();
            reply.setUser(user2);
            reply.setReaction(reaction2);
            reply.setDescription("Como perder mas del 60% en tan solo un dia, grande Unity");
            reply.setRaplyDate("18/10/23");
            reply.setTimeAgo(10);
            reply.setImagen("https://p19-sign.tiktokcdn-us.com/tos-useast5-p-0068-tx/oY1bDxNzSEEkRylEyMi9YAGyDBCAQhfXfBC2Ig~tplv-photomode-zoomcover:720:720.jpeg?x-expires=1697673600&x-signature=0T7J%2BNpxD6%2BbwAkGcZaSSOsG7v8%3D");
            System.out.println(reply.getUser().getNickname()+
                    "   "+reply.getRaplyDate()+"  Hace:"+reply.getTimeAgo()+" minutos"+
                    "\n"+reply.getDescription()+"\n"+reply.getImagen()+
                    "\nLike:"+reply.getReaction().getLike()+"M"+
                    " Dislike:"+reply.getReaction().getDislike());   
        }
        else{
            System.out.println("Okey.si");
        }
       
    }
    
}
