package com.company.model;

import com.company.controller.Controller;
import org.jetbrains.annotations.Contract;

/**
 * Operations class is used for all the operations in the calculator.
 */
public class Operations {
    /**
     * Variable created for determining whether the addition sign is being used.
     */
    private boolean addFlag;
    /**
     * Variable created for determining whether the subtraction sign is being used.
     */
    private boolean subFlag;
    /**
     * Variable created for determining whether the division sign is being used.
     */
    private boolean divFlag;
    /**
     * Variable created for determining  whether the mulltiplication sign is being used.
     */
    private boolean mulFlag;

    /**
     * Variable created for storing number inserted before usage of any signs.
     */
    private double lastNumber;

    /**
     * Object of the Controller class;
     */
    private Controller controller;

    /**
     * Constructor of Operations class that initializes all flags to false and stored number to 0.
     *
     * @param controller abject of controller class
     */
    @Contract(pure = true)
    public Operations(Controller controller) {
        this.addFlag = false;
        this.subFlag = false;
        this.divFlag = false;
        this.mulFlag = false;
        this.lastNumber = 0;
        this.controller = controller;
    }

    /**
     * @return information about the usage of addition sign.
     */
    public boolean isAddFlag() {
        return this.addFlag;
    }

    /**
     * @return information about the usage of subtraction sign.
     */
    public boolean isSubFlag() {
        return this.subFlag;
    }

    /**
     * @return information about the usage of division sign.
     */
    public boolean isDivFlag() {
        return this.divFlag;
    }

    /**
     * @return information about the usage of multiply sign.
     */
    public boolean isMulFlag() {
        return this.mulFlag;
    }

    /**
     * Changes status of addition flag.
     */
    public void changeAddFlag() {
        this.addFlag = !this.addFlag;
        this.subFlag = false;
        this.divFlag = false;
        this.mulFlag = false;
    }

    /**
     * Changes status of subtraction flag.
     */
    public void changeSubFlag() {
        this.subFlag = !this.subFlag;
        this.addFlag = false;
        this.divFlag = false;
        this.mulFlag = false;
    }

    /**
     * Changes status of division flag.
     */
    public void changeDivFlag() {
        this.divFlag = !this.divFlag;
        this.addFlag = false;
        this.subFlag = false;
        this.mulFlag = false;
    }

    /**
     * Changes status of multiply flag.
     */
    public void changeMulFlag() {
        this.mulFlag = !this.mulFlag;
        this.addFlag = false;
        this.subFlag = false;
        this.divFlag = false;

    }

    /**
     * Sets the stored number.
     *
     * @param lastNumber is the last number before usage of signs.
     */
    public void setLastNumber(double lastNumber) {
        this.lastNumber = lastNumber;
    }

    /**
     * Performs the addition.
     *
     * @param newNumber is the number put after addition sign.
     */
    public double makeAddition(double newNumber) {
        if (isAddFlag()) {
            return this.lastNumber + newNumber;
        }
        return Math.PI;
    }

    /**
     * Performs the subtraction.
     *
     * @param newNumber is the number put after subtraction sign.
     */
    public double makeSubtraction(double newNumber) {
        if (isSubFlag()) {
            return this.lastNumber - newNumber;
        }
        return Math.PI;
    }

    /**
     * Performs the multiplication.
     *
     * @param newNumber is the number put after multiplication sign.
     */
    public double makeMultiplication(double newNumber) {
        if (isMulFlag()) {
            return this.lastNumber * newNumber;
        }
        return Math.PI;
    }

    /**
     * Performs the division.
     *
     * @param newNumber is the number put after division sign.
     */
    public double makeDivision(double newNumber) {
        if (isDivFlag() && newNumber != 0) {
            return this.lastNumber / newNumber;
        } else {
            return Math.PI;
        }
    }

    /**
     * Initializes proper operations.
     *
     * @param newNumber is the number put before equal sign.
     */
    public double makeEqual(double newNumber) {
        if (isAddFlag()) {
            return makeAddition(newNumber);
        } else if (isSubFlag()) {
            return makeSubtraction(newNumber);
        } else if (isMulFlag()) {
            return makeMultiplication(newNumber);
        } else if (isDivFlag()) {
            return makeDivision(newNumber);
        }
        return Math.PI;
    }

    /**
     * Clears every flag and stored number.
     */
    public void clear() {
        this.subFlag = false;
        this.addFlag = false;
        this.divFlag = false;
        this.mulFlag = false;
        this.lastNumber = 0;
    }


}
