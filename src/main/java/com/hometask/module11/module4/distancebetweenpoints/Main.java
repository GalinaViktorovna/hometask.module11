package com.hometask.module11.module4.distancebetweenpoints;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException, IllegalArgumentException {
        Boolean value = true;
        while (value) {
            try {
                UtilPoint.greetUser();
                String answer = UtilPoint.READER.readLine();
                AnswerEnumClass.ANSWER answerEnum = AnswerEnumClass.ANSWER.valueOf(answer);
                switch (answerEnum) {
                    case YES:
                        System.out.println("Enter points in order x1,x2,y1,y2(enter is delimiter)");
                        Coordinate coordinate = new Coordinate(UtilPoint.dataRead(),UtilPoint.dataRead(),UtilPoint.dataRead(),UtilPoint.dataRead());
                        System.out.println((coordinate.toCalculateDistance()));
                        value = false;
                        break;

                    case NO:
                        System.exit(1);

                }
            } catch (IllegalArgumentException e) {
                System.out.println("Sorry!You enter wrong value!Try again!");
            }
        }
    }
}




