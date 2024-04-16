package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
/* compiled from: InAppSegmentationRepository.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u000eH&J\b\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0012H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&R\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00158&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lyy4;", "", "", e.a, "(Lcv1;)Ljava/lang/Object;", "Lkotlin/Pair;", "", "product", "b", "(Lkotlin/Pair;Lcv1;)Ljava/lang/Object;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", "Ljm8;", "g", "Lq52;", "status", "a", c.a, "Lfm8;", "f", DateTokenConverter.CONVERTER_KEY, "", "Lr52;", Image.TYPE_HIGH, "Lfx4;", "getUnShownInApps", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "unShownInApps", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yy4  reason: default package */
/* loaded from: classes.dex */
public interface yy4 {
    void a(q52 q52Var);

    Object b(Pair<String, String> pair, cv1<? super Unit> cv1Var);

    q52 c();

    void d(fm8 fm8Var);

    Object e(cv1<? super Unit> cv1Var);

    fm8 f();

    Set<jm8> g(String str);

    List<r52> h();

    void i(List<fx4> list);
}
