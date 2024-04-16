package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: AndroidAutofill.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, d2 = {"Lke;", "Lo30;", "Landroid/view/View;", "a", "Landroid/view/View;", c.a, "()Landroid/view/View;", "view", "Ll40;", "b", "Ll40;", "()Ll40;", "autofillTree", "Landroid/view/autofill/AutofillManager;", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "<init>", "(Landroid/view/View;Ll40;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ke  reason: default package */
/* loaded from: classes.dex */
public final class ke implements o30 {
    private final View a;
    private final l40 b;
    private final AutofillManager c;

    public ke(View view, l40 l40Var) {
        Object systemService;
        z65.h(view, "view");
        z65.h(l40Var, "autofillTree");
        this.a = view;
        this.b = l40Var;
        systemService = view.getContext().getSystemService(ge.a());
        AutofillManager a = ie.a(systemService);
        if (a != null) {
            this.c = a;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    public final AutofillManager a() {
        return this.c;
    }

    public final l40 b() {
        return this.b;
    }

    public final View c() {
        return this.a;
    }
}
