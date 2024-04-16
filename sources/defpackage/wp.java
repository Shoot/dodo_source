package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: Applier.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0003H&J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J\b\u0010\u0015\u001a\u00020\u0003H&R\u0014\u0010\u0018\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lwp;", "N", "", "", Image.TYPE_HIGH, e.a, "node", "g", "(Ljava/lang/Object;)V", "i", "", "index", "instance", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/Object;)V", "f", "count", "a", RemoteMessageConst.FROM, RemoteMessageConst.TO, c.a, "clear", "b", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wp  reason: default package */
/* loaded from: classes.dex */
public interface wp<N> {
    void a(int i, int i2);

    N b();

    void c(int i, int i2, int i3);

    void clear();

    void d(int i, N n);

    void e();

    void f(int i, N n);

    void g(N n);

    void h();

    void i();
}
