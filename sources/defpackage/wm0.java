package defpackage;

import androidx.compose.ui.focus.d;
import androidx.compose.ui.focus.e;
import androidx.compose.ui.focus.g;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: NodeKind.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lwm0;", "Landroidx/compose/ui/focus/e;", "", "l", "", Image.TYPE_MEDIUM, "b", "Ljava/lang/Boolean;", "canFocusValue", "value", "j", "()Z", Image.TYPE_HIGH, "(Z)V", "canFocus", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wm0  reason: default package */
/* loaded from: classes.dex */
final class wm0 implements e {
    public static final wm0 a = new wm0();
    private static Boolean b;

    private wm0() {
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ g a() {
        return d.f(this);
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ g b() {
        return d.j(this);
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ Function1 c() {
        return d.d(this);
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ g d() {
        return d.i(this);
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ g e() {
        return d.e(this);
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ g f() {
        return d.b(this);
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ g g() {
        return d.a(this);
    }

    @Override // androidx.compose.ui.focus.e
    public void h(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ Function1 i() {
        return d.c(this);
    }

    @Override // androidx.compose.ui.focus.e
    public boolean j() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ g k() {
        return d.g(this);
    }

    public final boolean l() {
        if (b != null) {
            return true;
        }
        return false;
    }

    public final void m() {
        b = null;
    }

    @Override // androidx.compose.ui.focus.e
    public /* synthetic */ g u() {
        return d.h(this);
    }
}
