package com.dodopizza.chat.feature.chat;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: NativeChatFeatureDependencies.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/dodopizza/chat/feature/chat/NativeChatFeatureDependencies;", "Ljm1;", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "()Lkx1;", "ioDispatcher", "Lqx1;", "q", "()Lqx1;", "processScope", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf63;", "b", "()Lf63;", "router", "Lgc;", "a", "()Lgc;", "analytics", "Lt52;", Image.TYPE_MEDIUM, "()Lt52;", "customerService", "Lhq3;", c.a, "()Lhq3;", "featureService", "Ley7;", "d0", "()Ley7;", "permissionChecker", "Li00;", "g", "()Li00;", "authorizationState", "Lst6;", "M3", "()Lst6;", "nativeChatMessenger", "Lbu6;", "c2", "()Lbu6;", "nativeChatUserInitializer", "Lbfb;", "X", "()Lbfb;", "threadsLibInitializer", "Lbo;", "x", "()Lbo;", "appInitializationStateProvider", "Lci8;", "G", "()Lci8;", "preferencesAssetsDataSource", "chat_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface NativeChatFeatureDependencies extends jm1 {
    ci8 G();

    st6 M3();

    bfb X();

    gc a();

    f63 b();

    hq3 c();

    bu6 c2();

    kx1 d();

    ey7 d0();

    i00 g();

    Context getContext();

    t52 m();

    qx1 q();

    bo x();
}
