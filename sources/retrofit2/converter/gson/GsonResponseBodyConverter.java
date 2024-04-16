package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import retrofit2.Converter;
/* loaded from: classes3.dex */
final class GsonResponseBodyConverter<T> implements Converter<kk9, T> {
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonResponseBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(kk9 kk9Var) throws IOException {
        yb5 q = this.gson.q(kk9Var.charStream());
        try {
            T read = this.adapter.read(q);
            if (q.N() == mc5.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            kk9Var.close();
        }
    }
}
