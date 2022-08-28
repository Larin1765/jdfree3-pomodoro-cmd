package com.pack;

import java.util.Scanner;

public class pomodoroTimer {
    public static void main(String[] args) {
        System.out.println("Введите время работы и отдыха");
        //[-w , 1 , -b , 1 ]
       var cmd = new Scanner(System.in).nextLine().split("");
       int workTime=1;
       int breakTime=1;
       boolean isHelp=false;
       for (int i=0; i<cmd.length;i++){
           switch (cmd[i]) {
               case "-w" -> workTime = Integer.parseInt(cmd[++i]);
               case "-b" -> breakTime = Integer.parseInt(cmd[++i]);
               case "--help" -> {
                   System.out.println("""
                           \nPomodoro -это приложение для улучшения личной эффективности
                           -w - сколько работать
                           -b -сколько отдыхать
                           --help -вызвать помощь
                           """);
                   isHelp = true;
               }
           }

       }
       if (isHelp) return;
       long startTime=System.currentTimeMillis();
       // time
        long endTime=System.currentTimeMillis();
        System.out.println("Таймер работал" +(endTime - startTime/1000*60)+"минут");

    }
    public static void timer(){

    }
}
