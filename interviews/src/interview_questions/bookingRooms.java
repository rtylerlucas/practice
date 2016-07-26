//package interview_questions;
//
///*
// * Ham interview 7/10
// *
// * What makes you a good software engineer?
//    Passion for learning. Recognizing potential and changes in the industry.
// *
// * What's the hardest bug you've ever had to solve?
//    Collaborating with designers
// *
// * Find missing number between 1 and 1000?
//    They are not sorted
// *
// * What if two numbers are missing?
// * 
// * hashcode and equals
// *
// * implement hashmap
// *
// * 
// * Find parity of 64 bit int
// *
// *
// *
// */
//
///*
// * Working on badging system for gamifying their training for products
// *
// * Could be use for learning languages
// *
// * They have their own whole internal process of thinking
// *
// * A feedback loop Observe, reflect, make
// *
// */
//
//
//// N bookings
//// K rooms
//
//// Bookings
//// int arrival
//// int departure
//
////List of arrivals
////List of departures 
//
////Target: O(nlogn) Time
//// Room --> [0 --> latestDeparture] 0 or 1
// //[0 , 1, 2, ...]
//// We need to identify if a room is booked at a certain time (sounds like a boolean value)
//// hotel season time window: eariest arrival? --> latest departure?
//// [1] [2]  
////check our rooms, do we have any one room available starting at time: 1?
////is that same room still available for the duration to time: 2?
//
//// Set of rooms. If a room is in the set, than it has some availability.
//
//// I have a set of available rooms, those rooms have arrays of avail.
//
//// iterate both my lists, find biggest and smallest (respectively)
//
//public boolean checkBookings(int[] arrivals, int[] departures, int rooms){
//    
//    int earliest = getEarliest(arrivals);
//    int latest = getLatest(departures);
//    
//    HashSet<Room> availableRooms = setUpRooms(rooms, earliest, latest);
//    
//    //iterate across our bookings, start filling rooms.
//    //remove rooms if they become completely full!
//    
//    int arr;
//    int dep;
//    boolean booked = false;
//    for(int i = 0; i < arrivals; i ++) {
//    
//        arr = arrivals[i];
//        dep = departures[i];
//         booked = false;
//        
//        for(Room availRoom : availableRooms) {
//            if(availRoom.book(arr, dep))) { 
//                booked = true;
//                break;
//            } 
//        }
//        
//        if (booked==false) return false;
//    }
//   
//}
//
//public HashSet<Room> setUpRooms(int rooms, int earliest, int latest){
//
//    HashSet<Room> newRooms = new HashSet<>();
//    
//    for(int i = 0; i < rooms; i++){
////        Room newRoom = new Room(earliest, latest);
//        //add these to the set;
//    }
//    //return our set
//    return newRooms;
//}
//
