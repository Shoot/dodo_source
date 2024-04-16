package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
import androidx.preference.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
/* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
@Deprecated
/* renamed from: zh8  reason: default package */
/* loaded from: classes.dex */
public class zh8 extends o {
    final RecyclerView f;
    final s2 g;
    final s2 h;

    /* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
    /* renamed from: zh8$a */
    /* loaded from: classes.dex */
    class a extends s2 {
        a() {
        }

        @Override // defpackage.s2
        public void g(View view, d4 d4Var) {
            Preference l;
            zh8.this.g.g(view, d4Var);
            int childAdapterPosition = zh8.this.f.getChildAdapterPosition(view);
            RecyclerView.h adapter = zh8.this.f.getAdapter();
            if (!(adapter instanceof e) || (l = ((e) adapter).l(childAdapterPosition)) == null) {
                return;
            }
            l.h0(d4Var);
        }

        @Override // defpackage.s2
        public boolean j(View view, int i, Bundle bundle) {
            return zh8.this.g.j(view, i, bundle);
        }
    }

    public zh8(RecyclerView recyclerView) {
        super(recyclerView);
        this.g = super.n();
        this.h = new a();
        this.f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.o
    @NonNull
    public s2 n() {
        return this.h;
    }
}
