/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myexception2;

/**
 *
 * @author Bromean
 */
public class Lab5 {

    public static void main(String[] args) {
        System.out.println("Main method call method doThis()");
        try {
            doThis();
        } catch (Exception e) {
            System.out.println("Main method receive exception " + e.getMessage());
        }
    }

    public static void doThis() throws Exception {
        System.out.println("Method doThis() call method doThat()");
        doThat();
    }

    public static void doThat() throws Exception {
        throw new Exception();
    }
}
