package com.facebook.flipper.plugins.uidebugger.common;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.plugins.uidebugger.common.InspectableValue;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EnumMapping.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001a*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u0010J\u0014\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\t2\b\b\u0002\u0010\r\u001a\u00020\fJ#\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/common/EnumMapping;", "T", "", "", Action.KEY_ATTRIBUTE, "value", "", "put", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue;", "get", "(Ljava/lang/Object;)Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue;", "", "mutable", "(Ljava/lang/Object;Z)Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue;", Image.TYPE_SMALL, "(Ljava/lang/String;)Ljava/lang/Object;", "toPicker", "currentValue", "defaultKey", "Ljava/lang/String;", "Llr;", "map", "Llr;", "<init>", "(Ljava/lang/String;)V", "Companion", "android_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class EnumMapping<T> {
    public static final Companion Companion = new Companion(null);
    private final String defaultKey;
    private final lr<String, T> map;

    /* compiled from: EnumMapping.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\b\u001a\u00020\u0004\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/common/EnumMapping$Companion;", "", "T", "Lwka;", "", "mapping", "defaultKey", "currentValue", "findKeyForValue", "(Lwka;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> String findKeyForValue(wka<String, T> wkaVar, String str, T t) {
            z65.h(wkaVar, "mapping");
            z65.h(str, "defaultKey");
            int size = wkaVar.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (z65.c(wkaVar.o(i), t)) {
                        String k = wkaVar.k(i);
                        z65.g(k, "mapping.keyAt(i)");
                        return k;
                    } else if (i == size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            return str;
        }
    }

    public EnumMapping(String str) {
        z65.h(str, "defaultKey");
        this.defaultKey = str;
        this.map = new lr<>();
    }

    public static /* synthetic */ InspectableValue get$default(EnumMapping enumMapping, Object obj, boolean z, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return enumMapping.get(obj, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
    }

    public static /* synthetic */ InspectableValue toPicker$default(EnumMapping enumMapping, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return enumMapping.toPicker(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPicker");
    }

    public final InspectableValue<String> get(T t) {
        return get(t, true);
    }

    public final void put(String str, T t) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        this.map.put(str, t);
    }

    public final InspectableValue<?> toPicker(boolean z) {
        if (z) {
            InspectableValue.Companion companion = InspectableValue.Companion;
            InspectableValue.Type<InspectableValue.Picker> picker = InspectableValue.Type.Companion.getPicker();
            Set<String> keySet = this.map.keySet();
            z65.g(keySet, "map.keys");
            return companion.mutable(picker, new InspectableValue.Picker(keySet, this.defaultKey));
        }
        return InspectableValue.Companion.immutable(InspectableValue.Type.Companion.getEnum(), this.defaultKey);
    }

    public static /* synthetic */ InspectableValue toPicker$default(EnumMapping enumMapping, Object obj, boolean z, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return enumMapping.toPicker(obj, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPicker");
    }

    public final InspectableValue<String> get(T t, boolean z) {
        String findKeyForValue = Companion.findKeyForValue(this.map, this.defaultKey, t);
        if (z) {
            return InspectableValue.Companion.mutable(InspectableValue.Type.Companion.getEnum(), findKeyForValue);
        }
        return InspectableValue.Companion.immutable(InspectableValue.Type.Companion.getEnum(), findKeyForValue);
    }

    public final T get(String str) {
        z65.h(str, Image.TYPE_SMALL);
        if (this.map.containsKey(str)) {
            return this.map.get(str);
        }
        return this.map.get(this.defaultKey);
    }

    public final InspectableValue<?> toPicker(T t, boolean z) {
        String findKeyForValue = Companion.findKeyForValue(this.map, this.defaultKey, t);
        if (z) {
            InspectableValue.Companion companion = InspectableValue.Companion;
            InspectableValue.Type<InspectableValue.Picker> picker = InspectableValue.Type.Companion.getPicker();
            Set<String> keySet = this.map.keySet();
            z65.g(keySet, "map.keys");
            return companion.mutable(picker, new InspectableValue.Picker(keySet, findKeyForValue));
        }
        return InspectableValue.Companion.immutable(InspectableValue.Type.Companion.getEnum(), findKeyForValue);
    }
}
