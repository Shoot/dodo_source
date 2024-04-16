package defpackage;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;
/* compiled from: SynchronousResponseCallAdapter.java */
/* renamed from: z3b  reason: default package */
/* loaded from: classes4.dex */
final class z3b<R> implements CallAdapter<R, Response<R>> {
    private final Type a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3b(Type type) {
        this.a = type;
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: a */
    public Response<R> adapt(@NonNull Call<R> call) {
        try {
            Response<R> execute = call.execute();
            if (execute == null) {
                return null;
            }
            if (execute.isSuccessful()) {
                return Response.success(execute.body(), execute.raw());
            }
            return Response.error(execute.code(), execute.errorBody());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.a;
    }
}
