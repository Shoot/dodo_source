package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: EncryptionDataConverterRegistry.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lth3;", "Lsh3;", "", "acquirerCode", "Lph3;", "a", "Lqh3;", "Lqh3;", "factory", "", "b", "Ljava/util/Map;", "converters", "<init>", "(Lqh3;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: th3  reason: default package */
/* loaded from: classes2.dex */
public final class th3 implements sh3 {
    private final qh3 a;
    private final Map<String, ph3> b;

    public th3(qh3 qh3Var) {
        z65.h(qh3Var, "factory");
        this.a = qh3Var;
        this.b = new LinkedHashMap();
    }

    @Override // defpackage.sh3
    public ph3 a(String str) {
        z65.h(str, "acquirerCode");
        ph3 ph3Var = this.b.get(str);
        if (ph3Var == null) {
            ph3 a = this.a.a(str);
            this.b.put(str, a);
            return a;
        }
        return ph3Var;
    }
}
