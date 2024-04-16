package defpackage;

import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ObserverModifierNode.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsm6$c;", "Lk67;", "T", "Lkotlin/Function0;", "", "block", "a", "(Lsm6$c;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: l67  reason: default package */
/* loaded from: classes.dex */
public final class l67 {
    public static final <T extends sm6.c & k67> void a(T t, Function0<Unit> function0) {
        z65.h(t, "<this>");
        z65.h(function0, "block");
        m67 I0 = t.I0();
        if (I0 == null) {
            I0 = new m67(t);
            t.a1(I0);
        }
        au2.j(t).getSnapshotObserver().h(I0, m67.b.a(), function0);
    }
}
