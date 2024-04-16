package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: MonitoringRepository.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0013\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lio6;", "", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "g", "id", "", "f", "Lax5;", "a", "(Lcv1;)Ljava/lang/Object;", "b", "Lddc;", "startTime", "endTime", "", e.a, "(Lddc;Lddc;Lcv1;)Ljava/lang/Object;", "monitoringStatus", "requestId", "logs", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcv1;)Ljava/lang/Object;", "zonedDateTime", "message", c.a, "(Lddc;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: io6  reason: default package */
/* loaded from: classes.dex */
public interface io6 {
    Object a(cv1<? super ax5> cv1Var);

    Object b(cv1<? super ax5> cv1Var);

    Object c(ddc ddcVar, String str, cv1<? super Unit> cv1Var);

    Object d(String str, String str2, List<ax5> list, cv1<? super Unit> cv1Var);

    Object e(ddc ddcVar, ddc ddcVar2, cv1<? super List<ax5>> cv1Var);

    void f(String str);

    HashSet<String> g();
}
