package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import defpackage.v20;
import java.util.List;
/* compiled from: LogRequest.java */
@AutoValue
/* renamed from: tw5  reason: default package */
/* loaded from: classes2.dex */
public abstract class tw5 {

    /* compiled from: LogRequest.java */
    @AutoValue.Builder
    /* renamed from: tw5$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        @NonNull
        public abstract tw5 a();

        @NonNull
        public abstract a b(l91 l91Var);

        @NonNull
        public abstract a c(List<qw5> list);

        @NonNull
        abstract a d(Integer num);

        @NonNull
        abstract a e(String str);

        @NonNull
        public abstract a f(ru8 ru8Var);

        @NonNull
        public abstract a g(long j);

        @NonNull
        public abstract a h(long j);

        @NonNull
        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        @NonNull
        public a j(@NonNull String str) {
            return e(str);
        }
    }

    @NonNull
    public static a a() {
        return new v20.b();
    }

    public abstract l91 b();

    public abstract List<qw5> c();

    public abstract Integer d();

    public abstract String e();

    public abstract ru8 f();

    public abstract long g();

    public abstract long h();
}
