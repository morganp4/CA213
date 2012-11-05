/**
 * The following program is based of the first CA213 continuous exam.
 * It is wrote from memory so it may have a few errors, but it is mostly
 * the same.
 *
 * The exam required you to:
 * 1) Create a interface Printable with method put.
 * 2) Modify the given Date class to implement Printable and to have a put
 *    method
 * 3) Create a program, PastDates which reads in dates from the console. Stores
 *    Them using the given bounded stack class. Finally it should output the
 *    Days that are less than today.
 * 4) Modify the stack class to use dynamic arrays so that it is unbounded
 */

import java.util.*;

interface Printable {
    void put();
}

class Date implements Printable {
    private int day, month, year;

    /**
     * Creates an empty date
     */
    Date() {
    }

    /**
     * Creates a date based on the given parameters
     *
     * @param d the day
     * @param m the month
     * @param y the year
     */
    Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    /**
     * Reads a day month and year from the keyboard
     */
    void get() {
        day = Console.readInt();
        month = Console.readInt();
        year = Console.readInt();
    }

    /**
     * Checks if this date is less than or equal to another date
     *
     * @param other a date to be compared with
     * @return true if this is less than or equal to other date
     */
    boolean lte(Date other) {
        if(year < other.year) {
            return true;
        } else if((month < other.month) && (year <= other.year)) {
            return true;
        } else if((day < other.day) && (month <= other.month) &&
                  (year <= other.year)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Prints out this date
     */
    public void put() {
        System.out.println(day + " " + month + " " + year);
    }
}

class Stack<T> {
    @SuppressWarnings("unchecked")
    private T[] seq = (T[])(new Object[1]);
    private int size = 0;

    /**
     * Checks if the stack is empty
     *
     * @return true if stack is empty
     **/
    boolean isEmpty() {
        return (size==0);
    }

    /**
     * Pushes an item onto the stack
     *
     * @param item the item you want to place onto the stack
     * @return true if item was successfully placed onto the stack
     **/
    boolean push(T item) {
        if(size==seq.length) {
            @SuppressWarnings("unchecked")
            T[] seqNew = (T[])(new Object[size*2]);
            for(int i=0; i<size; i++) {
                seqNew[i] = seq[i];
            }
            seq = seqNew;
        }
        seq[size] = item;
        size++;
        return true;
    }

    /**
     * Removes an item from the stack
     *
     * @return The item or null if the stack is empty
     **/
    T pop() {
        if(isEmpty()) {
            return null;
        } else {
            size--;
            return seq[size];
        }
    }
}

class PastDates {
    public static void main(String[] args) {
        Stack<Printable> dates = new Stack<Printable>();

        GregorianCalendar c = new GregorianCalendar();
        int day = c.get(GregorianCalendar.DAY_OF_MONTH);
        int month = c.get(GregorianCalendar.MONTH)+1;
        int year = c.get(GregorianCalendar.YEAR);
        Date today = new Date(day,month,year);

        //today.put();

        while(!Console.endOfFile()) {
            Date temp = new Date();
            temp.get();
            dates.push(temp);
        }

        while(!dates.isEmpty()) {
            Date temp = (Date) dates.pop();
            if(temp.lte(today)) {
                temp.put();
            }
        }

    }
}