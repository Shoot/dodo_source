package defpackage;

import android.app.PendingIntent;
import kotlin.Metadata;
/* compiled from: GeoLocationProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lgj9;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/app/PendingIntent;", "a", "Landroid/app/PendingIntent;", "()Landroid/app/PendingIntent;", "pendingIntent", "<init>", "(Landroid/app/PendingIntent;)V", "location_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: gj9  reason: default package */
/* loaded from: classes2.dex */
public final class gj9 {
    private final PendingIntent a;

    public gj9(PendingIntent pendingIntent) {
        z65.h(pendingIntent, "pendingIntent");
        this.a = pendingIntent;
    }

    public final PendingIntent a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof gj9) || !z65.c(this.a, ((gj9) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ResolvableApiException(pendingIntent=" + this.a + ")";
    }
}
