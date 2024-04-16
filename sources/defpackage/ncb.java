package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: TextSelectionColors.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0017\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0004\u0010\b\"\u001a\u0010\u000e\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lxr8;", "Lmcb;", "a", "Lxr8;", "b", "()Lxr8;", "LocalTextSelectionColors", "Luc1;", "J", "DefaultSelectionColor", c.a, "Lmcb;", "getDefaultTextSelectionColors$annotations", "()V", "DefaultTextSelectionColors", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ncb  reason: default package */
/* loaded from: classes.dex */
public final class ncb {
    private static final xr8<mcb> a = oo1.c(null, a.a, 1, null);
    private static final long b;
    private static final mcb c;

    /* compiled from: TextSelectionColors.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmcb;", "a", "()Lmcb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ncb$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<mcb> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final mcb invoke() {
            return ncb.c;
        }
    }

    static {
        long d = yc1.d(4282550004L);
        b = d;
        c = new mcb(d, uc1.j(d, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final xr8<mcb> b() {
        return a;
    }
}
