package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {
    private final lr a;

    public AvailabilityException(@NonNull lr lrVar) {
        this.a = lrVar;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (mm mmVar : this.a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) gh8.j((ConnectionResult) this.a.get(mmVar));
            z &= !connectionResult.u();
            String b = mmVar.b();
            String valueOf = String.valueOf(connectionResult);
            arrayList.add(b + ": " + valueOf);
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
