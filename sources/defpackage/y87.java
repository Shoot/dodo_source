package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: onResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Lwx;", "Lkotlin/Function2;", "Lcv1;", "", "", "resultConsumer", "a", "(Lwx;Lkotlin/jvm/functions/Function2;)Lwx;", "async"}, k = 2, mv = {1, 9, 0})
/* renamed from: y87  reason: default package */
/* loaded from: classes.dex */
public final class y87 {
    public static final <T> wx<T> a(wx<? extends T> wxVar, Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(wxVar, "<this>");
        z65.h(function2, "resultConsumer");
        return new py(wxVar, function2);
    }
}
