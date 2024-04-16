package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
/* compiled from: KotlinVersion.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0011\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f¨\u0006\u001b"}, d2 = {"Lkh5;", "", "", "major", "minor", "patch", "g", "", "toString", "", "other", "", "equals", "hashCode", "a", "I", "getMajor", "()I", "b", "getMinor", c.a, "getPatch", DateTokenConverter.CONVERTER_KEY, "version", "<init>", "(III)V", e.a, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: kh5  reason: default package */
/* loaded from: classes3.dex */
public final class kh5 implements Comparable<kh5> {
    public static final a e = new a(null);
    public static final kh5 f = lh5.a();
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    /* compiled from: KotlinVersion.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lkh5$a;", "", "Lkh5;", "CURRENT", "Lkh5;", "", "MAX_COMPONENT_VALUE", "I", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kh5$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public kh5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = g(i, i2, i3);
    }

    private final int g(int i, int i2, int i3) {
        if (new IntRange(0, 255).v(i) && new IntRange(0, 255).v(i2) && new IntRange(0, 255).v(i3)) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + CoreConstants.DOT + i2 + CoreConstants.DOT + i3).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(kh5 kh5Var) {
        z65.h(kh5Var, "other");
        return this.d - kh5Var.d;
    }

    public boolean equals(Object obj) {
        kh5 kh5Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof kh5) {
            kh5Var = (kh5) obj;
        } else {
            kh5Var = null;
        }
        if (kh5Var != null && this.d == kh5Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(CoreConstants.DOT);
        sb.append(this.b);
        sb.append(CoreConstants.DOT);
        sb.append(this.c);
        return sb.toString();
    }
}
