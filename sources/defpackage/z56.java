package defpackage;

import com.dodopizza.android.buttons.DodoButton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: MapAddressStateVO.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, d2 = {"Lye0;", "", "b", "Ldi0;", "Lcom/dodopizza/android/buttons/DodoButton$a;", "a", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: z56  reason: default package */
/* loaded from: classes2.dex */
public final class z56 {

    /* compiled from: MapAddressStateVO.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z56$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ye0.values().length];
            try {
                iArr[ye0.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ye0.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[di0.values().length];
            try {
                iArr2[di0.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[di0.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[di0.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final DodoButton.a a(di0 di0Var) {
        z65.h(di0Var, "<this>");
        int i = a.$EnumSwitchMapping$1[di0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return DodoButton.a.c;
                }
                throw new NoWhenBranchMatchedException();
            }
            return DodoButton.a.b;
        }
        return DodoButton.a.a;
    }

    public static final int b(ye0 ye0Var) {
        z65.h(ye0Var, "<this>");
        int i = a.$EnumSwitchMapping$0[ye0Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 5;
    }
}
