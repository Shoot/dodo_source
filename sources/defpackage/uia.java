package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ShoppingCartFragmentWithInfiniteUpsell.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Luia;", "Ltia;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "ui", "<init>", "()V", "t5", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uia  reason: default package */
/* loaded from: classes2.dex */
public final class uia extends tia {
    public static final a t5 = new a(null);

    /* compiled from: ShoppingCartFragmentWithInfiniteUpsell.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Luia$a;", "", "Luia;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uia$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final uia a() {
            return new uia();
        }
    }

    @Override // defpackage.tia
    public View ui(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        z65.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(gz8.fragment_shopping_cart_with_infinite_upsell, viewGroup, false);
        z65.g(inflate, "inflate(...)");
        return inflate;
    }
}
