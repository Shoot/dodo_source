package defpackage;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;
/* compiled from: AutofillCallback.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Lh40;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "Landroid/view/View;", "view", "", "virtualId", "event", "", "onAutofillEvent", "Lke;", "autofill", "a", "b", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h40  reason: default package */
/* loaded from: classes.dex */
public final class h40 extends AutofillManager.AutofillCallback {
    public static final h40 a = new h40();

    private h40() {
    }

    public final void a(ke keVar) {
        z65.h(keVar, "autofill");
        keVar.a().registerCallback(e40.a(this));
    }

    public final void b(ke keVar) {
        z65.h(keVar, "autofill");
        keVar.a().unregisterCallback(e40.a(this));
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i, int i2) {
        String str;
        z65.h(view, "view");
        super.onAutofillEvent(view, i, i2);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }
}
