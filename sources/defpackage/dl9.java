package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;
/* compiled from: RetrofitCallAdapterFactory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Ldl9;", "Lretrofit2/CallAdapter$Factory;", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lretrofit2/Retrofit;", "retrofit", "Lretrofit2/CallAdapter;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "", "Ljava/lang/Class;", "a", "Ljava/util/List;", "ignoredClasses", "Lmk9;", "b", "Lmk9;", "responseErrorHandler", "<init>", "(Ljava/util/List;)V", "backend"}, k = 1, mv = {1, 9, 0})
/* renamed from: dl9  reason: default package */
/* loaded from: classes4.dex */
public final class dl9 extends CallAdapter.Factory {
    private final List<Class<?>> a;
    private final mk9 b;

    /* JADX WARN: Multi-variable type inference failed */
    public dl9(List<? extends Class<?>> list) {
        z65.h(list, "ignoredClasses");
        this.a = list;
        this.b = kr2.a;
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        z65.h(type, "returnType");
        z65.h(annotationArr, "annotations");
        if (this.a.contains(CallAdapter.Factory.getRawType(type))) {
            return null;
        }
        if (!z65.c(CallAdapter.Factory.getRawType(type), Response.class)) {
            return new cl9(this.b, type);
        }
        if (type instanceof ParameterizedType) {
            Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
            z65.g(parameterUpperBound, "getParameterUpperBound(...)");
            return new cl9(this.b, parameterUpperBound);
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
