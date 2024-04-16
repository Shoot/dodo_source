package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ClearCartDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "Lkotlin/Function0;", "", "onOkPressed", "onCancelPressed", c.a, "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: x81  reason: default package */
/* loaded from: classes.dex */
public final class x81 {
    public static final void c(Context context, final Function0<Unit> function0, final Function0<Unit> function02) {
        z65.h(context, "<this>");
        z65.h(function0, "onOkPressed");
        z65.h(function02, "onCancelPressed");
        new AlertDialog.Builder(context).setCancelable(false).setTitle(o09.selectlocation_cart_will_be_cleared_title).setMessage(o09.selectlocation_cart_will_be_cleared_message).setPositiveButton(o09.selectlocation_cart_will_be_cleared_ok_button, new DialogInterface.OnClickListener() { // from class: t81
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                x81.d(Function0.this, dialogInterface, i);
            }
        }).setNegativeButton(o09.selectlocation_cart_will_be_cleared_cancel_button, new DialogInterface.OnClickListener() { // from class: v81
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                x81.e(Function0.this, dialogInterface, i);
            }
        }).show();
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
