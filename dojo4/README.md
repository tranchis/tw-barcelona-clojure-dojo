1. Implement the following algorithm in Clojure

```java
public class Sleepsort {

    private static int[] inputArray = { 3, 1, 2, 1, 181, 10};

    public static void main(String[] args) throws InterruptedException {
        Sleepsort ss = new Sleepsort();
        ss.sleepsort(inputArray);
    }

    public void sleepsort(int[] array) throws InterruptedException {
        for (int val : array) {
            new Thread(#{ Thread.sleep(val); System.out.println(val); }).start();
        }
    }
}
```

(Taken from [https://gist.github.com/lvijay/1354400])

2. Re-implement it using `future`: [http://clojuredocs.org/clojure.core/future]

3. Using `promise`: [http://clojuredocs.org/clojure.core/promise] and [http://clojuredocs.org/clojure.core/deliver].

4. Using `atom`: [http://clojuredocs.org/clojure.core/atom]

5. Using `ref`: [http://clojuredocs.org/clojure.core/ref]

6. Using `core.async`


