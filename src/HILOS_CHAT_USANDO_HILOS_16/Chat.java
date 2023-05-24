package HILOS_CHAT_USANDO_HILOS_16;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String megm1 = "Meg: Hi, there!" + "\n" + "\n";
        String kathyo1 = "Kathy: Hi, Meg!" + "\n" + "\n";
        String megm2 = "Meg: What are you doing?" + "\n" + "\n";
        String kathyo2 = "Kathy: I'm sitting on my bed with my laptop. I'm doing my homework" + "\n" + "\n";
        String megm3 = "Meg: What are you working on?" + "\n" + "\n";
        String kathyo3 = "Kathy: I'm writing an essay for Spanish class, :) Where are you?" + "\n" + "\n";
        String megm4 = "Meg: I'm in a café with my friend Carmen. I'm having cofee, and she's talking on the phone outside. How is your family?" + "\n"  + "\n";
        String kathyo4 = "Kathy: They're all fine! My father's watching a baseball game with his friends. My mother is out shopping" + "\n" + "\n";
        String megm5 = "Meg: Where's your brother?" + "\n" + "\n";
        String kathyo5 = "Kathy: John's playing soccer in the park. Oh, wait. My phone is rining. My mother's calling me. I have to go! Bye!" + "\n" + "\n";
        String megm6 = "Meg: Ok! Bye!" + "\n" + "\n";


        Runner.escribir(megm1, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(kathyo1, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(megm2, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(kathyo2, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(megm3, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(kathyo3, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(megm4, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(kathyo4, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(megm5, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(kathyo5, 150);
        try{
            Thread.sleep(2000); // Duerme durante 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runner.escribir(megm6, 150);
        System.out.println("\n");

        System.out.println("CUESTIONARY");
        System.out.println("Read the conversation. Who is doing these things? Complete the sentences.");
        String pregunta1= "1.............. is writing an essay." + "\n";
        String pregunta2= "2.............. is having coffe." + "\n";
        String pregunta3= "3.............. is talking on the phone." + "\n";
        String pregunta4= "4.............. is watching a baseball game." + "\n";
        String pregunta5= "5.............. is shopping." + "\n";
        String pregunta6= "6.............. is playing soccer." + "\n";
        String respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, respuesta6;

        // PREGUNTA 1
        Runner.escribir(pregunta1, 50);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Answer: ");
        respuesta1=entrada.next();
        if (respuesta1.equals("Kathy")){
            System.out.println(" ✔");
        }
        else {
            System.out.println("The correct answer is: Kathy");
        }

        // PREGUNTA 2
        Runner.escribir(pregunta2, 50);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Answer: ");
        respuesta2=entrada.next();
        if (respuesta2.equals("Meg")){
            System.out.println(" ✔");
        }
        else {
            System.out.println("The correct answer is: Meg");
        }

        // PREGUNTA 3
        Runner.escribir(pregunta3, 50);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Answer: ");
        respuesta3=entrada.next();
        if (respuesta3.equals("Carmen")){
            System.out.println(" ✔");
        }
        else {
            System.out.println("The correct answer is: Carmen");
        }

        // PREGUNTA 4
        Runner.escribir(pregunta4, 50);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Answer: ");
        respuesta4=entrada.nextLine();
        if (respuesta4.equals("My father")){
            System.out.println(" ✔");
        }
        else {
            System.out.println("The correct answer is: My father");
        }

        // PREGUNTA 5
        Runner.escribir(pregunta5, 50);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Answer: ");
        respuesta5=entrada.nextLine();
        if (respuesta5.equals("My mother")){
            System.out.println(" ✔");
        }
        else {
            System.out.println("The correct answer is: My mother");
        }

        // PREGUNTA 6
        Runner.escribir(pregunta6, 50);
        try{
            Thread.sleep(6000); // Duerme durante 6 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Answer: ");
        respuesta6=entrada.next();
        if (respuesta6.equals("John")){
            System.out.println(" ✔");
        }
        else {
            System.out.println("The correct answer is: John");
        }
    }
}
