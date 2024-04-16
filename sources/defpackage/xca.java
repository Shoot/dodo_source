package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Serializer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lxca;", "T", "", "Ljava/io/InputStream;", "input", "a", "(Ljava/io/InputStream;Lcv1;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", c.a, "(Ljava/lang/Object;Ljava/io/OutputStream;Lcv1;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "defaultValue", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: xca  reason: default package */
/* loaded from: classes.dex */
public interface xca<T> {
    Object a(InputStream inputStream, cv1<? super T> cv1Var);

    T b();

    Object c(T t, OutputStream outputStream, cv1<? super Unit> cv1Var);
}
