package com.company.controller;

import com.company.model.Operations;
import org.jetbrains.annotations.Contract;

/**
 * Controller class is used for managing model and view.
 */
public class Controller {

    /**
     * object of Operations class.
     */
    private Operations operations;

    /**
     * Controller constructor making new instances of operations class.
     */
    @Contract(pure = true)
    public Controller() {
        this.operations = new Operations(this);
    }

    /**
     * @return information about the usage of addition sign.
     */
    public boolean isAddFlag() {
        return operations.isAddFlag();
    }

    /**
     * @return information about the usage of subtraction sign.
     */
    public boolean isSubFlag() {
        return operations.isSubFlag();
    }

    /**
     * @return information about the usage of division sign.
     */
    public boolean isDivFlag() {
        return operations.isDivFlag();
    }

    /**
     * @return information about the usage of multiply sign.
     */
    public boolean isMulFlag() {
        return operations.isMulFlag();
    }

    /**
     * @return result of the operation.
     * @param newNumber is a number inserted before using equal sign.
     */
    public double makeEqual(double newNumber){
        return operations.makeEqual(newNumber);
    }

    public void clear(){
        this.operations.clear();
    }
}
