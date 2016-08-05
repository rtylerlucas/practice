package phone_screens;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * Complete the function below.
 *
 *
 * We are given a list of strings of friendship booleans
 *
 * We need to identify all 'circles'.
 *
 * A Friend is a position in the matrix, represented by an int, starting with 0
 *
 * A Circle is a set of friends (int positions).
 *
 * A lonely circle includes an individual with no connections but himself/herself.
 * A multi-circle includes any friend who has a connection.
 *
 *
 * We will return the number of unique circleSets.
 *
 * We will build the unique circleSets by iterating across the matrix.
 * Basecase [i][i] == Y, lonely circle. We will start with all lonely circles.
 * As we find positive relationships, we will merge sets containing those individuals.
 * We will return the count of our final circleSets.
 *
 * We will have a map of friendexes pointing to the set they belong to for fast lookup.
 */
public class FriendCircles {
    public static int friendCircles(String[] friends) {
        HashMap<Integer, HashSet<Integer>> setMap = new HashMap<>();

        loadSetup(friends, setMap);

        //iterate, if we find a relationship, merge sets and update map.
        for(int r = 0; r < friends.length; r++) {
            for(int c = 0; c < friends[r].length(); c++) {
                if( friends[r].charAt(c)=='Y' && r != c) {
                    mergeSets(r,c, setMap); // merge the two sets containing friend r and friend c
                }
            }
        }
        HashSet<HashSet<Integer>> res = new HashSet<>();
        for(HashSet<Integer> set: setMap.values()){
            res.add(set);
        }

        return res.size();



    }

    private static void mergeSets(int i, int j, Map<Integer, HashSet<Integer>> setMap) {
        //look up the sets in the hashTable by the index. addAll
        HashSet<Integer> friendCircleOne = setMap.get(i);
        friendCircleOne.addAll(setMap.get(j));
        setMap.put(j, friendCircleOne);

    }

    private static void loadSetup(String[] friends, Map map) {
        HashSet<Integer> loneCircle;
        for(int i=0; i<friends.length; i++) {
            loneCircle = new HashSet<>();
            loneCircle.add(i);
            map.put(i, loneCircle);
        }
    }
}


