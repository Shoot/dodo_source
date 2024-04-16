package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: MonitoringDao.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\bJ\u0013\u0010\u0010\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lzn6;", "", "Lcloud/mindbox/mobile_sdk/monitoring/data/room/entities/MonitoringEntity;", "entity", "", c.a, "(Lcloud/mindbox/mobile_sdk/monitoring/data/room/entities/MonitoringEntity;Lcv1;)Ljava/lang/Object;", e.a, "(Lcv1;)Ljava/lang/Object;", "", "startTime", "endTime", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "a", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zn6  reason: default package */
/* loaded from: classes.dex */
public interface zn6 {
    Object a(cv1<? super MonitoringEntity> cv1Var);

    Object b(cv1<? super MonitoringEntity> cv1Var);

    Object c(MonitoringEntity monitoringEntity, cv1<? super Unit> cv1Var);

    Object d(String str, String str2, cv1<? super List<MonitoringEntity>> cv1Var);

    Object e(cv1<? super Unit> cv1Var);
}
