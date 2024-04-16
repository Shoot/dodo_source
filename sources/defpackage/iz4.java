package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.InAppStoryManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: InAppStoryInitializer.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\fB1\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001c\u0010!\u001a\n \u0007*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Liz4;", "Lhz4;", "", "sdkKey", "", e.a, "Lcom/inappstory/sdk/InAppStoryManager$Builder;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, c.a, "userId", "", "a", "languageCode", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lnz4;", "Lnz4;", "inAppStoryStateProvider", "Lt52;", "Lt52;", "customerService", "Li32;", "Li32;", "currentLocaleProvider", "Lcz4;", "Lcz4;", "inAppStoryCallback", "Lorg/slf4j/Logger;", "f", "Lorg/slf4j/Logger;", "logger", "<init>", "(Landroid/content/Context;Lnz4;Lt52;Li32;Lcz4;)V", "g", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iz4  reason: default package */
/* loaded from: classes2.dex */
public final class iz4 implements hz4 {
    private static final a g = new a(null);
    public static final int h = 8;
    private final Context a;
    private final nz4 b;
    private final t52 c;
    private final i32 d;
    private final cz4 e;
    private final Logger f;

    /* compiled from: InAppStoryInitializer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Liz4$a;", "", "", "LANGUAGE_PLACEHOLDER_KEY", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iz4$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public iz4(Context context, nz4 nz4Var, t52 t52Var, i32 i32Var, cz4 cz4Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(nz4Var, "inAppStoryStateProvider");
        z65.h(t52Var, "customerService");
        z65.h(i32Var, "currentLocaleProvider");
        z65.h(cz4Var, "inAppStoryCallback");
        this.a = context;
        this.b = nz4Var;
        this.c = t52Var;
        this.d = i32Var;
        this.e = cz4Var;
        this.f = LoggerFactory.getLogger("InAppStoryInitializerImpl");
    }

    private final InAppStoryManager.Builder d(String str) {
        return new InAppStoryManager.Builder().context(this.a).apiKey(str);
    }

    private final boolean e(String str) {
        try {
            try {
                InAppStoryManager.Builder d = d(str);
                String i = this.c.f().i();
                String language = this.d.get().getLanguage();
                if (!z65.c(i, "1")) {
                    d.userId(i);
                } else {
                    d.userId("");
                }
                InAppStoryManager create = d.create();
                create.setCallToActionCallback(this.e);
                create.setPlaceholder("language", language);
                InAppStoryManager.setInstance(create);
                this.b.a();
                return true;
            } catch (Exception e) {
                this.f.warn("Can't initialize InAppStoryManager", (Throwable) e);
                this.b.a();
                return false;
            }
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.hz4
    public void a(String str) {
        z65.h(str, "userId");
        InAppStoryManager inAppStoryManager = InAppStoryManager.getInstance();
        if (inAppStoryManager != null) {
            inAppStoryManager.setUserId(str);
        }
    }

    @Override // defpackage.hz4
    public void b(String str) {
        z65.h(str, "languageCode");
        InAppStoryManager inAppStoryManager = InAppStoryManager.getInstance();
        if (inAppStoryManager != null) {
            inAppStoryManager.setPlaceholder("language", str);
        }
    }

    @Override // defpackage.hz4
    public boolean c(String str) {
        z65.h(str, "sdkKey");
        if (this.b.isInitialized().getValue().booleanValue()) {
            return true;
        }
        return e(str);
    }
}
