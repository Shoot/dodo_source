package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lun9;", "Lkx1;", "a", "b", "(Lun9;)Lkx1;", "transactionDispatcher", "room-ktx_release"}, k = 2, mv = {1, 7, 1})
/* renamed from: xx1  reason: default package */
/* loaded from: classes.dex */
public final class xx1 {
    public static final kx1 a(un9 un9Var) {
        z65.h(un9Var, "<this>");
        Map<String, Object> k = un9Var.k();
        Object obj = k.get("QueryDispatcher");
        if (obj == null) {
            obj = jm3.a(un9Var.o());
            k.put("QueryDispatcher", obj);
        }
        z65.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kx1) obj;
    }

    public static final kx1 b(un9 un9Var) {
        z65.h(un9Var, "<this>");
        Map<String, Object> k = un9Var.k();
        Object obj = k.get("TransactionDispatcher");
        if (obj == null) {
            obj = jm3.a(un9Var.r());
            k.put("TransactionDispatcher", obj);
        }
        z65.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (kx1) obj;
    }
}
