package cloud.mindbox.mobile_sdk.inapp.data.managers;

import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: InAppSerializationManagerImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lcloud/mindbox/mobile_sdk/inapp/data/managers/InAppSerializationManagerImpl;", "Laz4;", "", "inAppId", "b", "", "shownInApps", c.a, "a", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/google/gson/Gson;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InAppSerializationManagerImpl implements az4 {
    private final Gson a;

    /* compiled from: InAppSerializationManagerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String u = InAppSerializationManagerImpl.this.a.u(new zx4(this.b), zx4.class);
            z65.g(u, "gson.toJson(InAppHandleR…andleRequest::class.java)");
            return u;
        }
    }

    public InAppSerializationManagerImpl(Gson gson) {
        z65.h(gson, "gson");
        this.a = gson;
    }

    @Override // defpackage.az4
    public Set<String> a(String str) {
        z65.h(str, "shownInApps");
        return (Set) yx5.a.b(new HashSet(), new InAppSerializationManagerImpl$deserializeToShownInApps$1(this, str));
    }

    @Override // defpackage.az4
    public String b(String str) {
        z65.h(str, "inAppId");
        return (String) yx5.a.b("", new a(str));
    }

    @Override // defpackage.az4
    public String c(Set<String> set) {
        z65.h(set, "shownInApps");
        return (String) yx5.a.b("", new InAppSerializationManagerImpl$serializeToShownInAppsString$1(this, set));
    }
}
