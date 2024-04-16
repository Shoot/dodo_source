package retrofit2;

import ch.qos.logback.core.CoreConstants;
import defpackage.sk9;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
/* compiled from: KotlinExtensions.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "", "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lcv1;)Ljava/lang/Object;", "awaitNullable", "Lretrofit2/Response;", "awaitResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "suspendAndThrow", "(Ljava/lang/Exception;Lcv1;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KotlinExtensions {
    public static final <T> Object await(Call<T> call, cv1<? super T> cv1Var) {
        cv1 c;
        Object d;
        c = b75.c(cv1Var);
        final gn0 gn0Var = new gn0(c, 1);
        gn0Var.u(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                z65.i(call2, "call");
                z65.i(th, "t");
                fn0 fn0Var = fn0.this;
                sk9.a aVar = sk9.b;
                fn0Var.resumeWith(sk9.b(vk9.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                z65.i(call2, "call");
                z65.i(response, "response");
                if (response.isSuccessful()) {
                    T body = response.body();
                    if (body == null) {
                        Object k = call2.request().k(Invocation.class);
                        if (k == null) {
                            z65.t();
                        }
                        z65.d(k, "call.request().tag(Invocation::class.java)!!");
                        Method method = ((Invocation) k).method();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        z65.d(method, "method");
                        Class<?> declaringClass = method.getDeclaringClass();
                        z65.d(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append(CoreConstants.DOT);
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                        fn0 fn0Var = fn0.this;
                        sk9.a aVar = sk9.b;
                        fn0Var.resumeWith(sk9.b(vk9.a(kotlinNullPointerException)));
                        return;
                    }
                    fn0.this.resumeWith(sk9.b(body));
                    return;
                }
                fn0 fn0Var2 = fn0.this;
                HttpException httpException = new HttpException(response);
                sk9.a aVar2 = sk9.b;
                fn0Var2.resumeWith(sk9.b(vk9.a(httpException)));
            }
        });
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        return s;
    }

    public static final <T> Object awaitNullable(Call<T> call, cv1<? super T> cv1Var) {
        cv1 c;
        Object d;
        c = b75.c(cv1Var);
        final gn0 gn0Var = new gn0(c, 1);
        gn0Var.u(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                z65.i(call2, "call");
                z65.i(th, "t");
                fn0 fn0Var = fn0.this;
                sk9.a aVar = sk9.b;
                fn0Var.resumeWith(sk9.b(vk9.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                z65.i(call2, "call");
                z65.i(response, "response");
                if (response.isSuccessful()) {
                    fn0.this.resumeWith(sk9.b(response.body()));
                    return;
                }
                fn0 fn0Var = fn0.this;
                HttpException httpException = new HttpException(response);
                sk9.a aVar = sk9.b;
                fn0Var.resumeWith(sk9.b(vk9.a(httpException)));
            }
        });
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        return s;
    }

    public static final <T> Object awaitResponse(Call<T> call, cv1<? super Response<T>> cv1Var) {
        cv1 c;
        Object d;
        c = b75.c(cv1Var);
        final gn0 gn0Var = new gn0(c, 1);
        gn0Var.u(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                z65.i(call2, "call");
                z65.i(th, "t");
                fn0 fn0Var = fn0.this;
                sk9.a aVar = sk9.b;
                fn0Var.resumeWith(sk9.b(vk9.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                z65.i(call2, "call");
                z65.i(response, "response");
                fn0.this.resumeWith(sk9.b(response));
            }
        });
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        return s;
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        z65.i(retrofit, "$this$create");
        z65.n(4, "T");
        return (T) retrofit.create(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Exception r4, defpackage.cv1<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            defpackage.vk9.b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.vk9.b(r5)
            r0.L$0 = r4
            r0.label = r3
            kx1 r5 = defpackage.v33.a()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.x(r2, r3)
            java.lang.Object r4 = defpackage.a75.d()
            java.lang.Object r5 = defpackage.a75.d()
            if (r4 != r5) goto L59
            defpackage.io2.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, cv1):java.lang.Object");
    }
}
