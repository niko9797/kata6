/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.controller;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author Entrar
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        Kata4 kata4 = new Kata4();
        kata4.execute();
        
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
        filename = "/home/niko/NetBeansProjects/Kata4/src/kata4/controller/emails.txt";
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
