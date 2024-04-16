package defpackage;

import android.app.Notification;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
/* compiled from: ForegroundInfo.java */
/* renamed from: a54  reason: default package */
/* loaded from: classes.dex */
public final class a54 {
    private final int a;
    private final int b;
    private final Notification c;

    public a54(int i, @NonNull Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    @NonNull
    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a54.class != obj.getClass()) {
            return false;
        }
        a54 a54Var = (a54) obj;
        if (this.a != a54Var.a || this.b != a54Var.b) {
            return false;
        }
        return this.c.equals(a54Var.c);
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + CoreConstants.CURLY_RIGHT;
    }
}
