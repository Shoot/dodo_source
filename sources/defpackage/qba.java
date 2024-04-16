package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.g30;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendRequest.java */
@AutoValue
/* renamed from: qba  reason: default package */
/* loaded from: classes2.dex */
public abstract class qba {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    /* renamed from: qba$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract qba a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(eh3 eh3Var);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(pk3<?> pk3Var);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(zkb<?, byte[]> zkbVar);

        public abstract a e(wlb wlbVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new g30.b();
    }

    public abstract eh3 b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract pk3<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract zkb<?, byte[]> e();

    public abstract wlb f();

    public abstract String g();
}
