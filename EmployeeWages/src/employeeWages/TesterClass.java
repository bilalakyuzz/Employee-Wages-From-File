/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeWages;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TesterClass {
    public static void main(String[] args) {
        Stack stack=new Stack(); //gerekli parametreler  
        String AdSoyad,TCKimlikNo;
        int producedPieces, moneyPerPiece,workHours,wage; 
        Scanner fileIn = null;
        try {//dosya okuma 
            fileIn = new Scanner(new File("EmployeeWages/bilgiler.txt"));
            
        } catch (Exception e) {
            System.out.println("Dosya okunamadı:" + e.getMessage());
            System.exit(0);
        }

        
        while (fileIn.hasNextLine()) {//dosya bitene kadar dolaşıyoruz.
      
            if(fileIn.next().equals("piece")){//equals methodu ile if else koşullarına giriyoruz.
                AdSoyad=fileIn.next()+" "+fileIn.next();//parametreleri atıyoruz.
                TCKimlikNo=fileIn.next();
                producedPieces=fileIn.nextInt();
                moneyPerPiece=fileIn.nextInt();
                
                PieceWorker pieceWorker=new PieceWorker(AdSoyad,TCKimlikNo,producedPieces,moneyPerPiece);//pieceworker tipinde parametre oluşturuyoruz.
                stack.push(pieceWorker);//yığıta ekliyoruz.
                System.out.println(pieceWorker.toString());//ekrana yazdırıyoruz.
            }else{
                AdSoyad=fileIn.next()+" "+fileIn.next();//parametreleri atıyoruz.
                TCKimlikNo=fileIn.next();
                workHours=fileIn.nextInt();
                wage=fileIn.nextInt();
                HourlyEmployee hourlyEmployee=new HourlyEmployee(AdSoyad,TCKimlikNo,workHours,wage);
                stack.push(hourlyEmployee);//yığıta ekliyoruz.
                System.out.println(hourlyEmployee.toString());//ekrana yazdırıyoruz.
                
            }
        
    }
        System.out.println("-----------------------------");
        stack.display();//bütün liisteyi yazdırıyoruz.
        fileIn.close();//listeyi kapatıyoruz.
    
}}
