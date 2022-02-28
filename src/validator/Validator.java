package validator;

import model.*;


public class Validator {

    /**
     * Validator Firstname
     *
     * @param name
     * @return
     */
    public boolean isFirstnameRange(String name) {

        if (name == null) {
            return false;
        }
        return name.length() > 2 && name.length() < 16;
    }

    /**
     * Validator Lastname
     *
     * @param lastname
     * @return
     */
    public boolean isLastnameRange(String lastname) {
        if (lastname == null) {
            return false;
        }

        return lastname.length() > 5 && lastname.length() < 21;
    }

    /**
     * Age range
     *
     * @param age
     * @return
     */
    public boolean isAgeRange(int age) {

        return age >= 18 && age <= 99;
    }

    /**
     * Validator gender
     *
     * @param gender
     * @return
     */
    public boolean isGander(String gender) {

        return (gender != null && (gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female")));
    }

    /**
     * Validator Passport ID
     *
     * @param passportId
     * @return
     */
    public boolean isPassportId(String passportId) {

        if (passportId == null) {
            return false;
        }
        int count = 0;
        if (passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N' && passportId.length() == 8) {
            for (char str : passportId.substring(2).toCharArray()) {
                if (!(str >= '0' && str <= '9')) {
                    return false;
                }
            }
        }
        return true;

    }


    /**
     * Validator Triangle side
     *
     * @param side
     * @return
     */
    public boolean isTriangleSide(int side) {
        return (side < 21 && side > 0);
    }

    /**
     * Valid triangle
     *
     * @param triangle
     * @return
     */
    private boolean isValidTriangle(Triangle triangle) {
        if (triangle.getSideA() + triangle.getSideB() > triangle.getSideC()
                || triangle.getSideA() + triangle.getSideC() > triangle.getSideB()
                || triangle.getSideC() + triangle.getSideB() > triangle.getSideA()
        ) {
            return true;
        }
        return false;
    }

    public boolean check(Triangle triangle) {
        return (triangle != null && isValidTriangle(triangle));

    }

    /**
     * Right Triangle
     *
     * @param triangle
     * @return
     */
    public boolean isRightTriangle(Triangle triangle) {
        int c = Math.max(Math.max(triangle.getSideA(), triangle.getSideB()), triangle.getSideC());
        int a = Math.min(Math.min(triangle.getSideA(), triangle.getSideB()), triangle.getSideC());
        int b = triangle.getSideA() + triangle.getSideB() + triangle.getSideC() - c - a;
        return (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2));
    }


    /**
     * Count of workers range
     * @param countOfWorkers
     * @return
     */
    public boolean isCountOfWorkers(int countOfWorkers) {
        return (countOfWorkers >= 2 && countOfWorkers <= 50);
    }

    /**
     * Name Valid
     * @param name
     * @return
     */
    public boolean isValidName(String name){
        return (name.length() >= 3);
    }

    public boolean isValidPhone(String phone){
        return (phone.length() == 8 && pos(phone));

    }

    private boolean pos(String phone){
        for(char number: phone.toCharArray()){
            if(!((number >= '0')&&(number<='9'))){
                return false;
            }
        }
        return true;
    }


}
