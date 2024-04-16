package defpackage;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.fga;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.b;
/* compiled from: LocalOverrideSettings.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\nR\u001f\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lfs5;", "Lfga;", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "a", "Landroid/os/Bundle;", "getMetadata$annotations", "()V", "metadata", "", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/a;", c.a, "()Lkotlin/time/a;", "sessionRestartTimeout", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Double;", "samplingRate", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: fs5  reason: default package */
/* loaded from: classes2.dex */
public final class fs5 implements fga {
    private static final a b = new a(null);
    private final Bundle a;

    /* compiled from: LocalOverrideSettings.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lfs5$a;", "", "", "SAMPLING_RATE", "Ljava/lang/String;", "SESSIONS_ENABLED", "SESSION_RESTART_TIMEOUT", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: fs5$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public fs5(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // defpackage.fga
    public Boolean a() {
        if (this.a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // defpackage.fga
    public Object b(cv1<? super Unit> cv1Var) {
        return fga.a.a(this, cv1Var);
    }

    @Override // defpackage.fga
    public kotlin.time.a c() {
        if (this.a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return kotlin.time.a.g(b.h(this.a.getInt("firebase_sessions_sessions_restart_timeout"), l93.e));
        }
        return null;
    }

    @Override // defpackage.fga
    public Double d() {
        if (this.a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
