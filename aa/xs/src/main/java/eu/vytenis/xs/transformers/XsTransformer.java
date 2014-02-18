package eu.vytenis.xs.transformers;

public interface XsTransformer<F, T> {

	T transform(F from);

}
