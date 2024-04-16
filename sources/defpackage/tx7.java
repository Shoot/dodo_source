package defpackage;

import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: tx7  reason: default package */
/* loaded from: classes2.dex */
public class tx7 {
    private static final glc a = new alc();

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* renamed from: tx7$a */
    /* loaded from: classes2.dex */
    public interface a<R extends tk9, T> {
        T a(@NonNull R r);
    }

    @NonNull
    public static <R extends tk9, T> y6b<T> a(@NonNull sx7<R> sx7Var, @NonNull a<R, T> aVar) {
        glc glcVar = a;
        a7b a7bVar = new a7b();
        sx7Var.addStatusListener(new dlc(sx7Var, a7bVar, aVar, glcVar));
        return a7bVar.a();
    }

    @NonNull
    public static <R extends tk9> y6b<Void> b(@NonNull sx7<R> sx7Var) {
        return a(sx7Var, new elc());
    }
}
