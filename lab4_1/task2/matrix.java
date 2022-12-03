package ru.mirea.lab4_1.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class matrix {
    private ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> new_matrix = new ArrayList<>();

    int math=0;
    public matrix (String file){

        try(FileReader reader = new FileReader(file))
        {
            BufferedReader reader_str = new BufferedReader(reader);
            boolean matrix1=false;
            String c;
            int counter_lines=0;
            int counter_lines2=0;
            while((c= reader_str.readLine())!=null){
                if (c.equals("+"))math=1;
                if(c.equals("*"))math=2;
                if (c.equals("+")==false && c.equals("*")==false&&matrix1==false) {
                    matrix.add(new ArrayList<>());
                    for (int i = 0; i < c.length(); i++) {
                        if (i == c.length() || c.charAt(i) != ' ') {
                            String tmp = "";
                            for (int j = i; j != c.length() && c.charAt(j) != ' '; j++) {
                                if (c.charAt(i) < '0' && c.charAt(i) > '9') {
                                    System.out.println("error1");
                                    return;
                                } else {
                                    tmp = tmp + c.charAt(j);

                                }
                            }
                            matrix.get(counter_lines).add(Integer.parseInt(tmp.trim()));
                            i = i + tmp.length();
                        }

                    }
                    //System.out.print(c+"\n");
                    counter_lines++;
                }
                else {
                    matrix1 = true;
                    if (c.equals("+")==false && c.equals("*")==false) {
                        new_matrix.add(new ArrayList<>());
                        for (int i = 0; i < c.length(); i++) {
                            if (i == c.length() || c.charAt(i) != ' ') {
                                String tmp = "";
                                for (int j = i; j != c.length() && c.charAt(j) != ' '; j++) {
                                    if (c.charAt(i) < '0' && c.charAt(i) > '9') {
                                        System.out.println("error1");
                                        return;
                                    } else {
                                        tmp = tmp + c.charAt(j);

                                    }
                                }
                                new_matrix.get(counter_lines2).add(Integer.parseInt(tmp.trim()));
                                i = i + tmp.length();
                            }

                        }
                        //System.out.print(c+"\n");
                        counter_lines2++;
                    }
                }
            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private void checker(){
        switch (math){
            case (1):
                plus();
                break;
            case (2):
                multi();
                break;
        }
    }

    private void getMatrix(){
        for (int i=0;i<matrix.size();i++){
            for (int j=0;j<matrix.get(i).size();j++){
                System.out.print(matrix.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }
    private void getMatrix2(){
        System.out.println(" ");
        for (int i=0;i<new_matrix.size();i++){
            for (int j=0;j<new_matrix.get(i).size();j++){
                System.out.print(new_matrix.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }

    }
    private void plus() {
        System.out.println( " ");
        if (matrix.size()==new_matrix.size()){
            for (int i=0;i<matrix.size();i++){
                for (int j=0;j<matrix.get(i).size();j++){
                    System.out.print((matrix.get(i).get(j)+new_matrix.get(i).get(j))+" ");
                }
                System.out.println(" ");
            }
        }
        else {
            System.out.println("у матриц разный размер");
        }
    }
    private void multi() {
        System.out.println( " ");
            for (int i=0;i<matrix.size();i++){
                for (int j=0;j<matrix.get(i).size();j++){
                    System.out.print((matrix.get(i).get(j)*new_matrix.get(0).get(0))+" ");
                }
                System.out.println(" ");
            }


    }
    public static void main(String[] args) {
        matrix matrix1= new matrix("C:\\Users\\samso\\Documents\\java\\untitled\\src\\ru\\mirea\\lab4_1\\task2\\matrix.txt") ;
        matrix1.getMatrix();
        matrix1.getMatrix2();
        matrix1.checker();
    }
}

