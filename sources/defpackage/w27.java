package defpackage;

import defpackage.ym;
import kotlin.Metadata;
/* compiled from: NotificationSender.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lv27;", "Lym$d;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: w27  reason: default package */
/* loaded from: classes4.dex */
public final class w27 {

    /* compiled from: NotificationSender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w27$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[v27.values().length];
            try {
                iArr[v27.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ym.d a(v27 v27Var) {
        z65.h(v27Var, "<this>");
        if (a.$EnumSwitchMapping$0[v27Var.ordinal()] == 1) {
            return ym.d.o;
        }
        return ym.d.k;
    }
}
