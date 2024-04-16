package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: MonitoringValidator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lko6;", "", "Lyw5;", "logRequest", "", e.a, "a", "b", "f", c.a, "Lcloud/mindbox/mobile_sdk/monitoring/data/room/entities/MonitoringEntity;", "monitoringEntity", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ko6  reason: default package */
/* loaded from: classes.dex */
public final class ko6 {
    private final boolean a(yw5 yw5Var) {
        boolean z;
        boolean y;
        String deviceId = yw5Var.getDeviceId();
        if (deviceId != null) {
            y = l0b.y(deviceId);
            if (!y) {
                z = false;
                return !z;
            }
        }
        z = true;
        return !z;
    }

    private final boolean b(yw5 yw5Var) {
        boolean y;
        ddc P = es5.R0("1970-01-01T00:00:00", an2.h("yyyy-MM-dd'T'HH:mm:ss")).P(wcc.h);
        String from = yw5Var.getFrom();
        if (from != null) {
            y = l0b.y(from);
            if (!y && !z65.c(vn3.c(yw5Var.getFrom()), P)) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(yw5 yw5Var) {
        boolean z;
        boolean y;
        String requestId = yw5Var.getRequestId();
        if (requestId != null) {
            y = l0b.y(requestId);
            if (!y) {
                z = false;
                return !z;
            }
        }
        z = true;
        return !z;
    }

    private final boolean f(yw5 yw5Var) {
        boolean y;
        ddc P = es5.R0("1970-01-01T00:00:00", an2.h("yyyy-MM-dd'T'HH:mm:ss")).P(wcc.h);
        String to = yw5Var.getTo();
        if (to != null) {
            y = l0b.y(to);
            if (!y && !z65.c(vn3.c(yw5Var.getTo()), P)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(yw5 yw5Var) {
        z65.h(yw5Var, "logRequest");
        if (e(yw5Var) && a(yw5Var) && b(yw5Var) && f(yw5Var)) {
            return true;
        }
        return false;
    }

    public final boolean d(MonitoringEntity monitoringEntity) {
        z65.h(monitoringEntity, "monitoringEntity");
        return !z65.c(vn3.e(monitoringEntity.c()), es5.R0("1970-01-01T00:00:00", an2.h("yyyy-MM-dd'T'HH:mm:ss")).P(wcc.h));
    }
}
