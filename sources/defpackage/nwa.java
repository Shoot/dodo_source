package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u0000 \u00102\u00020\u0001:\u0001\u0007B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lnwa;", "", "Lom5;", "layoutCoordinates", "Lbcb;", "textLayoutResult", "b", "a", "Lom5;", DateTokenConverter.CONVERTER_KEY, "()Lom5;", "Lbcb;", e.a, "()Lbcb;", "<init>", "(Lom5;Lbcb;)V", c.a, "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nwa  reason: default package */
/* loaded from: classes.dex */
public class nwa {
    public static final a c = new a(null);
    private static final nwa d = new nwa(null, null);
    private final om5 a;
    private final bcb b;

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lnwa$a;", "", "Lnwa;", "Empty", "Lnwa;", "a", "()Lnwa;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: nwa$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nwa a() {
            return nwa.d;
        }
    }

    public nwa(om5 om5Var, bcb bcbVar) {
        this.a = om5Var;
        this.b = bcbVar;
    }

    public static /* synthetic */ nwa c(nwa nwaVar, om5 om5Var, bcb bcbVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                om5Var = nwaVar.a;
            }
            if ((i & 2) != 0) {
                bcbVar = nwaVar.b;
            }
            return nwaVar.b(om5Var, bcbVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final nwa b(om5 om5Var, bcb bcbVar) {
        return new nwa(om5Var, bcbVar);
    }

    public final om5 d() {
        return this.a;
    }

    public final bcb e() {
        return this.b;
    }
}
