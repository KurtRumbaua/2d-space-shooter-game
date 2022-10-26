/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entities.EntityA;
import Entities.EntityB;
import java.util.LinkedList;

/**
 *
 * @author Ellis
 */
public class Physics {
    
    public static boolean Collision(EntityA entA, EntityB entB){
        if(entA.getBounds().intersects(entB.getBounds())){
                return true;
        } return false;
    }
    
    public static boolean Collision(EntityB entB, EntityA entA){
        if(entB.getBounds().intersects(entA.getBounds())){
                return true;
        } return false;
    }
    
}
