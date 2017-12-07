/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class Buffer {

    private static final int maxSize = 10;
    private static ArrayList<Command> commandQueue = new ArrayList<Command>();

    //M�todo synchronized: garantir� que apenas uma thread de cada vez acesse tal m�todo.
    //Se outras threads tentarem fazer o mesmo, elas ser�o colocadas em espera at� que
    //a thread atual finalize seu trabalho e libere o m�todo.
    public synchronized void placeCommand(Command c) {

        while (commandQueue.size() == maxSize) {
            try {
                System.out.println(">>>>>>> Cliente dormiu...buffer cheio <<<<<<<<<");
                wait(); //coloca o thread que est� acessando esta �rea para dormir
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        commandQueue.add(c);
        System.out.println("Carga do Buffer: " + commandQueue.size());
        notifyAll(); //"acorda" todos os threads que est�o em wait neste objeto
    }

    public synchronized Command get(int i) {
        Command c = null;
        while (commandQueue.size() == 0) {
            try {
                System.out.println(">>>>>> Agent dormiu...buffer vazio <<<<<<<<");
                wait();

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        c = commandQueue.get(i);
        commandQueue.remove(i);
        notifyAll();
        return c;
    }
}
