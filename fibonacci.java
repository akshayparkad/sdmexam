class fibonacci{

    public static void main(String args[]){

        int counter;
        int num = 20;
    
        for(int i=2; i<=num; i++){
    
            counter =0;
    
            for(int j=1; j<=i; j++){
    
                if(i%j == 0){
    
                    counter++;
                }
            }
    
            if(counter == 2){
    
                System.out.println(i + " ");
            }
        }
    
    }
}