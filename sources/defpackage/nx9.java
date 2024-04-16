package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lnx9;", "", "", "toString", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", c.a, "()Lkotlin/jvm/functions/Function0;", "value", "b", "maxValue", "", "Z", "()Z", "reverseScrolling", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nx9  reason: default package */
/* loaded from: classes.dex */
public final class nx9 {
    private final Function0<Float> a;
    private final Function0<Float> b;
    private final boolean c;

    public final Function0<Float> a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final Function0<Float> c() {
        return this.a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.a.invoke().floatValue() + ", maxValue=" + this.b.invoke().floatValue() + ", reverseScrolling=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
