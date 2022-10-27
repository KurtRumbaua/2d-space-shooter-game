/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Entities.EntityA;
import Entities.EntityB;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import Main.Animation;
import static Main.Game.HEALTH;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Ellis
 */
public class Player extends GameObject implements EntityA{

    private Textures tex;
    Game game;
    Controller c;
    Animation anim;
    Menu menu;
    
    public Player(double x, double y, Textures tex, Game game, Controller c){
        super(x, y);
        this.tex = tex;
        this.game = game;
        this.c = c;
        
        anim = new Animation(2, tex.player[0], tex.player[1], tex.player[2]);
    }
    public Rectangle getBounds(){
        return new Rectangle((int)x, (int) y, 32, 32);
    }
    
    public void tick(){
        
        for(int i = 0; i < game.eB.size(); i++){
            EntityB tempEnt = game.eB.get(i);
            
            if(Physics.Collision(this, tempEnt)){
                c.removeEntity(tempEnt);
                game.HEALTH -= 20;
                game.setEnemy_killed(game.getEnemy_killed()+1);
                
                if(game.HEALTH == 0){
                    
                    int result = JOptionPane.showConfirmDialog(null, "You died! Do you want to play again? \n Total Killed: " + game.getEnemy_killed(),"Retry", JOptionPane.YES_NO_OPTION);
                    
                    if(result == 0){
                        try {
                        game.HEALTH += 200;
                        game.setEnemy_killed(0);
                        game.setEnemy_count(5);
                        game.run();
                        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        }
                    }
                    else{
                        
                       System.exit(HEALTH);
                        
                    }
                        
                }
            }
        }
        
        anim.runAnimation();
    }
    
    public void render(Graphics g){
        anim.drawAnimation(g, x, y, 0);
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
}
