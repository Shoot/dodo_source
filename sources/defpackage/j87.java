package defpackage;

import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: OnInitialDataReceived.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, d2 = {"Lx56;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "getInitialDataResult", "Ljx2;", "deliveryLocation", "a", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: j87  reason: default package */
/* loaded from: classes2.dex */
public final class j87 {

    /* compiled from: OnInitialDataReceived.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j87$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f9.values().length];
            try {
                iArr[f9.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final x56 a(x56 x56Var, e.b bVar, jx2 jx2Var) {
        z65.h(x56Var, "<this>");
        z65.h(bVar, "getInitialDataResult");
        z65.h(jx2Var, "deliveryLocation");
        if (a.$EnumSwitchMapping$0[x56Var.u().ordinal()] == 1) {
            if (bVar instanceof e.b.c) {
                e.b.c cVar = (e.b.c) bVar;
                return y56.o(x56Var, cVar.a(), cVar.b(), jx2Var);
            } else if (bVar instanceof e.b.a) {
                return y56.l(x56Var);
            } else {
                if (bVar instanceof e.b.C0147b) {
                    return y56.l(x56Var);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return x56Var;
    }
}
