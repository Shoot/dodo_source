package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImeOptions.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB<\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\fR \u0010\u0018\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R \u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lrw4;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Z", "f", "()Z", "singleLine", "Lcg5;", "b", "I", c.a, "()I", "capitalization", "autoCorrect", "Lfg5;", DateTokenConverter.CONVERTER_KEY, e.a, "keyboardType", "Lqw4;", "imeAction", "<init>", "(ZIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rw4  reason: default package */
/* loaded from: classes.dex */
public final class rw4 {
    public static final a f = new a(null);
    private static final rw4 g = new rw4(false, 0, false, 0, 0, 31, null);
    private final boolean a;
    private final int b;
    private final boolean c;
    private final int d;
    private final int e;

    /* compiled from: ImeOptions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lrw4$a;", "", "Lrw4;", "Default", "Lrw4;", "a", "()Lrw4;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rw4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rw4 a() {
            return rw4.g;
        }
    }

    public /* synthetic */ rw4(boolean z, int i, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3);
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw4)) {
            return false;
        }
        rw4 rw4Var = (rw4) obj;
        if (this.a == rw4Var.a && cg5.f(this.b, rw4Var.b) && this.c == rw4Var.c && fg5.k(this.d, rw4Var.d) && qw4.l(this.e, rw4Var.e)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.a;
    }

    public int hashCode() {
        return (((((((a91.a(this.a) * 31) + cg5.g(this.b)) * 31) + a91.a(this.c)) * 31) + fg5.l(this.d)) * 31) + qw4.m(this.e);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) cg5.h(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) fg5.m(this.d)) + ", imeAction=" + ((Object) qw4.n(this.e)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private rw4(boolean z, int i, boolean z2, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ rw4(boolean z, int i, boolean z2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? cg5.a.b() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? fg5.a.h() : i2, (i4 & 16) != 0 ? qw4.b.a() : i3, null);
    }
}
