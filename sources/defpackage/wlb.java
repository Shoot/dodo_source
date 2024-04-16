package defpackage;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import defpackage.n30;
/* compiled from: TransportContext.java */
@AutoValue
/* renamed from: wlb  reason: default package */
/* loaded from: classes2.dex */
public abstract class wlb {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    /* renamed from: wlb$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract wlb a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(xj8 xj8Var);
    }

    public static a a() {
        return new n30.b().d(xj8.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract xj8 d();

    public boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public wlb f(xj8 xj8Var) {
        return a().b(b()).d(xj8Var).c(c()).a();
    }

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        if (c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(c(), 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
