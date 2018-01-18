/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.controller;

import java.io.IOException;
import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;
import kata6.view.HistogramDisplay;
import kata6.view.MailHistogramBuilder;
import kata6.view.MailListReader;

/**
 *
 * @author Entrar
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        Kata6 kata6 = new Kata6();
        kata6.execute();
        
    }
    
    private String filename;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    
    private void execute () throws Exception {
        input();
        process();
        output();
    }
    
    private void input() throws IOException {
        filename = "/home/niko/NetBeansProjects/Kata6/src/kata6/controller/emails.txt";
        mailList = MailListReader.read(filename);
    }
    
    private void process() throws Exception {
        histogram = MailHistogramBuilder.build(mailList);
    
    }
    
    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    
    
    }
    
}
