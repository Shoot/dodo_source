package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lsna;", "T", "", "", e.a, "(Lqn1;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Lqn1;)I", "other", "", c.a, "(Lqn1;Ljava/lang/Object;)Z", "Lqn1;", "a", "Lqn1;", "getComposer$annotations", "()V", "composer", "b", "(Lqn1;)Lqn1;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sna  reason: default package */
/* loaded from: classes.dex */
public final class sna<T> {
    private final qn1 a;

    private /* synthetic */ sna(qn1 qn1Var) {
        this.a = qn1Var;
    }

    public static final /* synthetic */ sna a(qn1 qn1Var) {
        return new sna(qn1Var);
    }

    public static <T> qn1 b(qn1 qn1Var) {
        z65.h(qn1Var, "composer");
        return qn1Var;
    }

    public static boolean c(qn1 qn1Var, Object obj) {
        if (!(obj instanceof sna) || !z65.c(qn1Var, ((sna) obj).f())) {
            return false;
        }
        return true;
    }

    public static int d(qn1 qn1Var) {
        return qn1Var.hashCode();
    }

    public static String e(qn1 qn1Var) {
        return "SkippableUpdater(composer=" + qn1Var + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ qn1 f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
