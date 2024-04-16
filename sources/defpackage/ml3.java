package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.models.Event;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: EventsDao.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H'J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH'J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\r\u001a\u00020\u0006H'¨\u0006\u000e"}, d2 = {"Lml3;", "", "", "Lcloud/mindbox/mobile_sdk/models/Event;", "getAll", "event", "", c.a, "", "transactionId", "a", "events", DateTokenConverter.CONVERTER_KEY, "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ml3  reason: default package */
/* loaded from: classes.dex */
public interface ml3 {
    void a(String str);

    void b();

    void c(Event event);

    void d(List<Event> list);

    List<Event> getAll();
}
