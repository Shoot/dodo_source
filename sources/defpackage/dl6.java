package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import defpackage.yk6;
import kotlin.Metadata;
/* compiled from: MindboxServiceFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Ldl6;", "", "", LocalityEntity.FIELD_COUNTRY_CODE, "countryName", "cityName", "Lcl6;", "a", "Lqj6;", "Lqj6;", "mindboxCredentialsResolver", "Lyk6$a;", "b", "Lyk6$a;", "mindboxSdkServiceImplFactory", "<init>", "(Lqj6;Lyk6$a;)V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dl6  reason: default package */
/* loaded from: classes4.dex */
public final class dl6 {
    private final qj6 a;
    private final yk6.a b;

    public dl6(qj6 qj6Var, yk6.a aVar) {
        z65.h(qj6Var, "mindboxCredentialsResolver");
        z65.h(aVar, "mindboxSdkServiceImplFactory");
        this.a = qj6Var;
        this.b = aVar;
    }

    public final cl6 a(String str, String str2, String str3) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "countryName");
        z65.h(str3, "cityName");
        oj6 a = this.a.a(str);
        if (a == null) {
            return new d07();
        }
        return this.b.a(a, str2, str3);
    }
}
