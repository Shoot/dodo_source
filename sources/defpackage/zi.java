package defpackage;

import android.view.ActionMode;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: AndroidTextToolbar.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lzi;", "Lucb;", "Landroid/view/View;", "a", "Landroid/view/View;", "view", "Landroid/view/ActionMode;", "b", "Landroid/view/ActionMode;", "actionMode", "Lh9b;", c.a, "Lh9b;", "textActionModeCallback", "Lvcb;", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Lvcb;", "getStatus", "()Lvcb;", "status", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zi  reason: default package */
/* loaded from: classes.dex */
public final class zi implements ucb {
    private final View a;
    private ActionMode b;
    private final h9b c;
    private vcb d;

    /* compiled from: AndroidTextToolbar.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: zi$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zi.this.b = null;
        }
    }

    public zi(View view) {
        z65.h(view, "view");
        this.a = view;
        this.c = new h9b(new a(), null, null, null, null, null, 62, null);
        this.d = vcb.Hidden;
    }
}
