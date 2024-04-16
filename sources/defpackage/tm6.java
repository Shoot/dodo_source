package defpackage;

import defpackage.sm6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Modifier.kt */
/* renamed from: tm6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tm6 {
    public static boolean a(sm6.b bVar, Function1 function1) {
        z65.h(function1, "predicate");
        return ((Boolean) function1.invoke(bVar)).booleanValue();
    }

    public static Object b(sm6.b bVar, Object obj, Function2 function2) {
        z65.h(function2, "operation");
        return function2.invoke(obj, bVar);
    }
}
