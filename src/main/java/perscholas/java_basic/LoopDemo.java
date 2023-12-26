package perscholas.java_basic;

import java.io.*;
import java.util.*;
import java.lang.*;
    public class LoopDemo {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int flagHeight = s.nextInt();
            int bigJump = s.nextInt();

            int result = jumps(flagHeight, bigJump);
            System.out.println(result);


        }
        public static int jumps(int flagHeight, int bigJump) {

            int jumps = 0;
            int currentHeight = 0;

            if(bigJump > flagHeight){
                jumps = flagHeight;
            }
            else{

                do{
                    jumps++;
                    currentHeight += bigJump;

                }while (flagHeight - bigJump >= 0);
                while(currentHeight < flagHeight){
                    currentHeight += 1;
                    jumps++;
                }
            }
            return jumps;
        }
    }
