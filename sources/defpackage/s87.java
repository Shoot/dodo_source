package defpackage;

import kotlin.Metadata;
/* compiled from: OnPinIsMoving.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {"Lx56;", "a", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: s87  reason: default package */
/* loaded from: classes2.dex */
public final class s87 {

    /* compiled from: OnPinIsMoving.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s87$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f9.values().length];
            try {
                iArr[f9.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final x56 a(x56 x56Var) {
        z65.h(x56Var, "<this>");
        if (a.$EnumSwitchMapping$0[x56Var.u().ordinal()] == 1) {
            return y56.q(x56Var);
        }
        return x56Var;
    }
}
