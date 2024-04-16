package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Log0;", "Lcbb;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lmga;", "b", "Lmga;", "f", "()Lmga;", "value", "", c.a, "F", "a", "()F", "alpha", "Luc1;", "()J", RemoteMessageConst.Notification.COLOR, "Lmg0;", e.a, "()Lmg0;", "brush", "<init>", "(Lmga;F)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: og0  reason: default package */
/* loaded from: classes.dex */
public final class og0 implements cbb {
    private final mga b;
    private final float c;

    public og0(mga mgaVar, float f) {
        z65.h(mgaVar, "value");
        this.b = mgaVar;
        this.c = f;
    }

    @Override // defpackage.cbb
    public float a() {
        return this.c;
    }

    @Override // defpackage.cbb
    public long b() {
        return uc1.b.e();
    }

    @Override // defpackage.cbb
    public /* synthetic */ cbb c(Function0 function0) {
        return bbb.b(this, function0);
    }

    @Override // defpackage.cbb
    public /* synthetic */ cbb d(cbb cbbVar) {
        return bbb.a(this, cbbVar);
    }

    @Override // defpackage.cbb
    public mg0 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og0)) {
            return false;
        }
        og0 og0Var = (og0) obj;
        if (z65.c(this.b, og0Var.b) && Float.compare(this.c, og0Var.c) == 0) {
            return true;
        }
        return false;
    }

    public final mga f() {
        return this.b;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + Float.floatToIntBits(this.c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.b + ", alpha=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
