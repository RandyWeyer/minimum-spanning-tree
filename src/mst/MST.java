/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mst;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Randy_000
 */
public class MST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        JFrame frame = new mst.MSTform();
        frame.setTitle("Minimum Spanning Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
