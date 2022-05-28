package lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WorkWithLists {
    /*
    1. Your BufferedReader gets string as this : "1 2 3 4 5"
    2. Next, you must create a list of numbers from this line (ArrayList<Integer>) in the createBigList:
    3. Have created three list, add the desired items in each and sort this lists in ascending order:
    4. Sort all three lists and create List of this three lists where the first element is div2List, second -  div3List and third - otherlist.
     */


    public static void main(String[] args) throws IOException {  //Sample input: 1 177 8 700 785 4635 3489 52 7418 43 36 8695 3 64
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String allElements = reader.readLine();
        List<Integer> bigList = createBigList(allElements);

        ArrayList<Integer> div2List;
        ArrayList<Integer> div3List;
        ArrayList<Integer> otherList;

        //add the necessary elements from bigList to div2List,div3List,otherList and sort all three lists
        div2List = (ArrayList<Integer>) bigList.stream().sorted().filter(n -> (n % 2) == 0).collect(Collectors.toList());
        div3List = (ArrayList<Integer>) bigList.stream().sorted().filter(n -> (n % 3) == 0).collect(Collectors.toList());
        otherList = (ArrayList<Integer>) bigList.stream().sorted().filter(n -> (n % 2) != 0 && (n % 3) != 0).collect(Collectors.toList());

        //get result list from createListOfLists
        List<List<Integer>> resultList = createListOfLists(div2List, div3List, otherList);

        System.out.println(resultList);
    }

    public static List<Integer> createBigList(String str) {
        List<Integer> bigList = new ArrayList<Integer>();
        String[] strarr = str.split(" ");

        for (String s : strarr) {
            //convert(using Integer.parseInt(s) or Integer.valueOf(s)) and add all elements from srtarr to bigList
            bigList.add(Integer.parseInt(s));
        }
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list, List<Integer> otherList) {
        //add all lists like items in resultList(list of lists) and return it, first-div2list, second-div3list, third-otherList
        return new ArrayList<>(Arrays.asList(div2list, div3list, otherList));
    }
}
