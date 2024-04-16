package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: Sender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¨\u0006\u0005"}, d2 = {"Lrba;", "Lu26;", "a", "Lv27;", "b", "loyalty_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: sba  reason: default package */
/* loaded from: classes2.dex */
public final class sba {

    /* compiled from: Sender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sba$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[rba.values().length];
            try {
                iArr[rba.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rba.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rba.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rba.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rba.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rba.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[v27.values().length];
            try {
                iArr2[v27.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final u26 a(rba rbaVar) {
        z65.h(rbaVar, "<this>");
        switch (a.$EnumSwitchMapping$0[rbaVar.ordinal()]) {
            case 1:
                return u26.e;
            case 2:
                return u26.b;
            case 3:
                return u26.c;
            case 4:
                return u26.d;
            case 5:
                return u26.g;
            case 6:
                return u26.h;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final rba b(v27 v27Var) {
        z65.h(v27Var, "<this>");
        if (a.$EnumSwitchMapping$1[v27Var.ordinal()] == 1) {
            return rba.d;
        }
        return rba.e;
    }
}
