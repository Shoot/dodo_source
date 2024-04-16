package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
/* compiled from: ViewInflater.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Li07;", "Lkzb;", "", "viewLayoutId", "Landroid/view/View;", "a", "Landroid/view/ViewGroup;", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "b", "Landroid/view/LayoutInflater;", "layoutInflater", "<init>", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i07  reason: default package */
/* loaded from: classes.dex */
public final class i07 implements kzb {
    private final ViewGroup a;
    private final LayoutInflater b;

    public i07(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        z65.h(viewGroup, "parentView");
        z65.h(layoutInflater, "layoutInflater");
        this.a = viewGroup;
        this.b = layoutInflater;
    }

    @Override // defpackage.kzb
    public View a(int i) {
        View inflate = this.b.inflate(i, this.a, false);
        z65.g(inflate, "inflate(...)");
        return inflate;
    }
}
