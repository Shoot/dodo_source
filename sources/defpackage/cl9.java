package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.dodopizza.backend.client.common.error.APIRequestExecuteException;
/* compiled from: RetrofitAPICallAdapter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0001\u0010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcl9;", "R", "Lretrofit2/CallAdapter;", "", "Lretrofit2/Call;", "call", "a", "adapt", "Ljava/lang/reflect/Type;", "responseType", "Lmk9;", "Lmk9;", "responseErrorHandler", "b", "Ljava/lang/reflect/Type;", "returnType", "<init>", "(Lmk9;Ljava/lang/reflect/Type;)V", "backend"}, k = 1, mv = {1, 9, 0})
/* renamed from: cl9  reason: default package */
/* loaded from: classes4.dex */
public final class cl9<R> implements CallAdapter<R, Object> {
    private final mk9 a;
    private final Type b;

    public cl9(mk9 mk9Var, Type type) {
        z65.h(mk9Var, "responseErrorHandler");
        z65.h(type, "returnType");
        this.a = mk9Var;
        this.b = type;
    }

    private final <R> Object a(Call<R> call) throws IOException {
        Response<R> execute = call.execute();
        if (execute.isSuccessful()) {
            return execute.body();
        }
        throw new HttpException(execute);
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call<R> call) {
        z65.h(call, "call");
        try {
            return a(call);
        } catch (IOException e) {
            throw new APIRequestExecuteException(e);
        }
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.b;
    }
}
