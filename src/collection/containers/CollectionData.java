package collection.containers;

import java.util.ArrayList;


import collection.utils.Generator;

public class CollectionData<T> extends ArrayList<T> {
	public CollectionData(Generator<T> gen, int quantity) {
		for (int i = 0; i < quantity; i++) {
			add(gen.next());
		}
	}
	
	public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
		return new CollectionData<>(gen, quantity);
	}

}
