import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumIITest {

    @Before
    public void setup(){
        CombinationSumII CombinationSumII = new CombinationSumII();

        System.out.println("Before method");
    }

    @Test
    public void comSum2() {
        List<List<Integer>> input = CombinationSumII.comSum2(new int[] {10,1,2,7,6,1,5}, 8);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1,1,6));
        ans.add(Arrays.asList(1,2,5));
        ans.add(Arrays.asList(1,7));
        ans.add(Arrays.asList(2,6));

        List<List<Integer>> input2 = CombinationSumII.comSum2(new int[] {2,5,2,1,2}, 5);
        List<List<Integer>> ans2 = new ArrayList<>();
        ans2.add(Arrays.asList(1,2,2));
        ans2.add(Arrays.asList(5));

        assertEquals(input,ans);
        assertEquals(input2,ans2);

    }

    @Test
    public void combos() {
        return;
    }
}