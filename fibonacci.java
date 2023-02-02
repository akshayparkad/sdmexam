class fibonacci{

    public static void main(String args[]){

        int num1=0;
        int num2=1;
        int num3;

        int series = 20;

        System.out.println(num1 + " "+num2);

        for(int i=2; i<series; i++){

            num3 = num1 + num2;

            System.out.println(num3);

            num1= num2;
            num2 = num3;
        }
        
    }
}