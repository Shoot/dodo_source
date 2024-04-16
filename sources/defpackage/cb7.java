package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.s6b;
import im.threads.business.transport.MessageAttributes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: OperationNode.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcb7;", "Ldb7;", "Ls6b;", "data", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "", "a", "", "", c.a, "(Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "getSystemName", "systemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cb7  reason: default package */
/* loaded from: classes.dex */
public final class cb7 extends db7 {
    private final String c;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb7(String str, String str2) {
        super(str);
        z65.h(str, MessageAttributes.TYPE);
        z65.h(str2, "systemName");
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.ct4
    public boolean a(s6b s6bVar) {
        boolean v;
        z65.h(s6bVar, "data");
        if (s6bVar instanceof s6b.b) {
            v = l0b.v(((s6b.b) s6bVar).a(), this.d, true);
            return v;
        }
        return false;
    }

    @Override // defpackage.db7, defpackage.t6b
    public Object b(s6b s6bVar, cv1<? super Unit> cv1Var) {
        return Unit.a;
    }

    @Override // defpackage.t6b
    public Object c(cv1<? super Set<String>> cv1Var) {
        Set d;
        d = rfa.d(this.d);
        return d;
    }

    @Override // defpackage.smb
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb7)) {
            return false;
        }
        cb7 cb7Var = (cb7) obj;
        if (z65.c(this.c, cb7Var.c) && z65.c(this.d, cb7Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        return "OperationNode(type=" + this.c + ", systemName=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
