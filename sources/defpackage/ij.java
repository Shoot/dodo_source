package defpackage;

import android.view.ViewConfiguration;
import kotlin.Metadata;
/* compiled from: AndroidViewConfiguration.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\b¨\u0006\r"}, d2 = {"Lij;", "Lxyb;", "Landroid/view/ViewConfiguration;", "a", "Landroid/view/ViewConfiguration;", "viewConfiguration", "", "b", "()J", "longPressTimeoutMillis", "doubleTapTimeoutMillis", "<init>", "(Landroid/view/ViewConfiguration;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ij  reason: default package */
/* loaded from: classes.dex */
public final class ij implements xyb {
    private final ViewConfiguration a;

    public ij(ViewConfiguration viewConfiguration) {
        z65.h(viewConfiguration, "viewConfiguration");
        this.a = viewConfiguration;
    }

    @Override // defpackage.xyb
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.xyb
    public long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.xyb
    public /* synthetic */ long c() {
        return wyb.a(this);
    }
}
