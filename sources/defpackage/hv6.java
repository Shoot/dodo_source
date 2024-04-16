package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: NeedUpdateDialog.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lhv6;", "Landroidx/fragment/app/c;", "Landroid/view/View;", "hh", "", "jh", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "btnConfirm", "<init>", "()V", c.a, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hv6  reason: default package */
/* loaded from: classes4.dex */
public final class hv6 extends androidx.fragment.app.c {
    public static final a c = new a(null);
    private Button b;

    /* compiled from: NeedUpdateDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lhv6$a;", "", "Lhv6;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hv6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hv6 a() {
            return new hv6();
        }
    }

    private final View hh() {
        Button button = null;
        View inflate = requireActivity().getLayoutInflater().inflate(R.layout.need_update_dialog, (ViewGroup) null, true);
        View findViewById = inflate.findViewById(R.id.confirm);
        z65.g(findViewById, "findViewById(...)");
        Button button2 = (Button) findViewById;
        this.b = button2;
        if (button2 == null) {
            z65.z("btnConfirm");
        } else {
            button = button2;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: gv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hv6.ih(hv6.this, view);
            }
        });
        z65.e(inflate);
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ih(hv6 hv6Var, View view) {
        z65.h(hv6Var, "this$0");
        hv6Var.jh();
    }

    private final void jh() {
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.d(requireContext);
    }

    @Override // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        AlertDialog create = new AlertDialog.Builder(requireContext()).setView(hh()).create();
        z65.g(create, "create(...)");
        return create;
    }
}
