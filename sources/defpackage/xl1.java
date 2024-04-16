package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\u000b\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lsk9;", "Lkotlin/Function1;", "", "", "onCancellation", "", c.a, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lfn0;", "caller", "b", "(Ljava/lang/Object;Lfn0;)Ljava/lang/Object;", "state", "Lcv1;", "uCont", "a", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: xl1 */
/* loaded from: classes3.dex */
public final class xl1 {
    public static final <T> Object a(Object obj, cv1<? super T> cv1Var) {
        if (obj instanceof il1) {
            sk9.a aVar = sk9.b;
            return sk9.b(vk9.a(((il1) obj).a));
        }
        return sk9.b(obj);
    }

    public static final <T> Object b(Object obj, fn0<?> fn0Var) {
        Throwable d = sk9.d(obj);
        if (d != null) {
            return new il1(d, false, 2, null);
        }
        return obj;
    }

    public static final <T> Object c(Object obj, Function1<? super Throwable, Unit> function1) {
        Throwable d = sk9.d(obj);
        if (d == null) {
            if (function1 != null) {
                return new vl1(obj, function1);
            }
            return obj;
        }
        return new il1(d, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return c(obj, function1);
    }
}
