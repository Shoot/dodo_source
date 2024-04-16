package defpackage;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;
/* compiled from: SynchronousCallAdapterFactory.java */
/* renamed from: y3b  reason: default package */
/* loaded from: classes4.dex */
public final class y3b extends CallAdapter.Factory {
    private y3b() {
    }

    public static CallAdapter.Factory a() {
        return new y3b();
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(@NonNull Type type, @NonNull Annotation[] annotationArr, @NonNull Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) == Call.class) {
            return null;
        }
        if (CallAdapter.Factory.getRawType(type) != Response.class) {
            return new x3b(type);
        }
        if (type instanceof ParameterizedType) {
            return new z3b(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
