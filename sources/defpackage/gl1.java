package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004JQ\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001e¨\u0006\""}, d2 = {"Lgl1;", "", "Lgn0;", "cont", "", "cause", "", DateTokenConverter.CONVERTER_KEY, "result", "Lym0;", "cancelHandler", "Lkotlin/Function1;", "onCancellation", "idempotentResume", "cancelCause", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "b", "Lym0;", c.a, "Lkotlin/jvm/functions/Function1;", e.a, "Ljava/lang/Throwable;", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lym0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: gl1  reason: default package */
/* loaded from: classes3.dex */
final class gl1 {
    public final Object a;
    public final ym0 b;
    public final Function1<Throwable, Unit> c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public gl1(Object obj, ym0 ym0Var, Function1<? super Throwable, Unit> function1, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ym0Var;
        this.c = function1;
        this.d = obj2;
        this.e = th;
    }

    public static /* synthetic */ gl1 b(gl1 gl1Var, Object obj, ym0 ym0Var, Function1 function1, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = gl1Var.a;
        }
        if ((i & 2) != 0) {
            ym0Var = gl1Var.b;
        }
        ym0 ym0Var2 = ym0Var;
        Function1<Throwable, Unit> function12 = function1;
        if ((i & 4) != 0) {
            function12 = gl1Var.c;
        }
        Function1 function13 = function12;
        if ((i & 8) != 0) {
            obj2 = gl1Var.d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = gl1Var.e;
        }
        return gl1Var.a(obj, ym0Var2, function13, obj4, th);
    }

    public final gl1 a(Object obj, ym0 ym0Var, Function1<? super Throwable, Unit> function1, Object obj2, Throwable th) {
        return new gl1(obj, ym0Var, function1, obj2, th);
    }

    public final boolean c() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final void d(gn0<?> gn0Var, Throwable th) {
        ym0 ym0Var = this.b;
        if (ym0Var != null) {
            gn0Var.j(ym0Var, th);
        }
        Function1<Throwable, Unit> function1 = this.c;
        if (function1 != null) {
            gn0Var.l(function1, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl1)) {
            return false;
        }
        gl1 gl1Var = (gl1) obj;
        if (z65.c(this.a, gl1Var.a) && z65.c(this.b, gl1Var.b) && z65.c(this.c, gl1Var.c) && z65.c(this.d, gl1Var.d) && z65.c(this.e, gl1Var.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        ym0 ym0Var = this.b;
        if (ym0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ym0Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Function1<Throwable, Unit> function1 = this.c;
        if (function1 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function1.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ gl1(Object obj, ym0 ym0Var, Function1 function1, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : ym0Var, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
