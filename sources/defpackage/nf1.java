package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lnf1;", "Lcbb;", "", "toString", "", "hashCode", "", "other", "", "equals", "Luc1;", "b", "J", "getValue-0d7_KjU", "()J", "value", RemoteMessageConst.Notification.COLOR, "Lmg0;", e.a, "()Lmg0;", "brush", "", "a", "()F", "alpha", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nf1  reason: default package */
/* loaded from: classes.dex */
public final class nf1 implements cbb {
    private final long b;

    public /* synthetic */ nf1(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // defpackage.cbb
    public float a() {
        return uc1.m(b());
    }

    @Override // defpackage.cbb
    public long b() {
        return this.b;
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
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nf1) && uc1.l(this.b, ((nf1) obj).b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return uc1.r(this.b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) uc1.s(this.b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private nf1(long j) {
        this.b = j;
        if (j == uc1.b.e()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }
}
