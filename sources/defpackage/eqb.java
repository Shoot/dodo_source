package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
/* compiled from: UnavailableAnalyticsEventLogger.java */
/* renamed from: eqb  reason: default package */
/* loaded from: classes2.dex */
public class eqb implements sc {
    @Override // defpackage.sc
    public void a(@NonNull String str, Bundle bundle) {
        rx5.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
