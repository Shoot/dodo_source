package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: HoursMinSecTimerFormatter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlin/Function0;", "", "predicate", "Lkotlin/Function1;", "builderAction", "a", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: lp4  reason: default package */
/* loaded from: classes4.dex */
public final class lp4 {
    public static final <T> T a(T t, Function0<Boolean> function0, Function1<? super T, ? extends T> function1) {
        z65.h(function0, "predicate");
        z65.h(function1, "builderAction");
        if (function0.invoke().booleanValue()) {
            return function1.invoke(t);
        }
        return t;
    }
}
