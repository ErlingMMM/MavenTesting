







    public class RomanNumbersTestErling {


        StringBuilder romanNumbers = new StringBuilder("");

       public String toRoman(int number) {

            if (number == 4){
                return romanNumbers.append("IV").toString();
            }
            if (number == 5){
                return romanNumbers.append("V").toString();
            }

            if (number == 9){
                return romanNumbers.append("IX").toString();
            }

            if (number == 10){
                return romanNumbers.append("X").toString();
            }


            int tens = (number/10)%10;

            if (number > 10){
                for (int i = 0; i < tens; i++) {
                    romanNumbers.append("X");
                    //number -= 10;
                }
                number -= 10*tens;
            }
            if (number > 5 ){
                romanNumbers.append("V");
                number -= 5;
            }

            return loopOneTwoTree(number).toString();

        }






        public StringBuilder loopOneTwoTree(int number){

            for (int i = 0; i < number; i++) {

                romanNumbers.append("I");
            }
            return romanNumbers;
        }

    }

