package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: StoriesInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzxa;", "", "", "b", "(Lcv1;)Ljava/lang/Object;", LocalityEntity.FIELD_COUNTRY_CODE, "localityId", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Li15;", "screen", "Lh15;", "a", "(Li15;Lcv1;)Ljava/lang/Object;", "infoStoryId", "", c.a, "(Li15;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zxa  reason: default package */
/* loaded from: classes2.dex */
public interface zxa {
    Object a(i15 i15Var, cv1<? super h15> cv1Var);

    Object b(cv1<? super String> cv1Var);

    Object c(i15 i15Var, String str, cv1<? super Unit> cv1Var);

    Object d(String str, String str2, cv1<? super Collection<String>> cv1Var);
}
