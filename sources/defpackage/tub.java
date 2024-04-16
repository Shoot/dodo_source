package defpackage;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: utf8.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lyg0;", "", "a", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
/* renamed from: tub  reason: default package */
/* loaded from: classes3.dex */
public final class tub {
    public static final boolean a(yg0 yg0Var) {
        long i;
        z65.h(yg0Var, "$this$isProbablyUtf8");
        try {
            yg0 yg0Var2 = new yg0();
            i = i.i(yg0Var.P(), 64L);
            yg0Var.j(yg0Var2, 0L, i);
            for (int i2 = 0; i2 < 16; i2++) {
                if (!yg0Var2.U0()) {
                    int M = yg0Var2.M();
                    if (Character.isISOControl(M) && !Character.isWhitespace(M)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
