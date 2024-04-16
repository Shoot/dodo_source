package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: co9  reason: default package */
/* loaded from: classes2.dex */
public final class co9 {
    private static co9 b;
    private static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    private RootTelemetryConfiguration a;

    private co9() {
    }

    @NonNull
    public static synchronized co9 b() {
        co9 co9Var;
        synchronized (co9.class) {
            try {
                if (b == null) {
                    b = new co9();
                }
                co9Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return co9Var;
    }

    public RootTelemetryConfiguration a() {
        return this.a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 != null && rootTelemetryConfiguration2.u() >= rootTelemetryConfiguration.u()) {
            return;
        }
        this.a = rootTelemetryConfiguration;
    }
}
