package tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tekrar2 {
    public static void main(String[] args) {
/*Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

```
Beklenen Çıktı:
```

```
[Python, JAVA, PHP, Perl, C#, C++]
```


 */
        String []arr={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> list=new ArrayList<>();
        int idx=0;
        for (String w:arr){

            list.add(w);


        }

        System.out.println(list);


    }

}
