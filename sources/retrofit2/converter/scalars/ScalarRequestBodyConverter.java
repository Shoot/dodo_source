package retrofit2.converter.scalars;

import java.io.IOException;
import retrofit2.Converter;
/* loaded from: classes3.dex */
final class ScalarRequestBodyConverter<T> implements Converter<T, ji9> {
    static final ScalarRequestBodyConverter<Object> INSTANCE = new ScalarRequestBodyConverter<>();
    private static final qc6 MEDIA_TYPE = qc6.c("text/plain; charset=UTF-8");

    private ScalarRequestBodyConverter() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ ji9 convert(Object obj) throws IOException {
        return convert2((ScalarRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    /* renamed from: convert  reason: avoid collision after fix types in other method */
    public ji9 convert2(T t) throws IOException {
        return ji9.create(MEDIA_TYPE, String.valueOf(t));
    }
}
