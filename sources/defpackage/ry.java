package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: Atomic.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&R&\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lry;", "", "Luy;", "op", c.a, "failure", "", "a", "Luy;", "b", "()Luy;", DateTokenConverter.CONVERTER_KEY, "(Luy;)V", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: ry  reason: default package */
/* loaded from: classes3.dex */
public abstract class ry {
    public uy<?> a;

    public abstract void a(uy<?> uyVar, Object obj);

    public final uy<?> b() {
        uy<?> uyVar = this.a;
        if (uyVar != null) {
            return uyVar;
        }
        z65.z("atomicOp");
        return null;
    }

    public abstract Object c(uy<?> uyVar);

    public final void d(uy<?> uyVar) {
        this.a = uyVar;
    }
}
