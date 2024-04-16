package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.fnb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Try.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0003\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0003\u001a0\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0003¨\u0006\r"}, d2 = {"T", "R", "Lfnb;", "Lkotlin/Function1;", "func", "a", "", "recoverFunc", DateTokenConverter.CONVERTER_KEY, "", "action", c.a, "b", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: hnb  reason: default package */
/* loaded from: classes4.dex */
public final class hnb {
    public static final <T, R> fnb<R> a(fnb<T> fnbVar, Function1<? super T, ? extends R> function1) {
        z65.h(fnbVar, "<this>");
        z65.h(function1, "func");
        if (fnbVar instanceof fnb.c) {
            return new fnb.c(function1.invoke((Object) ((fnb.c) fnbVar).d()));
        }
        if (fnbVar instanceof fnb.b) {
            return new fnb.b(((fnb.b) fnbVar).d());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> fnb<T> b(fnb<T> fnbVar, Function1<? super Throwable, Unit> function1) {
        z65.h(fnbVar, "<this>");
        z65.h(function1, "action");
        if (fnbVar instanceof fnb.b) {
            function1.invoke(((fnb.b) fnbVar).d());
        }
        return fnbVar;
    }

    public static final <T> fnb<T> c(fnb<T> fnbVar, Function1<? super T, Unit> function1) {
        z65.h(fnbVar, "<this>");
        z65.h(function1, "action");
        if (fnbVar instanceof fnb.c) {
            function1.invoke((Object) ((fnb.c) fnbVar).d());
        }
        return fnbVar;
    }

    public static final <T> fnb<T> d(fnb<T> fnbVar, Function1<? super Throwable, ? extends T> function1) {
        z65.h(fnbVar, "<this>");
        z65.h(function1, "recoverFunc");
        if (!(fnbVar instanceof fnb.c)) {
            if (fnbVar instanceof fnb.b) {
                return new fnb.c(function1.invoke(((fnb.b) fnbVar).d()));
            }
            throw new NoWhenBranchMatchedException();
        }
        return fnbVar;
    }
}
