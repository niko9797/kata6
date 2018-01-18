/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;
import kata6.model.Person;
import kata6.view.DataBaseList;
import kata6.view.HistogramDisplay;
import kata6.view.HistogramBuilder;
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
    
    private String nameFile;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private List<Mail> listMail;
    
    private Histogram<String> domains;
    private Histogram<Character> letters;
    private HistogramBuilder<Mail> builder;
    
    private List<Person> people;    
    private Histogram<Character> gender;
    private Histogram<Float> weight;



    
    private void execute () throws Exception {
        input();
        process();
        output();
    }
    
    private void input() throws IOException, ClassNotFoundException, SQLException {
        nameFile = "/home/niko/NetBeansProjects/Kata6/src/kata6/controller/emails.txt";
        listMail = MailListReader.read(nameFile);
        people = DataBaseList.read();
        
    }
    
    private void process() throws Exception {
        
            HistogramBuilder<Mail> builder = new HistogramBuilder<>(listMail);
            HistogramBuilder<Person> builderPerson = new HistogramBuilder<>(people); 
            
            domains = builder.build(new Attribute<Mail, String>() {
                @Override
                public String get(Mail item) {
                    return item.getMail().split("@")[1];
                }
            });
        
            letters = builder.build(new Attribute<Mail, Character>() {
                @Override
                public Character get(Mail item) {
                    return item.getMail().charAt(0);
                }
            });
            
            gender = builderPerson.build(new Attribute<Person, Character>() {
                @Override
                public Character get(Person item) {
                    return item.getGender();
                }
            });
        
            weight = builderPerson.build(new Attribute<Person, Float>() {
                @Override
                public Float get(Person item) {
                    return item.getWeight();
                }
            });
    
    }
    
    private void output() {
    new HistogramDisplay(domains, "Domains").execute();
    new HistogramDisplay(letters, "First character").execute();
    new HistogramDisplay(gender, "Gender").execute();
    new HistogramDisplay(weight, "Weight").execute();
    
    
    }
    
}
