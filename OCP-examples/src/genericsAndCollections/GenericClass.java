package genericsAndCollections;

/**
 * 
 * @author alvarozarza94
 * Jun 7, 2020 5:44:24 PM
 * 
 *            When you instantiate the class, you tell the compiler what T
 *            should be for that particular instance.
 */
public class GenericClass<T> {
	private T contents;

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}
	// Generic Method
	public static <T> GenericClass<T> ship(T t) {
		System.out.println("Preparing " + t);
		return new GenericClass<T>();
		}
}

class SizeLimitedCrate<T, U> {
	private T contents;
	private U sizeLimit;

	public SizeLimitedCrate(T contents, U sizeLimit) {
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}
}