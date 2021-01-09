
package pkg809;

/**
 * Question 45
 * @Answer: ?
 */
public class Tread {
    final List<String> list = new CopyOnWriteArrayList<>();
    final AtomicInteger ai = new AtomicInteger(0);
    final CyclicBarrier barrier = new CyclicBarrier(2,new Runnable()){
        public void run() {System.out.println(list);}
    });
  
Runnable r = new Runnable(){
    public void runI(){
        try{
            Thread.sleep(1000 * ai.incrementAndGet());
            list.add("x");
            barrier.await();
        } catch (Exeption ex){
            
        }
    }
};

new Thread(r).Start();
new Thread(r).Start();
new Thread(r).Start();
new Thread(r).Start();
new Thread(r).Start();