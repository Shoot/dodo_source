package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: onConsume.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Lwx;", "Lkotlin/Function1;", "Lcv1;", "", "", "onConsumeAction", "a", "(Lwx;Lkotlin/jvm/functions/Function1;)Lwx;", "async"}, k = 2, mv = {1, 9, 0})
/* renamed from: r77  reason: default package */
/* loaded from: classes.dex */
public final class r77 {
    public static final <T> wx<T> a(wx<? extends T> wxVar, Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        z65.h(wxVar, "<this>");
        z65.h(function1, "onConsumeAction");
        return new oy(wxVar, function1);
    }
}
