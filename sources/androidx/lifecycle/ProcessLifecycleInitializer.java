package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.l;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProcessLifecycleInitializer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Ly25;", "Lop5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, com.huawei.hms.opendevice.c.a, "", "Ljava/lang/Class;", "a", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements y25<op5> {
    @Override // defpackage.y25
    public List<Class<? extends y25<?>>> a() {
        List<Class<? extends y25<?>>> l;
        l = kc1.l();
        return l;
    }

    @Override // defpackage.y25
    /* renamed from: c */
    public op5 b(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        androidx.startup.a e = androidx.startup.a.e(context);
        z65.g(e, "getInstance(context)");
        if (e.g(ProcessLifecycleInitializer.class)) {
            f.a(context);
            l.b bVar = l.i;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
