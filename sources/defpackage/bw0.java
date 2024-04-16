package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¨\u0006\n"}, d2 = {"E", "", "capacity", "Lzg0;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "Lrv0;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: bw0  reason: default package */
/* loaded from: classes3.dex */
public final class bw0 {
    public static final <E> rv0<E> a(int i, zg0 zg0Var, Function1<? super E, Unit> function1) {
        int i2 = 1;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (i == 1 && zg0Var == zg0.DROP_OLDEST) {
                            return new kq1(function1);
                        }
                        return new fr(i, zg0Var, function1);
                    }
                    return new qq5(function1);
                } else if (zg0Var == zg0.SUSPEND) {
                    return new fg9(function1);
                } else {
                    return new fr(1, zg0Var, function1);
                }
            } else if (zg0Var == zg0.SUSPEND) {
                return new kq1(function1);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        }
        if (zg0Var == zg0.SUSPEND) {
            i2 = rv0.F.a();
        }
        return new fr(i2, zg0Var, function1);
    }

    public static /* synthetic */ rv0 b(int i, zg0 zg0Var, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            zg0Var = zg0.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return a(i, zg0Var, function1);
    }
}
