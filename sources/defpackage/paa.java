package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SelectionRegistrar.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J-\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H&J=\u0010\u0017\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0005H&R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Lpaa;", "", "Lh9a;", "selectable", "f", "", e.a, "", "b", "Lom5;", "layoutCoordinates", "Ls67;", "startPosition", "Lt9a;", "adjustment", c.a, "(Lom5;JLt9a;)V", "selectableId", "g", "newPosition", "previousPosition", "", "isStartHandle", "a", "(Lom5;JJZLt9a;)Z", Image.TYPE_HIGH, "", "Ls9a;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "subselections", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: paa  reason: default package */
/* loaded from: classes.dex */
public interface paa {
    boolean a(om5 om5Var, long j, long j2, boolean z, t9a t9aVar);

    long b();

    void c(om5 om5Var, long j, t9a t9aVar);

    Map<Long, s9a> d();

    void e(h9a h9aVar);

    h9a f(h9a h9aVar);

    void g(long j);

    void h();
}
