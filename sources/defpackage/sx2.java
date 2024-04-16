package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: DeliveryLocationDetailsInteractor.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lsx2;", "", "Lqw1;", MessageAttributes.COORDINATES, "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", DateTokenConverter.CONVERTER_KEY, "Loz3;", "", "Lg7;", "f", "()Loz3;", "oldFields", "Lnv5;", e.a, "newFields", "Lkua;", "", c.a, "()Lkua;", "currentLocalityId", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: sx2  reason: default package */
/* loaded from: classes4.dex */
public interface sx2 {
    kua<String> c();

    wx<Unit> d(qw1 qw1Var);

    oz3<nv5> e();

    oz3<List<g7>> f();
}
