public class TimeCompEx {
    public static void main(String[] args) {
        
    }
    public static void doStuff(int sizeOfData){
        boolean condition = true; //assum this condition is false after 5 times 
        for(int i = 0; i<sizeOfData; i++) {//O(n) or O(sizeOfData)
            if(condition){
                i--;
            }
        } //O(n)
    }
    
}
