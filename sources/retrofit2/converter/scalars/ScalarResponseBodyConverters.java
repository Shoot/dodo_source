package retrofit2.converter.scalars;

import java.io.IOException;
import retrofit2.Converter;
/* loaded from: classes3.dex */
final class ScalarResponseBodyConverters {

    /* loaded from: classes3.dex */
    static final class BooleanResponseBodyConverter implements Converter<kk9, Boolean> {
        static final BooleanResponseBodyConverter INSTANCE = new BooleanResponseBodyConverter();

        BooleanResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Boolean convert(kk9 kk9Var) throws IOException {
            return Boolean.valueOf(kk9Var.string());
        }
    }

    /* loaded from: classes3.dex */
    static final class ByteResponseBodyConverter implements Converter<kk9, Byte> {
        static final ByteResponseBodyConverter INSTANCE = new ByteResponseBodyConverter();

        ByteResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Byte convert(kk9 kk9Var) throws IOException {
            return Byte.valueOf(kk9Var.string());
        }
    }

    /* loaded from: classes3.dex */
    static final class CharacterResponseBodyConverter implements Converter<kk9, Character> {
        static final CharacterResponseBodyConverter INSTANCE = new CharacterResponseBodyConverter();

        CharacterResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Character convert(kk9 kk9Var) throws IOException {
            String string = kk9Var.string();
            if (string.length() == 1) {
                return Character.valueOf(string.charAt(0));
            }
            throw new IOException("Expected body of length 1 for Character conversion but was " + string.length());
        }
    }

    /* loaded from: classes3.dex */
    static final class DoubleResponseBodyConverter implements Converter<kk9, Double> {
        static final DoubleResponseBodyConverter INSTANCE = new DoubleResponseBodyConverter();

        DoubleResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Double convert(kk9 kk9Var) throws IOException {
            return Double.valueOf(kk9Var.string());
        }
    }

    /* loaded from: classes3.dex */
    static final class FloatResponseBodyConverter implements Converter<kk9, Float> {
        static final FloatResponseBodyConverter INSTANCE = new FloatResponseBodyConverter();

        FloatResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Float convert(kk9 kk9Var) throws IOException {
            return Float.valueOf(kk9Var.string());
        }
    }

    /* loaded from: classes3.dex */
    static final class IntegerResponseBodyConverter implements Converter<kk9, Integer> {
        static final IntegerResponseBodyConverter INSTANCE = new IntegerResponseBodyConverter();

        IntegerResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Integer convert(kk9 kk9Var) throws IOException {
            return Integer.valueOf(kk9Var.string());
        }
    }

    /* loaded from: classes3.dex */
    static final class LongResponseBodyConverter implements Converter<kk9, Long> {
        static final LongResponseBodyConverter INSTANCE = new LongResponseBodyConverter();

        LongResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Long convert(kk9 kk9Var) throws IOException {
            return Long.valueOf(kk9Var.string());
        }
    }

    /* loaded from: classes3.dex */
    static final class ShortResponseBodyConverter implements Converter<kk9, Short> {
        static final ShortResponseBodyConverter INSTANCE = new ShortResponseBodyConverter();

        ShortResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Short convert(kk9 kk9Var) throws IOException {
            return Short.valueOf(kk9Var.string());
        }
    }

    /* loaded from: classes3.dex */
    static final class StringResponseBodyConverter implements Converter<kk9, String> {
        static final StringResponseBodyConverter INSTANCE = new StringResponseBodyConverter();

        StringResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public String convert(kk9 kk9Var) throws IOException {
            return kk9Var.string();
        }
    }

    private ScalarResponseBodyConverters() {
    }
}
