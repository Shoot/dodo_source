package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: JvmActuals.jvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000*\f\b\u0000\u0010\u0006\"\u00020\u00052\u00020\u0005¨\u0006\u0007"}, d2 = {"", "obj", "", Action.NAME_ATTRIBUTE, "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: fd5  reason: default package */
/* loaded from: classes.dex */
public final class fd5 {
    public static final String a(Object obj, String str) {
        z65.h(obj, "obj");
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        pza pzaVar = pza.a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        z65.g(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }
}
