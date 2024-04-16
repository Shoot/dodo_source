package kotlin.text;

import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
/* compiled from: MatchResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/text/MatchResult;", "", StatisticManager.NEXT, "Lkotlin/ranges/IntRange;", "b", "()Lkotlin/ranges/IntRange;", "range", "", "getValue", "()Ljava/lang/String;", "value", "Lt96;", c.a, "()Lt96;", "groups", "", "a", "()Ljava/util/List;", "groupValues", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface MatchResult {
    List<String> a();

    IntRange b();

    t96 c();

    String getValue();

    MatchResult next();
}
