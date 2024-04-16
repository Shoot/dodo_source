package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.b;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.dodopizza.app.R;
/* compiled from: ClearCartDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "Lkotlin/Function0;", "", "onOkPressed", "onCancelPressed", c.a, "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: w81  reason: default package */
/* loaded from: classes4.dex */
public final class w81 {
    public static final void c(Context context, final Function0<Unit> function0, final Function0<Unit> function02) {
        z65.h(context, "<this>");
        z65.h(function0, "onOkPressed");
        z65.h(function02, "onCancelPressed");
        new b.a(context).d(false).r(R.string.selectlocation_cart_will_be_cleared_title).g(R.string.selectlocation_cart_will_be_cleared_message).n(R.string.selectlocation_cart_will_be_cleared_ok_button, new DialogInterface.OnClickListener() { // from class: s81
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                w81.d(Function0.this, dialogInterface, i);
            }
        }).j(R.string.selectlocation_cart_will_be_cleared_cancel_button, new DialogInterface.OnClickListener() { // from class: u81
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                w81.e(Function0.this, dialogInterface, i);
            }
        }).u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0, DialogInterface dialogInterface, int i) {
        z65.h(function0, "$onOkPressed");
        function0.invoke();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function0 function0, DialogInterface dialogInterface, int i) {
        z65.h(function0, "$onCancelPressed");
        function0.invoke();
        dialogInterface.dismiss();
    }
}
