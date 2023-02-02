class fibonacci{
    public static void main(String args[]){

        int givenNumber = 999;
        int myNum;
        int temp;

        int total=0;

        myNum = givenNumber;

        while(myNum != 0){
            temp = myNum % 10;
            total += temp*temp*temp;
            myNum/=10;
        }

        if(total == givenNumber){
            System.out.println("its armstrog number");
        }else{
            System.out.println("Not a armstrong number");
        }
    }
}