package com.company.controller;

import com.company.model.ConvertHex;
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
     * object of Convert16 class.
     */
    private ConvertHex convertHex;

    /**
     * Controller constructor making new instances of operations class.
     */
    @Contract(pure = true)
    public Controller() {
        this.operations = new Operations(this);
        this.convertHex = new ConvertHex();
    }

    /**
     * @return information about the usage of addition sign.
     */
    public boolean isAddFlag() {
        return this.operations.isAddFlag();
    }

    /**
     * @return information about the usage of subtraction sign.
     */
    public boolean isSubFlag() {
        return this.operations.isSubFlag();
    }

    /**
     * @return information about the usage of division sign.
     */
    public boolean isDivFlag() {
        return this.operations.isDivFlag();
    }

    /**
     * @return information about the usage of multiply sign.
     */
    public boolean isMulFlag() {
        return this.operations.isMulFlag();
    }

    /**
     * Changes the state of the AddFlag.
     */
    public void changeAddFlag() {
        this.operations.changeAddFlag();
    }

    /**
     * Changes the state of the SubFlag.
     */
    public void changeSubFlag() {
        this.operations.changeSubFlag();
    }

    /**
     * Changes the state of the DivFlag.
     */
    public void changeDivFlag() {
        this.operations.changeDivFlag();
    }

    /**
     * Changes the state of the MulFlag.
     */
    public void changeMulFlag() {
        this.operations.changeMulFlag();
    }

    /**
     * @param newNumber is a number inserted before using equal sign.
     * @return result of the operation.
     */
    public double makeEqual(double newNumber) {
        return this.operations.makeEqual(newNumber);
    }

    /**
     * Clears all operations and stored number.
     */
    public void clear() {
        this.operations.clear();
    }

    /**
     * Sets stored number value.
     */
    public void setLastNumber(double lastNumber) {
        this.operations.setLastNumber(lastNumber);
    }

    /**
     * @param number is a number that will be converted to hexagonal system.
     * @return number in a hexagonal system as a String.
     */
    public String convertToHex(double number) {
        return this.convertHex.toHex(number);
    }

    /**
     * @param number is a number that will be converted to decimal system.
     * @return number in a decimal system as a double.
     */
    public double convertToDec(String number) {
        return this.convertHex.toDec(number);
    }
}
