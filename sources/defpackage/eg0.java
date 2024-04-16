package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.m;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: BringIntoViewResponder.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¨\u0006\u0006"}, d2 = {"Lmo1;", "Lyf0;", "b", "Lk99;", "Landroid/graphics/Rect;", c.a, "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: eg0  reason: default package */
/* loaded from: classes.dex */
public final class eg0 {

    /* compiled from: BringIntoViewResponder.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, d2 = {"Lom5;", "childCoordinates", "Lkotlin/Function0;", "Lk99;", "boundsProvider", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eg0$a */
    /* loaded from: classes.dex */
    static final class a implements yf0 {
        final /* synthetic */ mo1 a;

        a(mo1 mo1Var) {
            this.a = mo1Var;
        }

        @Override // defpackage.yf0
        public final Object a(om5 om5Var, Function0<k99> function0, cv1<? super Unit> cv1Var) {
            k99 k99Var;
            View view = (View) no1.a(this.a, m.i());
            long e = pm5.e(om5Var);
            k99 invoke = function0.invoke();
            if (invoke != null) {
                k99Var = invoke.n(e);
            } else {
                k99Var = null;
            }
            if (k99Var != null) {
                view.requestRectangleOnScreen(eg0.c(k99Var), false);
            }
            return Unit.a;
        }
    }

    public static final yf0 b(mo1 mo1Var) {
        z65.h(mo1Var, "<this>");
        return new a(mo1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(k99 k99Var) {
        return new Rect((int) k99Var.f(), (int) k99Var.i(), (int) k99Var.g(), (int) k99Var.c());
    }
}
