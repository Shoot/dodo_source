package cloud.mindbox.mobile_sdk.inapp.data.managers;

import com.google.gson.reflect.TypeToken;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: InAppSerializationManagerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "a", "()Ljava/util/Set;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class InAppSerializationManagerImpl$deserializeToShownInApps$1 extends ej5 implements Function0<Set<? extends String>> {
    final /* synthetic */ InAppSerializationManagerImpl a;
    final /* synthetic */ String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppSerializationManagerImpl$deserializeToShownInApps$1(InAppSerializationManagerImpl inAppSerializationManagerImpl, String str) {
        super(0);
        this.a = inAppSerializationManagerImpl;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a */
    public final Set<String> invoke() {
        Set<String> e;
        Set<String> set = (Set) this.a.a.l(this.b, new TypeToken<HashSet<String>>() { // from class: cloud.mindbox.mobile_sdk.inapp.data.managers.InAppSerializationManagerImpl$deserializeToShownInApps$1.1
        }.getType());
        if (set == null) {
            e = sfa.e();
            return e;
        }
        return set;
    }
}
