package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeightBFA {
  public static int find(int arr[]){
      List<Integer> list = new ArrayList<>();
      for(int v : arr){
          list.add(v);
      }
      while(list.size()>1){
          Collections.sort(list,Collections.reverseOrder());
          int stone1 = list.remove(0);
          int stone2 = list.remove(0);
          if(stone1==stone2){
              continue;
          }
          list.add(stone1-stone2);
      }
      return list.size()==0?0 : list.get(0);
  }
    public static void main(String[] args){
        int arr[] = {1, 3, 2, 8, 7, 4};
        System.out.print(find(arr));
    }
}
