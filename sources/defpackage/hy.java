package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: asyncFrom.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlin/Function1;", "Lcv1;", "", "provider", "Lwx;", "a", "(Lkotlin/jvm/functions/Function1;)Lwx;", "async"}, k = 2, mv = {1, 9, 0})
/* renamed from: hy  reason: default package */
/* loaded from: classes.dex */
public final class hy {
    public static final <T> wx<T> a(Function1<? super cv1<? super T>, ? extends Object> function1) {
        z65.h(function1, "provider");
        return new iy(function1);
    }
}
