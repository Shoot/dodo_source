package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: KCallable.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J'\u0010\u0006\u001a\u00028\u00002\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u00028\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118&X¦\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00168&X¦\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8&X§\u0004¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b&\u0010\u000f\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b'\u0010%R\u001a\u0010)\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b*\u0010\u000f\u001a\u0004\b)\u0010%R\u001a\u0010+\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b,\u0010\u000f\u001a\u0004\b+\u0010%¨\u0006-"}, d2 = {"Lnd5;", "R", "Lkd5;", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", Action.NAME_ATTRIBUTE, "", "getParameters", "()Ljava/util/List;", "getParameters$annotations", "parameters", "Lne5;", "getReturnType", "()Lne5;", "getReturnType$annotations", "returnType", "getTypeParameters", "getTypeParameters$annotations", "typeParameters", "Lpe5;", "getVisibility", "()Lpe5;", "getVisibility$annotations", RemoteMessageConst.Notification.VISIBILITY, "", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSuspend", "isSuspend$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: nd5  reason: default package */
/* loaded from: classes3.dex */
public interface nd5<R> extends kd5 {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    ne5 getReturnType();

    List<Object> getTypeParameters();

    pe5 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
