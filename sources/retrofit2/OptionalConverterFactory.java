package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.Converter;
/* JADX INFO: Access modifiers changed from: package-private */
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class OptionalConverterFactory extends Converter.Factory {
    static final Converter.Factory INSTANCE = new OptionalConverterFactory();

    @IgnoreJRERequirement
    /* loaded from: classes3.dex */
    static final class OptionalConverter<T> implements Converter<kk9, Optional<T>> {
        final Converter<kk9, T> delegate;

        OptionalConverter(Converter<kk9, T> converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public Optional<T> convert(kk9 kk9Var) throws IOException {
            Optional<T> ofNullable;
            ofNullable = Optional.ofNullable(this.delegate.convert(kk9Var));
            return ofNullable;
        }
    }

    OptionalConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    public Converter<kk9, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != sb7.a()) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
