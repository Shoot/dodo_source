package defpackage;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.HttpException;
import retrofit2.Response;
/* compiled from: SynchronousBodyCallAdapter.java */
/* renamed from: x3b  reason: default package */
/* loaded from: classes4.dex */
final class x3b<R> implements CallAdapter<R, Object> {
    private final Type a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x3b(Type type) {
        this.a = type;
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(@NonNull Call<R> call) {
        try {
            Response<R> execute = call.execute();
            if (execute == null) {
                return null;
            }
            if (execute.isSuccessful()) {
                return execute.body();
            }
            throw new HttpException(execute);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.a;
    }
}
