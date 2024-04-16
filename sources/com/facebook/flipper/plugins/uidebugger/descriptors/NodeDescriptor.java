package com.facebook.flipper.plugins.uidebugger.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: NodeDescriptor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J#\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&¢\u0006\u0002\u0010\bJ+\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH&¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0004H&¨\u0006\u0012"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/NodeDescriptor;", "T", "", "getChildren", "", "node", "children", "", "(Ljava/lang/Object;Ljava/util/List;)V", "getData", "builder", "", "", "(Ljava/lang/Object;Ljava/util/Map;)V", "getId", "(Ljava/lang/Object;)Ljava/lang/String;", "getName", "init", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NodeDescriptor<T> {
    void getChildren(T t, List<Object> list);

    void getData(T t, Map<String, Object> map);

    String getId(T t);

    String getName(T t);

    void init();
}
