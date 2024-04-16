package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\b"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Lrn5;", "b", "Lfo5;", "mode", "a", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/LazyKt")
/* renamed from: yn5  reason: default package */
/* loaded from: classes3.dex */
public class yn5 {

    /* compiled from: LazyJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yn5$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[fo5.values().length];
            try {
                iArr[fo5.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fo5.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fo5.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static <T> rn5<T> a(fo5 fo5Var, Function0<? extends T> function0) {
        z65.h(fo5Var, "mode");
        z65.h(function0, "initializer");
        int i = a.$EnumSwitchMapping$0[fo5Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new irb(function0);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new at9(function0);
        }
        return new v3b(function0, null, 2, null);
    }

    public static <T> rn5<T> b(Function0<? extends T> function0) {
        z65.h(function0, "initializer");
        return new v3b(function0, null, 2, null);
    }
}
