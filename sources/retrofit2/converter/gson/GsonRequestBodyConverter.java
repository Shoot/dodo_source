package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import retrofit2.Converter;
/* loaded from: classes3.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, ji9> {
    private static final qc6 MEDIA_TYPE = qc6.c("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonRequestBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ ji9 convert(Object obj) throws IOException {
        return convert2((GsonRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    /* renamed from: convert  reason: avoid collision after fix types in other method */
    public ji9 convert2(T t) throws IOException {
        yg0 yg0Var = new yg0();
        dd5 r = this.gson.r(new OutputStreamWriter(yg0Var.S1(), UTF_8));
        this.adapter.write(r, t);
        r.close();
        return ji9.create(MEDIA_TYPE, yg0Var.v1());
    }
}
