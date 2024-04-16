package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MonitoringMapper.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¨\u0006\u0014"}, d2 = {"Lfo6;", "", "", "zonedDateTime", "message", "Lcloud/mindbox/mobile_sdk/monitoring/data/room/entities/MonitoringEntity;", "a", "", "logs", "Lax5;", "b", "monitoringEntity", DateTokenConverter.CONVERTER_KEY, "monitoringStatus", "requestId", "monitoringEntityList", "Ldx5;", c.a, "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fo6  reason: default package */
/* loaded from: classes.dex */
public final class fo6 {
    public final MonitoringEntity a(String str, String str2) {
        z65.h(str, "zonedDateTime");
        z65.h(str2, "message");
        return new MonitoringEntity(0L, str, str2, 1, null);
    }

    public final List<ax5> b(List<MonitoringEntity> list) {
        int w;
        z65.h(list, "logs");
        List<MonitoringEntity> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (MonitoringEntity monitoringEntity : list2) {
            arrayList.add(d(monitoringEntity));
        }
        return arrayList;
    }

    public final dx5 c(String str, String str2, List<ax5> list) {
        z65.h(str, "monitoringStatus");
        z65.h(str2, "requestId");
        z65.h(list, "monitoringEntityList");
        dx5 dx5Var = new dx5(str, str2, new ArrayList());
        for (ax5 ax5Var : list) {
            List<String> content = dx5Var.getContent();
            content.add(ax5Var.b() + ' ' + ax5Var.a());
        }
        return dx5Var;
    }

    public final ax5 d(MonitoringEntity monitoringEntity) {
        z65.h(monitoringEntity, "monitoringEntity");
        return new ax5(vn3.e(monitoringEntity.c()), monitoringEntity.b());
    }
}
