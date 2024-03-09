package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        String currentPerson;
        String representation;

        // while `counter` is less than length of array
        while (counter < personArray.length){

            // we take the valueOf counter and make it into a string then assign it to Representation
            representation = String.valueOf(personArray[counter]);

            //Concat that value to the result var we made earlier
            result += representation;


            counter++;
        }

            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        String representation;

        // use the above clauses to declare for-loop signature
            // begin loop
        for (int i = 0; i < personArray.length; i++){

            //Assign the current value of array into a string then put it into representation
            representation = String.valueOf(personArray[i]);

            // assign result to result + current representation
            result += representation;



        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;

    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // in a for each loop (left = index : right = variable you are looping though)
        for (Person currentPerson : personArray){

            // Make the valueOf current interation to a string then assign it to names; ** remember in for each loops
            // the variable you create represents the element of the array no an index.
             String names = String.valueOf(currentPerson);

             //added each interation of names variable to result ""
             result += names;

        }

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
