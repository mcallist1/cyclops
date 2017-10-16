package cyclops.collectionx;

import com.aol.cyclops2.types.traversable.IterableX;
import cyclops.collectionx.immutable.VectorX;
import cyclops.collectionx.mutable.ListX;
import cyclops.collectionx.mutable.SetX;
import cyclops.companion.Monoids;
import cyclops.companion.Reducers;
import cyclops.companion.Semigroups;
import cyclops.data.HashSet;
import cyclops.data.tuple.Tuple2;
import cyclops.reactive.ReactiveSeq;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static cyclops.data.tuple.Tuple.tuple;
import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public abstract class AbstractSetTest extends AbstractCollectionXTest {
    @Test
    public void testMapA(){
        assertThat(of(1,2,3).map(i->i*2),equalTo(of(2,4,6)));
        assertThat(this.<Integer>empty().map(i->i*2),equalTo(empty()));
    }


    @Test
    public void sortedComparatorNoOrd() {
        assertThat(of(1,5,3,4,2).sorted((t1,t2) -> t2-t1).collect(Collectors.toList()),hasItems(5,4,3,2,1));
    }
    @Test
    public void whenGreaterThan2NoOrd() {
        String res = of(5, 2, 3).visit((x, xs) -> xs.join(x > 2 ? "hello" : "hello"), () -> "boo!");
        assertThat(res, containsString("hello"));
    }
    @Test
    public void testSorted() {

        IterableX<Tuple2<Integer, String>> t1 = of(tuple(2, "two"), tuple(1, "replaceWith"));

        List<Tuple2<Integer, String>> s1 = t1.sorted().toList();
        System.out.println(s1);
        assertTrue(s1.contains(tuple(1, "replaceWith")));
        assertTrue(s1.contains(tuple(2, "two")));

    }
    @Test
    public void testIntersperseNoOrd() {

        assertThat(((IterableX<Integer>)of(1,2,3).intersperse(0)).toListX(),hasItem(0));




    }
    @Test
    public void cycleMonoidNoOrder(){
        assertThat(of(1,2,3)
                        .cycle(Reducers.toCountInt(),3)
                        .toSetX(),
                equalTo(SetX.of(3)));
    }
    @Test
    public void permuations3NoOrd() {
        /**
         * Hello [[1, 2, 3]]
         peek - [1,2,3]

         */
        System.out.println("Hello " +of(1, 2, 3).permutations().map(s->s.toSet()).toSet());
        assertThat(of(1, 2, 3).permutations().map(s->s.toSet()).toSet(),
                equalTo(of(of(1, 2, 3),
                        of(1, 3, 2), of(2, 1, 3), of(2, 3, 1), of(3, 1, 2), of(3, 2, 1))
                        .peek(i->System.out.println("peek - " + i)).map(s->s.toSet()).toSet()));
    }


    @Test
    public void forEach2() {

        assertThat(of(1, 2, 3).forEach2(a -> Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), (a , b) -> a + b).toList().size(),
                equalTo(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).size()));
    }

    @Test
    public void forEach2Filter() {

        assertThat(of(1, 2, 3).forEach2(a -> Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (a , b) -> a > 2 && b < 8,
                (a ,b) -> a + b).toList().size(), equalTo(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10).size()));
    }
    /**
    @Test
    public void testCycleNoOrd() {
        assertEquals(asList(1, 2 ),of(1, 2).cycle(3).toListX());
        assertEquals(asList(1, 2, 3), of(1, 2, 3).cycle(2).toListX());
    }

    @Test
    public void testCycleTimesNoOrd() {
        System.out.println(of(1, 2).cycle(3).materialize());
        assertEquals(asList(1, 2),of(1, 2).cycle(3).materialize().toListX());
    }
     **/

    @Test
    public void slidingIncrementNoOrd() {
        List<List<Integer>> list = of(1, 2, 3, 4, 5, 6).sliding(3, 2).collect(Collectors.toList());

        System.out.println(list);
        assertThat(list.get(0).size(), greaterThan(1));
        assertThat(list.get(1).size(), greaterThan(1));
    }
    /**
    int count =0;
    @Test
    public void testCycleWhileNoOrd() {
        count =0;
        assertEquals(asList(1, 2,3),of(1, 2, 3).cycleWhile(next->count++<6).toListX());

    }
    @Test
    public void testCycleUntilNoOrd() {
        count =0;
        assertEquals(asList(1, 2,3),of(1, 2, 3).cycleUntil(next->count++==6).toListX());
    }
    @Test
    public void testCycleUntil() {
        count =0;
        System.out.println("List " + of(1, 2, 3).peek(System.out::println).cycleUntil(next->count++==6).toListX());
        count =0;
        assertEquals(3,of(1, 2, 3).cycleUntil(next->count++==6).toListX().size());

    }
    @Test
    public void testCycleWhile() {
        count =0;
        assertEquals(3,of(1, 2, 3).cycleWhile(next->count++<6).toListX().size());

    }
     **/
    @Test
    public void testScanLeftStringConcatMonoid() {
        assertThat(of("a", "b", "c").scanLeft(Reducers.toString("")).toList(), hasItems( "a", "ab", "abc"));
    }

    @Test
    public void allCombinations3NoOrd() {
        SetX<SetX<Integer>> x = of(1, 2, 3).combinations().map(s -> s.toSetX()).toSetX();
        System.out.println(x);
        assertTrue(x.contains(SetX.empty()));
        assertTrue(x.contains(SetX.of(1)));
        assertTrue(x.contains(SetX.of(2)));
        assertTrue(x.contains(SetX.of(3)));
        assertTrue(x.contains(SetX.of(1,2)));
        assertTrue(x.contains(SetX.of(1,3)));
        assertTrue(x.contains(SetX.of(2,3)));
        assertTrue(x.contains(SetX.of(1,2,3)));

    }
    @Test
    public void combinations2NoOrd() {
        SetX<SetX<Integer>> x = of(1, 2, 3).combinations(2).map(s -> s.toSetX()).toSetX();
        assertTrue(x.contains(SetX.of(1,2)));
        assertTrue(x.contains(SetX.of(1,3)));
        assertTrue(x.contains(SetX.of(2,3)));
    }
    /**
    @Test
    public void testCycleTimesNoOrder() {
        assertEquals(2,of(1, 2).cycle(3).toListX().size());
    }
     **/
    @Test
    public void combineNoOrd(){
        assertThat(of(1,1,2,3)
                .combine((a, b)->a.equals(b), Semigroups.intSum)
                .toListX().size(),greaterThan(1));
    }
    @Test
    public void slidingNoOrd() {
        SetX<VectorX<Integer>> list = of(1, 2, 3, 4, 5, 6).sliding(2).toSetX();

        System.out.println(list);
        assertTrue(list.contains(VectorX.of(1,2)));
    }
    /**
    @Test
    public void testCycleNoOrder() {
        assertEquals(2,of(1, 2).cycle(3).toListX().size());
        assertEquals(3, of(1, 2, 3).cycle(2).toListX().size());
    }
    **/

}
