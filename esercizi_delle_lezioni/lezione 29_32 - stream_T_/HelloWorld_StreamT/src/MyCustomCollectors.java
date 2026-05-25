import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collector;

/**
 * Collector&lt;ELEMENTO, SCATOLA, RITORNO&gt;<br>
 * Collector&lt;T, A, R&gt;
 * <hr>
 * <table>
 * <tr>
 * <th>Component</th>
 * <th>Runs</th>
 * <th>Returns</th>
 * <th>Signature</th>
 * </tr>
 * <tr>
 * <td>Supplier</td>
 * <td>ONCE</td>
 * <td>SCATOLA</td>
 * <td>Supplier&lt;SCATOLA&gt;</td>
 * </tr>
 * <tr>
 * <td>Accumulator</td>
 * <td>PER_ELEMENT</td>
 * <td>VOID</td>
 * <td>BiConsumer&lt;SCATOLA, ELEMENTO&gt;</td>
 * </tr>
 * <tr>
 * <td>Combiner</td>
 * <td>PER_THREAD_MERGE</td>
 * <td>SCATOLA</td>
 * <td>BinaryOperator&lt;SCATOLA&gt;</td>
 * </tr>
 * <tr>
 * <td>Finisher</td>
 * <td>ONCE</td>
 * <td>RITORNO</td>
 * <td>Function&lt;SCATOLA, RITORNO&gt;</td>
 * </tr>
 * </table>
 */
public class MyCustomCollectors {

	public static Collector<Object, ?, ?> Conta() {

		return Collector.of(
				/* supplier: returns BOX */
				() -> {
					return new int[] { 0 };
				},
				/* accumulator: returns VOID */
				(box, elem) -> {
					box[0] += 1;
				},
				/* combiner: returns BOX */
				(box1, box2) -> {
					return new int[] { box1[0] + box2[0] };
				},
				/* finisher: returns WHATEVER_YOU_PREFER */
				(box) -> box[0]);
	}

	public static <T> Collector<T, int[], Integer> ContaCondizionale(BiConsumer<int[], T> accumulator) {

		return Collector.of(
				/* supplier: returns BOX */
				() -> {
					return new int[] { 0 };
				},
				/* accumulator: returns VOID */
				accumulator,
				/* combiner: returns BOX */
				(box1, box2) -> {
					return new int[] { box1[0] + box2[0] };
				},
				/* finisher: returns WHATEVER_YOU_PREFER */
				(box) -> box[0]);
	}

	public static Collector<Frutta, HashMap<String, Frutta>, List<Frutta>> Distinct() {

		return Collector.of(
				/* supplier: returns BOX */
				() -> {
					return new HashMap<String, Frutta>();
				},
				/* accumulator: returns VOID */
				(box, elem) -> {
						box.put(elem.getNome(), elem);
				},
				/* combiner: returns BOX */
				(box1, box2) -> {

					HashMap<String, Frutta> mergedStuff = new HashMap<String, Frutta>();

					mergedStuff.putAll(box1);
					mergedStuff.putAll(box2);

					return mergedStuff;
				},
				/* finisher: returns WHATEVER_YOU_PREFER */
				(finalBox) -> new ArrayList<>(finalBox.values()));
	}
}
