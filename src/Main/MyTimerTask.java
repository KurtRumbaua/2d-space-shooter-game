/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.TimerTask;
import java.lang.String;
import javax.swing.JOptionPane;

/**
 *
 * @author Ellis
 */
public class MyTimerTask extends TimerTask{
    Menu m;
    Game g;

    public MyTimerTask(Menu m){
        this.m = m;
    }
    
    public void run() {
      if(m.num == 0){
          m.timer.cancel();
          try {
        Game.main(new String[0]);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }
          m.setVisible(false);
      }
      else 
          m.getjLabel3().setVisible(true);
           decrement();
          m.getjLabel3().setText(Integer.toString(m.num));
    }
    
    public void decrement()
    {
        m.num--;
    }
    
}
