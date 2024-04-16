package com.dodopizza.loyalty.menu.view;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ZoomCenterCardLayoutManager.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B!\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006R\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\f\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006R\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/loyalty/menu/view/ZoomCenterCardLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "U2", "", "dx", "Landroidx/recyclerview/widget/RecyclerView$w;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "E1", "e1", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "orientation", "", "reverseLayout", "<init>", "(Landroid/content/Context;IZ)V", "U4", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ZoomCenterCardLayoutManager extends LinearLayoutManager {
    public static final a U4 = new a(null);

    /* compiled from: ZoomCenterCardLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/loyalty/menu/view/ZoomCenterCardLayoutManager$a;", "", "", "SHRINK_AMOUNT", "F", "SHRINK_DISTANCE", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ZoomCenterCardLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    private final void U2() {
        float u0 = u0() / 2.0f;
        float f = 0.75f * u0;
        int T = T();
        for (int i = 0; i < T; i++) {
            View S = S(i);
            if (S != null) {
                float min = 1.0f + (((-0.19999999f) * (Math.min(f, Math.abs(u0 - ((d0(S) + a0(S)) / 2.0f))) - 0.0f)) / (f - 0.0f));
                if (!Float.isNaN(min)) {
                    S.setScaleX(min);
                    S.setScaleY(min);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E1(int i, RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        z65.h(wVar, "recycler");
        z65.h(a0Var, "state");
        int E1 = super.E1(i, wVar, a0Var);
        U2();
        return E1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView.w wVar, RecyclerView.a0 a0Var) {
        z65.h(wVar, "recycler");
        z65.h(a0Var, "state");
        super.e1(wVar, a0Var);
        E1(0, wVar, a0Var);
    }
}
