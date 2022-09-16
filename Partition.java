package WeeklyCodingChallenges;

public class Partition {

    public static boolean canPartition(int [] A){
        int result = 0;
        for(int i = 0; i< A.length; i++){

                    result *= A[i];
                    if( i == result){
                        return true;
                    }


        }
        return false;
    }
    
}
