package stream;

import java.util.stream.Stream;

public class StremaOperations {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,5,9,10,17,18,35,45);
        //opertion -1****************************8
      //  System.out.println(stream.count());//to get size of stream
        /*
        here i am using same stream for performing different operations if you try to do
        so then, it will give error you can perform at most one operation on one stream
        try to run every operation by commenting others opertaions.
        */
        //opertion -2****************************8
       // System.out.println(stream.min(Integer::compareTo).get());
        //opertion -3****************************8
      //  System.out.println(stream.max(Integer::compareTo).get());
        Stream<String > str = Stream.of("vivek","ramsukh","bhagwati","vivek" );
        //opertion -4****************************8
     //   System.out.println(str.min(String::compareTo).get());
       //stream.map(i->i+10);
    }

}
