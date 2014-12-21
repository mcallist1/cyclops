package com.aol.simple.react;

import static com.aol.simple.react.SimpleReact.iterate;
import static com.aol.simple.react.SimpleReact.times;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class GeneratorTest {
	volatile int  count;
	volatile int  second;
	@Test
	public void testGenerate() throws InterruptedException, ExecutionException {
		count =0;
		List<String> strings = new SimpleReact()
				.<Integer, Integer> react(() -> count++ ,SimpleReact.times(4))
				.then(it -> it * 100)
				.then(it -> "*" + it)
				.block();

		assertThat(strings.size(), is(4));
		assertThat(count,is(4));
	}
	@Test
	public void testGenerateOffset() throws InterruptedException, ExecutionException {
		count =0;
		
		List<String> strings = new SimpleReact()
				.<Integer, Integer> react(() -> count++ ,times(1).offset(2))
				.then(it -> it * 100)
				.then(it -> "*" + it)
				.block();

		assertThat(strings.size(), is(1));
		assertThat(count,greaterThan(1)); 
				//can't guarantee skip completablefutures will have completed
		
	}
	@Test
	public void testGenerateDataflowMovingConcurrently() throws InterruptedException, ExecutionException {
		count =0;
		second =0;
		new SimpleReact()
				.<Integer, Integer> react(() -> {
					sleep(count++);
					return count;
				} ,times(100))
				.then(it -> it * 100)
				.then(it -> {
					
					second ++;
					return it;
				})
				.<String>then(it -> "*" + it);
				
		//generation has not complete / but chain has complete for some flows
		
		assertThat(count,greaterThan(2));
		assertThat(count,lessThan(100)); 
		assertThat(second,greaterThan(0)); 
		
	}
	@Test
	public void testIterate() throws InterruptedException, ExecutionException {
		count =0;
		List<String> strings = new SimpleReact()
				.<String, String> react((input) -> input + count++,iterate("hello").times(10))
				.then(it -> "*" + it)
				.block();

		assertThat(strings.size(), is(10));
		assertThat(count,is(9));

	}
	@Test
	public void testIterateWithOffset() throws InterruptedException, ExecutionException {
		
		List<Integer> results = new SimpleReact()
				.<Integer, Integer> react((input) -> input + 1,iterate(0).times(1).offset(10))
				.then(it -> it*100)
				.block();

		assertThat(results.size(), is(1));
		
		assertThat(results.get(0),is(1000));

	}
	@Test
	public void testIterateDataflowMovingConcurrently() throws InterruptedException, ExecutionException {
		count =0;
		second =0;
		new SimpleReact()
				.<Integer, Integer> react((input) -> {
					sleep(count++);
					return count;
				} ,iterate(0).times(100))
				.then(it -> it * 100)
				.then(it -> {
					
					second ++;
					return it;
				})
				.<String>then(it -> "*" + it);
				
		//generation has not complete / but chain has complete for some flows
		
		assertThat(count,greaterThan(2));
		assertThat(count,lessThan(100)); 
		assertThat(second,greaterThan(0)); 
		
	}
	
	private Object sleep(Integer it) {
		try {
			Thread.sleep(it);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return it;
	}
}
