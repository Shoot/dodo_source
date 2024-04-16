package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Brush.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0013ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R \u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001b"}, d2 = {"Ljqa;", "Lmg0;", "Lcna;", "size", "Lpp7;", "p", "", "alpha", "", "a", "(JLpp7;F)V", "", "other", "", "equals", "", "hashCode", "", "toString", "Luc1;", c.a, "J", "b", "()J", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jqa  reason: default package */
/* loaded from: classes.dex */
public final class jqa extends mg0 {
    private final long c;

    public /* synthetic */ jqa(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // defpackage.mg0
    public void a(long j, pp7 pp7Var, float f) {
        long j2;
        z65.h(pp7Var, "p");
        pp7Var.c(1.0f);
        if (f == 1.0f) {
            j2 = this.c;
        } else {
            long j3 = this.c;
            j2 = uc1.j(j3, uc1.m(j3) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        pp7Var.k(j2);
        if (pp7Var.r() != null) {
            pp7Var.q(null);
        }
    }

    public final long b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jqa) && uc1.l(this.c, ((jqa) obj).c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return uc1.r(this.c);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) uc1.s(this.c)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private jqa(long j) {
        super(null);
        this.c = j;
    }
}
