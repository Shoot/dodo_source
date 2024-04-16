package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: FeatureService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\r"}, d2 = {"Lhq3;", "", "", "Lbq3;", "features", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "b", "featureCode", "", "a", "getAll", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hq3  reason: default package */
/* loaded from: classes4.dex */
public interface hq3 {
    boolean a(bq3 bq3Var);

    void b(Collection<? extends bq3> collection, String str);

    Collection<bq3> getAll();
}
