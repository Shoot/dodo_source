package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B-\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b6\u00107J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007J,\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00070\u0013R\u0016\u0010\u0011\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00070\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR/\u0010#\u001a\u0004\u0018\u00010\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00105\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010 ¨\u00068"}, d2 = {"Lsd8;", "Lpd8;", "Lcn6;", "Lvm6;", "", "w", "parent", "", "t", "y", "x", "Ldn6;", Action.SCOPE_ATTRIBUTE, "a", "A", "o", Image.TYPE_SMALL, RemoteMessageConst.Notification.ICON, "overrideDescendants", "Lkotlin/Function1;", "onSetIcon", "B", c.a, "Lpd8;", DateTokenConverter.CONVERTER_KEY, "Z", e.a, "Lkotlin/jvm/functions/Function1;", "<set-?>", "f", "Ler6;", "u", "()Lsd8;", "z", "(Lsd8;)V", "parentInfo", "g", "isPaused", "()Z", "setPaused", "(Z)V", Image.TYPE_HIGH, "isHovered", "setHovered", "Lyr8;", "i", "Lyr8;", "getKey", "()Lyr8;", Action.KEY_ATTRIBUTE, "j", "Lsd8;", "v", "value", "<init>", "(Lpd8;ZLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sd8  reason: default package */
/* loaded from: classes.dex */
public final class sd8 implements pd8, cn6<sd8>, vm6 {
    private pd8 c;
    private boolean d;
    private Function1<? super pd8, Unit> e;
    private final er6 f;
    private boolean g;
    private boolean h;
    private final yr8<sd8> i;
    private final sd8 j;

    public sd8(pd8 pd8Var, boolean z, Function1<? super pd8, Unit> function1) {
        er6 c;
        yr8<sd8> yr8Var;
        z65.h(pd8Var, RemoteMessageConst.Notification.ICON);
        z65.h(function1, "onSetIcon");
        this.c = pd8Var;
        this.d = z;
        this.e = function1;
        c = tpa.c(null, null, 2, null);
        this.f = c;
        yr8Var = rd8.a;
        this.i = yr8Var;
        this.j = this;
    }

    private final void t(sd8 sd8Var) {
        if (this.h) {
            if (sd8Var == null) {
                this.e.invoke(null);
            } else {
                sd8Var.y();
            }
        }
        this.h = false;
    }

    private final sd8 u() {
        return (sd8) this.f.getValue();
    }

    private final boolean w() {
        if (this.d) {
            return true;
        }
        sd8 u = u();
        if (u != null && u.w()) {
            return true;
        }
        return false;
    }

    private final void x() {
        this.g = true;
        sd8 u = u();
        if (u != null) {
            u.x();
        }
    }

    private final void y() {
        this.g = false;
        if (this.h) {
            this.e.invoke(this.c);
        } else if (u() == null) {
            this.e.invoke(null);
        } else {
            sd8 u = u();
            if (u != null) {
                u.y();
            }
        }
    }

    private final void z(sd8 sd8Var) {
        this.f.setValue(sd8Var);
    }

    public final boolean A() {
        sd8 u = u();
        if (u != null && u.w()) {
            return false;
        }
        return true;
    }

    public final void B(pd8 pd8Var, boolean z, Function1<? super pd8, Unit> function1) {
        z65.h(pd8Var, RemoteMessageConst.Notification.ICON);
        z65.h(function1, "onSetIcon");
        if (!z65.c(this.c, pd8Var) && this.h && !this.g) {
            function1.invoke(pd8Var);
        }
        this.c = pd8Var;
        this.d = z;
        this.e = function1;
    }

    @Override // defpackage.vm6
    public void a(dn6 dn6Var) {
        yr8 yr8Var;
        z65.h(dn6Var, Action.SCOPE_ATTRIBUTE);
        sd8 u = u();
        yr8Var = rd8.a;
        z((sd8) dn6Var.E(yr8Var));
        if (u != null && u() == null) {
            t(u);
            this.e = a.a;
        }
    }

    @Override // defpackage.sm6
    public /* synthetic */ sm6 f(sm6 sm6Var) {
        return rm6.a(this, sm6Var);
    }

    @Override // defpackage.cn6
    public yr8<sd8> getKey() {
        return this.i;
    }

    @Override // defpackage.sm6
    public /* synthetic */ Object h(Object obj, Function2 function2) {
        return tm6.b(this, obj, function2);
    }

    @Override // defpackage.sm6
    public /* synthetic */ boolean i(Function1 function1) {
        return tm6.a(this, function1);
    }

    public final void o() {
        this.h = true;
        if (!this.g) {
            sd8 u = u();
            if (u != null) {
                u.x();
            }
            this.e.invoke(this.c);
        }
    }

    public final void s() {
        t(u());
    }

    @Override // defpackage.cn6
    /* renamed from: v */
    public sd8 getValue() {
        return this.j;
    }

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpd8;", "it", "", "a", "(Lpd8;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sd8$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<pd8, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(pd8 pd8Var) {
            a(pd8Var);
            return Unit.a;
        }

        public final void a(pd8 pd8Var) {
        }
    }
}
