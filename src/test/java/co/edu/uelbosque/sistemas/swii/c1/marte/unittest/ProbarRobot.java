/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;


import co.edu.uelbosque.sistemas.swii.c1.marte.Robot;
import org.testng.annotations.Test;

/**
 *
 * @author ingeneo
 */
public class ProbarRobot {
    
    
    @Test
    public void probarPosicionInicialRobot(){
    Robot robot = new Robot();
        robot.getX();
        robot.getY();
        robot.Cord();
    
    }
    
}
