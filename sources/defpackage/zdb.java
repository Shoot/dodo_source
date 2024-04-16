package defpackage;

import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lzdb;", "", "Lyk3;", "a", "()Lyk3;", "", c.a, "()V", "eventLoop", DateTokenConverter.CONVERTER_KEY, "(Lyk3;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", ActionConst.REF_ATTRIBUTE, "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: zdb  reason: default package */
/* loaded from: classes3.dex */
public final class zdb {
    public static final zdb a = new zdb();
    private static final ThreadLocal<yk3> b = new ThreadLocal<>();

    private zdb() {
    }

    public final yk3 a() {
        return b.get();
    }

    public final yk3 b() {
        ThreadLocal<yk3> threadLocal = b;
        yk3 yk3Var = threadLocal.get();
        if (yk3Var == null) {
            yk3 a2 = bl3.a();
            threadLocal.set(a2);
            return a2;
        }
        return yk3Var;
    }

    public final void c() {
        b.set(null);
    }

    public final void d(yk3 yk3Var) {
        b.set(yk3Var);
    }
}
