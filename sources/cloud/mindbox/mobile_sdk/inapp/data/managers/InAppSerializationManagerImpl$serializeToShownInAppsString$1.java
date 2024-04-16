package cloud.mindbox.mobile_sdk.inapp.data.managers;

import com.google.gson.reflect.TypeToken;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: InAppSerializationManagerImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class InAppSerializationManagerImpl$serializeToShownInAppsString$1 extends ej5 implements Function0<String> {
    final /* synthetic */ InAppSerializationManagerImpl a;
    final /* synthetic */ Set<String> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppSerializationManagerImpl$serializeToShownInAppsString$1(InAppSerializationManagerImpl inAppSerializationManagerImpl, Set<String> set) {
        super(0);
        this.a = inAppSerializationManagerImpl;
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a */
    public final String invoke() {
        String u = this.a.a.u(this.b, new TypeToken<HashSet<String>>() { // from class: cloud.mindbox.mobile_sdk.inapp.data.managers.InAppSerializationManagerImpl$serializeToShownInAppsString$1.1
        }.getType());
        z65.g(u, "gson.toJson(shownInApps,…shSet<String>>() {}.type)");
        return u;
    }
}
