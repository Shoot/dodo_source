package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.mindbox.model.RegisterMindbox;
/* compiled from: MindboxSdkRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lwk6;", "", "", "baseUrl", "a", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "Landroid/content/SharedPreferences;", "prefs", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lcom/google/gson/Gson;)V", c.a, "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wk6  reason: default package */
/* loaded from: classes4.dex */
public final class wk6 {
    public static final a c = new a(null);
    private final Gson a;
    private final SharedPreferences b;

    /* compiled from: MindboxSdkRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lwk6$a;", "", "", "FIELD_DEVICE_UUID", "Ljava/lang/String;", "MINDBOX_PREFERENCES", "<init>", "()V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wk6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public wk6(Context context, Gson gson) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(gson, "gson");
        this.a = gson;
        this.b = context.getSharedPreferences("mindbox", 0);
    }

    public final String a(String str) {
        String installationId;
        z65.h(str, "baseUrl");
        RegisterMindbox registerMindbox = (RegisterMindbox) this.a.k(this.b.getString(str, ""), RegisterMindbox.class);
        if (registerMindbox == null || (installationId = registerMindbox.getInstallationId()) == null) {
            return "";
        }
        return installationId;
    }
}
