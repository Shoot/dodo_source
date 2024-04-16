package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: SafeCollector.common.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010¨\u0006\b"}, d2 = {"Lqs9;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "a", "Ll95;", "collectJob", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: ss9  reason: default package */
/* loaded from: classes3.dex */
public final class ss9 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: ss9$a */
    /* loaded from: classes3.dex */
    public static final class a extends ej5 implements Function2<Integer, CoroutineContext.Element, Integer> {
        final /* synthetic */ qs9<?> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(qs9<?> qs9Var) {
            super(2);
            this.a = qs9Var;
        }

        public final Integer a(int i, CoroutineContext.Element element) {
            int i2;
            CoroutineContext.b<?> key = element.getKey();
            CoroutineContext.Element c = this.a.b.c(key);
            if (key != l95.M) {
                if (element != c) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = i + 1;
                }
                return Integer.valueOf(i2);
            }
            l95 l95Var = (l95) c;
            l95 b = ss9.b((l95) element, l95Var);
            if (b == l95Var) {
                if (l95Var != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + l95Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
            return a(num.intValue(), element);
        }
    }

    public static final void a(qs9<?> qs9Var, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.m0(0, new a(qs9Var))).intValue() == qs9Var.c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + qs9Var.b + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final l95 b(l95 l95Var, l95 l95Var2) {
        while (l95Var != null) {
            if (l95Var == l95Var2) {
                return l95Var;
            }
            if (!(l95Var instanceof tw9)) {
                return l95Var;
            }
            l95Var = ((tw9) l95Var).g1();
        }
        return null;
    }
}
