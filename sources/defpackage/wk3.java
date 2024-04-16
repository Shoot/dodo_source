package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.o20;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: EventInternal.java */
@AutoValue
/* renamed from: wk3  reason: default package */
/* loaded from: classes2.dex */
public abstract class wk3 {

    /* compiled from: EventInternal.java */
    @AutoValue.Builder
    /* renamed from: wk3$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public final a a(String str, int i) {
            e().put(str, String.valueOf(i));
            return this;
        }

        public final a b(String str, long j) {
            e().put(str, String.valueOf(j));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract wk3 d();

        protected abstract Map<String, String> e();

        protected abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(zg3 zg3Var);

        public abstract a i(long j);

        public abstract a j(String str);

        public abstract a k(long j);
    }

    public static a a() {
        return new o20.b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract zg3 e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public abstract String j();

    public abstract long k();

    public a l() {
        return new o20.b().j(j()).g(d()).h(e()).i(f()).k(k()).f(new HashMap(c()));
    }
}
