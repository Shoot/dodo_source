package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
/* compiled from: LockFreeTaskQueue.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lnw5;", "", "E", "", "b", "()V", "element", "", "a", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "", c.a, "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: nw5  reason: default package */
/* loaded from: classes3.dex */
public class nw5<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(nw5.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public nw5(boolean z) {
        this._cur = new ow5(8, z);
    }

    public final boolean a(E e) {
        while (true) {
            ow5 ow5Var = (ow5) this._cur;
            int a2 = ow5Var.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                d2.a(a, this, ow5Var, ow5Var.i());
            }
        }
    }

    public final void b() {
        while (true) {
            ow5 ow5Var = (ow5) this._cur;
            if (ow5Var.d()) {
                return;
            }
            d2.a(a, this, ow5Var, ow5Var.i());
        }
    }

    public final int c() {
        return ((ow5) this._cur).f();
    }

    public final E d() {
        while (true) {
            ow5 ow5Var = (ow5) this._cur;
            E e = (E) ow5Var.j();
            if (e != ow5.h) {
                return e;
            }
            d2.a(a, this, ow5Var, ow5Var.i());
        }
    }
}
