package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
/* compiled from: Option.java */
/* renamed from: mb7  reason: default package */
/* loaded from: classes.dex */
public final class mb7<T> {
    private static final b<Object> e = new a();
    private final T a;
    private final b<T> b;
    private final String c;
    private volatile byte[] d;

    /* compiled from: Option.java */
    /* renamed from: mb7$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    private mb7(@NonNull String str, T t, @NonNull b<T> bVar) {
        this.c = eh8.b(str);
        this.a = t;
        this.b = (b) eh8.d(bVar);
    }

    @NonNull
    public static <T> mb7<T> a(@NonNull String str, T t, @NonNull b<T> bVar) {
        return new mb7<>(str, t, bVar);
    }

    @NonNull
    private static <T> b<T> b() {
        return (b<T>) e;
    }

    @NonNull
    private byte[] d() {
        if (this.d == null) {
            this.d = this.c.getBytes(se5.a);
        }
        return this.d;
    }

    @NonNull
    public static <T> mb7<T> e(@NonNull String str) {
        return new mb7<>(str, null, b());
    }

    @NonNull
    public static <T> mb7<T> f(@NonNull String str, @NonNull T t) {
        return new mb7<>(str, t, b());
    }

    public T c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof mb7) {
            return this.c.equals(((mb7) obj).c);
        }
        return false;
    }

    public void g(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.b.a(d(), t, messageDigest);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.c + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }

    /* compiled from: Option.java */
    /* renamed from: mb7$a */
    /* loaded from: classes.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // defpackage.mb7.b
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
