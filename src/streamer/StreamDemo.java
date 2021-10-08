package streamer;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class StreamDemo {
	
	public static void main(String a[])
	{
		basicDemo();
	}
	public static void basicDemo()
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = Stream.of(1 , 2 , 3 , 4);
		
		System.out.println("By anonymous");
		stream1.forEach(new Consumer<Integer>()
		{
			public void accept(Integer t)
			{
				System.out.println(t);
			}
			
		});
		
		System.out.println("By lamba");
		stream1.forEach((t)->System.out.println(t));
		
		System.out.println("By lamba and consumer");
		
	}
	
	
	

}
		
		