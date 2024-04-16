package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: lkc  reason: default package */
/* loaded from: classes2.dex */
public abstract class lkc implements DialogInterface.OnClickListener {
    public static lkc b(Activity activity, Intent intent, int i) {
        return new wjc(intent, activity, i);
    }

    public static lkc c(@NonNull kp5 kp5Var, Intent intent, int i) {
        return new kkc(intent, kp5Var, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
