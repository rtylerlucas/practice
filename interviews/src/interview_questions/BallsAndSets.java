//can you see me

//two sided balancing scale
//nine balls, identical
//one ball is 3.1 pounds
//eight balls are 3 pounds

Rules:
//two moves to identify which ball is heavy ball
//use scale to identify weight.

//select set, divide set, place on scale. == one move

//first move: take eight balls, split 3/3 on scale.
//narrow down to 3 containing the heavy.
2 contain the heavy

if 3/3 balanced
--- 2 split across scale.
--- if even, take outlier

//second move:
// take 3 

input: n ordered elements -> output: 


// set of n ordered elements
n[1,2,3,4]
// there are m sets
ma[1] mb[1,2] mc[1,2,3] md[1,2,3]

mf = [3]

ma = 1000
mb = 1100
mc = 1110
md = 1110
mf = 0010

ma & mb
ma | mb


// each element can belong to one or more of the m sets
// given the index of an element in the ordered set of n elements, you can get the sets that it belongs to in constant time

// evaluate an expression that consists of any of the m sets either unioned or intersected
// example: m1 [U|I] m3 -> subset of the n elements
*************
// first, create a data structre to support your operation
// then, use an algorithm over that structure to evaluate an expression

// creating the data structure should take O(n * m) time
// evaluation of an expression should take O(n) time

// example of getInclusiveSets:
// getInclusiveSets(3) -> [0, 2, 3]*** contain the value '4'

List<MySet<Integer>> getInclusiveSets(int index)***

class MySet{
    // i values
    //ordered
    ArrayList<Integer> values;
    
}

List< ArrayList <Integer>> constructSets(List<Integer> list){
    ArrayList< ArrayList <Integer>> masterSets = new ArrayList<MySet<Integer>>();
    
    //iterate through list
    for(int i = 0 ; i < list.length();i++{
    
        List<MySet<Integer>> sets = getInclusiveSets(i);
        
        for(MySet set : sets){
            if(masterSets.get()
        }
            //build/add to inclusive set the value of index
            
    }
}