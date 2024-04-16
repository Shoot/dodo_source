package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.a;
import kotlin.Metadata;
/* compiled from: GooglePlayServicesHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Ljh4;", "Lih4;", "", "a", "", "getStatusCode", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/android/gms/common/a;", "b", "Lcom/google/android/gms/common/a;", "googleApiAvailability", "<init>", "(Landroid/content/Context;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jh4  reason: default package */
/* loaded from: classes4.dex */
public final class jh4 implements ih4 {
    private final Context a;
    private final a b;

    public jh4(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
        a m = a.m();
        z65.g(m, "getInstance(...)");
        this.b = m;
    }

    @Override // defpackage.ih4
    public boolean a() {
        if (this.b.g(this.a) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ih4
    public int getStatusCode() {
        return this.b.g(this.a);
    }
}
