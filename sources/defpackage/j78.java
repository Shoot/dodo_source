package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: PizzaImageLayoutParamsModifierFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lj78;", "Lvu4;", "Lb78;", "pizzaConcept", "Luu4;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j78  reason: default package */
/* loaded from: classes2.dex */
public final class j78 implements vu4 {

    /* compiled from: PizzaImageLayoutParamsModifierFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j78$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b78.values().length];
            try {
                iArr[b78.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b78.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // defpackage.vu4
    public uu4 a(b78 b78Var) {
        z65.h(b78Var, "pizzaConcept");
        int i = a.$EnumSwitchMapping$0[b78Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new k78();
            }
            throw new NoWhenBranchMatchedException();
        }
        return new i78();
    }
}
