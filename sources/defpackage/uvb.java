package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H&R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Luvb;", "", "", c.a, "Ly73;", "a", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/jvm/functions/Function0;)V", "invalidateListener", "<init>", "()V", "Lni4;", "Lpr7;", "Lhxb;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uvb  reason: default package */
/* loaded from: classes.dex */
public abstract class uvb {
    private Function0<Unit> a;

    private uvb() {
    }

    public /* synthetic */ uvb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(y73 y73Var);

    public Function0<Unit> b() {
        return this.a;
    }

    public final void c() {
        Function0<Unit> b = b();
        if (b != null) {
            b.invoke();
        }
    }

    public void d(Function0<Unit> function0) {
        this.a = function0;
    }
}
