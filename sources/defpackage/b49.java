package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Random.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lb49;", "", "", "bitCount", "b", c.a, "until", DateTokenConverter.CONVERTER_KEY, RemoteMessageConst.FROM, e.a, "", "f", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: b49  reason: default package */
/* loaded from: classes3.dex */
public abstract class b49 {
    public static final a a = new a(null);
    private static final b49 b = dc8.a.b();

    /* compiled from: Random.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lb49$a;", "Lb49;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "bitCount", "b", c.a, "until", DateTokenConverter.CONVERTER_KEY, RemoteMessageConst.FROM, e.a, "", "f", "defaultRandom", "Lb49;", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b49$a */
    /* loaded from: classes3.dex */
    public static final class a extends b49 implements Serializable {

        /* compiled from: Random.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"Lb49$a$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        /* renamed from: b49$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0065a implements Serializable {
            public static final C0065a a = new C0065a();

            private C0065a() {
            }

            private final Object readResolve() {
                return b49.a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return C0065a.a;
        }

        @Override // defpackage.b49
        public int b(int i) {
            return b49.b.b(i);
        }

        @Override // defpackage.b49
        public int c() {
            return b49.b.c();
        }

        @Override // defpackage.b49
        public int d(int i) {
            return b49.b.d(i);
        }

        @Override // defpackage.b49
        public int e(int i, int i2) {
            return b49.b.e(i, i2);
        }

        @Override // defpackage.b49
        public long f() {
            return b49.b.f();
        }

        private a() {
        }
    }

    public abstract int b(int i);

    public int c() {
        return b(32);
    }

    public int d(int i) {
        return e(0, i);
    }

    public int e(int i, int i2) {
        int c;
        int i3;
        int i4;
        e49.c(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = b(e49.d(i5));
            } else {
                do {
                    c = c() >>> 1;
                    i3 = c % i5;
                } while ((c - i3) + (i5 - 1) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int c2 = c();
            if (i <= c2 && c2 < i2) {
                return c2;
            }
        }
    }

    public long f() {
        return (c() << 32) + c();
    }
}
