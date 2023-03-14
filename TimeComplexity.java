public class TimeComplexity{
    //with time complexity +/ - / * / / are all canceled --> O(n)
    //but log and exponents don't get canceled
    
    //4 different kinds of time complexity
    /*Constant
    Linear
    Exponential
    Logarithmic*/
    public static void main(String[] args) {
        constant();
        linear(5);

        
    }
    public static void constant(){ //concrete number to know how many times the program runs
        for(int i = 0; i<6; i++){
            System.out.println(i);
        }   
    }
    public static void linear(int n){ //not a conrete number, the complexity of the algorithm depends on the input
        for(int i = 0; i<n; i++){ //this code is O(n)
            System.out.println(i); //this code runs n times 
        }

        //the code below runs O(2n) times but the time complexity is still O(n)
        for(int i = 0; i<n; i++){ //this code is O(n)
            System.out.println(i); //this code runs n times 
        }
        for(int i = 0; i<n; i++){ //this code is O(n)
            System.out.println(i); //this code runs n times 
        }
    }
    public static void exponential(int n){
        //"literal" way, uncommon, but good to help understnad
        /*for(int i = 0; i<n*n; i++){ //this code is O(n)
            System.out.println(i); //this code runs n times 
        }*/
        for(int i = 0; i<n; i++){ //this code is O(n^2)
            for(int j = 0; j<n; j++){
                System.out.println(i); //this code runs n times (inner for loop)
            }
        }
    }
    public static void logarithmic(int n){
        //log(1) would be called 0 times
        //log(2) would be called 1 time
        //log(4) woul be called 2 times
        //log(8) would be called 3 times

        //this gives us the equation:
        //2^numOfIterations = inputSize
        //hence, numOfIterations = log_2(inputSize)
        for(int i = 1; i<n; i*=2){

        }
    }
    
    
}