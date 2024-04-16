package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import retrofit2.Converter;
import retrofit2.http.Streaming;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BuiltInConverters extends Converter.Factory {
    private boolean checkForKotlinUnit = true;

    /* loaded from: classes3.dex */
    static final class BufferingResponseBodyConverter implements Converter<kk9, kk9> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        BufferingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public kk9 convert(kk9 kk9Var) throws IOException {
            try {
                return Utils.buffer(kk9Var);
            } finally {
                kk9Var.close();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class RequestBodyConverter implements Converter<ji9, ji9> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        RequestBodyConverter() {
        }

        @Override // retrofit2.Converter
        public ji9 convert(ji9 ji9Var) {
            return ji9Var;
        }
    }

    /* loaded from: classes3.dex */
    static final class StreamingResponseBodyConverter implements Converter<kk9, kk9> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        StreamingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public kk9 convert(kk9 kk9Var) {
            return kk9Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        ToStringConverter() {
        }

        @Override // retrofit2.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes3.dex */
    static final class UnitResponseBodyConverter implements Converter<kk9, Unit> {
        static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        UnitResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Unit convert(kk9 kk9Var) {
            kk9Var.close();
            return Unit.a;
        }
    }

    /* loaded from: classes3.dex */
    static final class VoidResponseBodyConverter implements Converter<kk9, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        VoidResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Void convert(kk9 kk9Var) {
            kk9Var.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, ji9> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (ji9.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<kk9, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == kk9.class) {
            if (Utils.isAnnotationPresent(annotationArr, Streaming.class)) {
                return StreamingResponseBodyConverter.INSTANCE;
            }
            return BufferingResponseBodyConverter.INSTANCE;
        } else if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        } else {
            if (this.checkForKotlinUnit && type == Unit.class) {
                try {
                    return UnitResponseBodyConverter.INSTANCE;
                } catch (NoClassDefFoundError unused) {
                    this.checkForKotlinUnit = false;
                    return null;
                }
            }
            return null;
        }
    }
}
