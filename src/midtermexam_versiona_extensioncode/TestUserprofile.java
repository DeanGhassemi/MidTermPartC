/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author deang
 */
public class TestUserprofile {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("What is your favourite genre from these?");
        System.out.println("Comedy, Drama, Action, Mystery");
        String genre = input.next();
        UserProfile user = new UserProfile(name, genre);
        System.out.println("The user profile was created");
    }
}
