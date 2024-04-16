package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: DesignSystemFragment.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Li13;", "Lf70;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "<init>", "()V", c.a, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: i13  reason: default package */
/* loaded from: classes4.dex */
public final class i13 extends f70 {
    public static final a c = new a(null);

    /* compiled from: DesignSystemFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Li13$a;", "", "Li13;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i13$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i13 a() {
            return new i13();
        }
    }

    public i13() {
        super(R.layout.fragment_design_system);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ph(i13 i13Var, View view) {
        z65.h(i13Var, "this$0");
        i13Var.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qh(i13 i13Var, View view) {
        z65.h(i13Var, "this$0");
        i13Var.requireActivity().getSupportFragmentManager().p().u(R.id.main_fragment_container, epb.q.a()).i("typography").k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rh(i13 i13Var, View view) {
        z65.h(i13Var, "this$0");
        i13Var.requireActivity().getSupportFragmentManager().p().u(R.id.main_fragment_container, e13.g.a()).i("buttons").k();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        ((Toolbar) view.findViewById(R.id.design_system_toolbar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: f13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i13.ph(i13.this, view2);
            }
        });
        ((TextView) view.findViewById(R.id.design_system_typography_item)).setOnClickListener(new View.OnClickListener() { // from class: g13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i13.qh(i13.this, view2);
            }
        });
        ((TextView) view.findViewById(R.id.design_system_buttons_item)).setOnClickListener(new View.OnClickListener() { // from class: h13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i13.rh(i13.this, view2);
            }
        });
    }
}
