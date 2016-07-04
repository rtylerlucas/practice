//Chutes and Ladders
//Positive number in each space -> number of spaces you move
//Array of integers
//Implement a function to determine if that game board winnable
//Winnable = last index of array
// [2,0,-1,1,END] 1-> 1 index (3)
// 0 -> Roll a die [1, 2, 3]

//win if i == array[size-1]

public boolean isWinnable(List<Int> array){

    //iterate array
    //move iteration by the value of index
    //if iteration is > size-1
        //return false
    //if iteration == size-1
        //return true;
    //else
        //iterate
        
        
//looops and array out of bounds negative
    //second array [0 0 1 0 1]
    
    int[] visited = new int[array.size()];
    
    int i = 0;    
    while( i <= (size-1) && (i > 0))
    {
        if( i == (size-1) )
            return true;
              
        else if( visited[i]==1 && array[i]!=0)
            return false;
            
        else if(array[i]==0)
        {
            List<Int> a1 = array.clone();
            List<Int> a2 = array.clone();
            List<Int> a3 = array.clone();
            a1[i] = 1;
            a2[i] = 2;
            a3[i] = 3;
            return (isWinnable(a1) || isWinnable(a2) || isWinnable(a3) ) ;
        }    
        else{
            visited[i] = 1;
            i += array[i];
        }    
    }       
    return false;   
}